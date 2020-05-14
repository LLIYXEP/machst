<template>
  <section class="s-wide">

    <v-container fluid>
      <v-row>
        <v-col cols="8" offset="2">
          <h2>Создать новое задание</h2>
          Avatar<img :src="avatar">
          <v-alert
            border="top"
            colored-border
            elevation="2"
            color="#4caf50"
          >

            <v-form
              ref="form"
              v-model="valid"
              lazy-validation
              class="new-task-form px-5 pt-8 pb-12"

            >
              <v-row>
                <v-col
                  cols="12"
                >
                  <h4 class="mb-8">Задание</h4>
                  <v-text-field
                    v-model="name"
                    :counter="100"
                    :rules="nameRules"
                    label="Название задания"
                    required
                    outlined
                    placeholder="Напишите чем вам помочь (заголовок вашего задания)"
                    class="mb-5"
                    color="#4caf50"
                  ></v-text-field>

                  <v-select
                    v-model="rubric"
                    :items="rubrics"
                    :rules="[v => !!v || 'Item is required']"
                    label="Выбор рубрики"
                    required
                    outlined
                    placeholder="Выберите рубрику для вашего задания"
                    class="mb-5"
                    color="#4caf50"
                  ></v-select>

                  <v-textarea
                    label="Опишите пожелания и детали, чтобы исполнители лучше оценили вашу задачу"
                    placeholder="Например: разработать логотип для бренда рюкзаков. Наши покупатели — девушки и парни 17+, которые живут в большом городе и ценят независимость."
                    class="mb-5"
                    color="#4caf50"
                    outlined
                    v-model="description"
                  ></v-textarea>
                </v-col>

                <v-col
                  cols="12"
                >
                  <h4 class="mb-8">Файлы</h4>
                  <v-file-input
                    v-model="files"
                    color="#4caf50"
                    counter
                    label="File input"
                    multiple
                    placeholder="Select your files"
                    prepend-icon="mdi-paperclip"
                    outlined
                    :show-size="1000"
                    class="mb-5"
                    @change="GetImage"
                  >
                    <template v-slot:selection="{ index, text }">
                      <v-chip
                        v-if="index < 2"
                        color="deep-purple accent-4"
                        dark
                        label
                        small
                      >
                        {{ text }}
                      </v-chip>

                      <span
                        v-else-if="index === 2"
                        class="overline grey--text text--darken-3 mx-2"
                      >
        +{{ files.length - 2 }} File(s)
      </span>
                    </template>
                  </v-file-input>
                </v-col>

                <v-col cols="12" class="mb-5">
                  <h4 class="mb-8">Место оказания услуги</h4>
                  <div class="adress-buttons">
                    <v-btn @click="adressOnDistance" :class="{success:addressSelected == 1}">Можно выполнить удалённо</v-btn>
                    <v-btn class="ml-3" @click="adressOnPlace" :class="{success:addressSelected == 2}">Нужно присутствие по адресу</v-btn>
                  </div>
                  <div class="times-block mt-5">
                    <v-expand-transition>
                      <v-row v-if="!onDistance" class="time-period-section">
                        <v-col cols="6">

                        </v-col>
                      </v-row>
                      <v-row v-if="!onPlace" class="time-period-section">
                        <v-col cols="12">
                          <v-text-field
                            v-model="address"
                            color="success"
                            label="Укажите адрес"
                            placeholder="Город, регион, улица, номер, индекс"
                            prepend-icon="home"
                          ></v-text-field>
                        </v-col>
                      </v-row>
                    </v-expand-transition>
                  </div>
                </v-col>

                <v-col cols="12">
                  <h4 class="mb-8">Также потребуется</h4>
                  <v-combobox
                    v-model="anotherWork"
                    :items="anotherWorkItems"
                    color="success"
                    chips
                    clearable
                    label="Your favorite hobbies"
                    multiple
                    prepend-icon="perm_scan_wifi"
                    solo
                  >
                    <template v-slot:selection="{ attrs, item, select, selected }">
                      <v-chip
                        v-bind="attrs"
                        :input-value="selected"
                        close
                        @click="select"
                        @click:close="remove(item)"
                      >
                        <strong>{{ item }}</strong>&nbsp;
                      </v-chip>
                    </template>
                  </v-combobox>
                </v-col>

                <v-col cols="12" class="mb-5">
                  <h4 class="mb-8">Сроки</h4>
                  <div class="time-buttons">
                    <v-btn @click="timeContract" :class="{success:timeSelected == 3}">Договорюсь с исполнителем</v-btn>
                    <v-btn class="ml-3" @click="timePeriod" :class="{success:timeSelected == 4}">Период</v-btn>
                    <v-btn class="ml-3" @click="timeFixed" :class="{success:timeSelected == 5}">Точная дата</v-btn>
                  </div>
                  <div class="times-block mt-5">
                    <v-expand-transition>
                      <v-row v-if="!periodHidden" class="time-period-section">
                        <v-col cols="6">
                          <!--                      <v-date-picker-->
                          <!--                        no-title v-model="dates" range>-->
                          <!--                      </v-date-picker>-->

                          <v-menu
                            v-model="menuTimeStart"
                            :close-on-content-click="false"
                            :nudge-right="40"
                            transition="scale-transition"
                            offset-y
                            min-width="290px"
                          >
                            <template v-slot:activator="{ on }">
                              <v-text-field
                                v-model="timeStart"
                                label="Выберите дату начала работ"
                                prepend-icon="event"
                                readonly
                                v-on="on"
                                color="success"
                              ></v-text-field>
                            </template>
                            <v-date-picker no-title v-model="timeStart" @input="menuTimeStart = false"></v-date-picker>
                          </v-menu>
                          <v-menu
                            v-model="menuTimeEnd"
                            :close-on-content-click="false"
                            :nudge-right="40"
                            transition="scale-transition"
                            offset-y
                            min-width="290px"
                          >
                            <template v-slot:activator="{ on }">
                              <v-text-field
                                v-model="timeEnd"
                                label="Выберите дату завершения работ"
                                prepend-icon="event"
                                readonly
                                class="mt-3"
                                v-on="on"
                                color="success"
                              ></v-text-field>
                            </template>
                            <v-date-picker no-title v-model="timeEnd" @input="menuTimeEnd = false"></v-date-picker>
                          </v-menu>
                        </v-col>
                        <!--                    <v-col cols="6">-->
                        <!--                      <v-text-field v-model="dateRangeText" label="Date range" prepend-icon="event"-->
                        <!--                                    readonly></v-text-field>-->
                        <!--                      model: {{ dates }}-->
                        <!--                    </v-col>-->
                      </v-row>
                    </v-expand-transition>
                    <v-expand-transition>
                      <v-row v-if="!fixedHidden" class="time-fixed-section">
                        <v-col cols="12" sm="6">
                          <v-menu
                            v-model="menuTimeFix"
                            :close-on-content-click="false"
                            :nudge-right="40"
                            transition="scale-transition"
                            offset-y
                            min-width="290px"
                          >
                            <template v-slot:activator="{ on }">
                              <v-text-field
                                v-model="fixedDate"
                                label="Выберите дату"
                                prepend-icon="event"
                                readonly
                                v-on="on"
                                color="success"
                              ></v-text-field>
                            </template>
                            <v-date-picker no-title v-model="fixedDate" @input="menuTimeFix = false"></v-date-picker>
                          </v-menu>
                        </v-col>
                        <v-col class="d-flex mt-2" cols="12" sm="6">
                          <v-select
                            :items="fixedTimeItems"
                            v-model="fixedTime"
                            label="Укажите время"
                            dense
                            outlined
                            color="#4caf50"
                          ></v-select>
                        </v-col>
                      </v-row>
                    </v-expand-transition>
                  </div>
                </v-col>



                <v-col cols="12" sm="8">
                  <h4 class="mb-8">Стоимость</h4>
                  <div class="time-buttons mb-5">
                    <v-btn class="ml-3" @click="executorPrices" :class="{success:selected == 1}">Исполнитель предложит цену
                    </v-btn>
                    <v-btn class="ml-3" @click="fixedPrice" :class="{success:selected == 2}">Указать цену</v-btn>
                  </div>
                  <v-expand-transition>
                    <v-row v-if="!fixedPriceHidden">
                      <v-col cols="12" sm="6">
                        <currency-input
                          currency="EUR"
                          v-model="price"
                          locale="de"
                          class="currency-input"
                          placeholder="1.000,00 €"
                        />
                      </v-col>
                      <v-col class="d-flex" cols="12" sm="6">
                        <v-select
                          :items="priceForItems"
                          color="#666666"
                          label="Оплата (за заказ, за час ...)"
                          dense
                          outlined
                          v-model="priceFor"
                        ></v-select>
                      </v-col>
                    </v-row>
                  </v-expand-transition>
                </v-col>

                <v-col cols="12" sm="4">
                  <div class="pl-5">
                    <h4 class="mb-8">Метод оплаты</h4>
                    <v-radio-group v-model="paymentMethod" :mandatory="false">
                      <v-radio color="success" label="Оплата наличными" value="Оплата наличными"></v-radio>
                      <v-radio color="success" label="Оплата перечислением" value="Оплата перечислением"></v-radio>
                    </v-radio-group>
                  </div>
                </v-col>


                <v-col cols="12">
                  <v-checkbox
                    v-model="checkbox"
                    :rules="[v => !!v || 'You must agree to continue!']"
                    required
                    class="mb-5"
                    color="success"
                  >
                    <template v-slot:label>
                      <div>
                        С
                        <v-tooltip bottom>
                          <template v-slot:activator="{ on }">
                            <a
                              target="_blank"
                              href="/"
                              @click.stop
                              v-on="on"
                            >
                              правилами
                            </a>
                          </template>
                          Ознакомиться с правилами
                        </v-tooltip>
                         сайта ознакомлен!
                      </div>
                    </template>
                  </v-checkbox>
                </v-col>

                <!--              <v-col cols="12 flex row">-->
                <!--                <v-switch-->
                <!--                  v-model="success"-->
                <!--                  class="ma-2"-->
                <!--                  label="Ознакомлен"-->
                <!--                  :rules="[v => !!v || 'You must agree to continue!']"-->
                <!--                ></v-switch>-->
                <!--                <v-btn color="success" @click="success=true" style="display: none">Success</v-btn>-->
                <!--                <v-input-->
                <!--                  :messages="['Правила сайта']"-->
                <!--                  :success="success"-->
                <!--                  :success-messages="successMsg"-->
                <!--                  class="ml-8"-->
                <!--                >-->
                <!--                  С правилами сайта ознакомлен!-->
                <!--                </v-input>-->
                <!--              </v-col>-->

                <v-col cols="12">
                  <v-btn
                    :disabled="!valid"
                    color="success"
                    class="mr-4"
                    @click="save"
                  >
                    Добавить задание
                  </v-btn>

                  <v-btn
                    color="error"
                    class="mr-4"
                    @click="reset"
                  >
                    Reset Form
                  </v-btn>

                  <v-btn
                    color="warning"
                    @click="resetValidation"
                  >
                    Reset Validation
                  </v-btn>
                </v-col>
              </v-row>
            </v-form>
          </v-alert>
        </v-col>
      </v-row>
    </v-container>
  </section>
</template>

<script>

    function getIndex(list, id) {
        for (var i = 0; i < list.length; i++ ) {
            if (list[i].id === id) {
                return i;
            }
        }

        return -1;
    }
  import tasksApi from 'api/tasks'
    import axios from 'axios'
    export default {
        name: "CreateTaskForm",
        data() {
            return {
                avatar: null,
                task: null,
                id: null,
                name: '',
                rubric: null,
                description: '',
                address: '',
                timeStart: new Date().toISOString().substr(0, 10),
                timeEnd: new Date().toISOString().substr(0, 10),
                fixedDate: new Date().toISOString().substr(0, 10),
                menuTimeStart: false,
                menuTimeEnd: false,
                menuTimeFix: false,
                fixedTime: '',
                price: null,
                priceFor: null,
                paymentMethod: '',
                tasks: [],
                text: '',
                onDistance: true,
                onPlace: false,
                fixedPriceHidden: true,
                periodHidden: true,
                fixedHidden: true,
                dates: ['2020-05-06', '2020-05-07'],
                selected: 1,
                addressSelected: 2,
                timeSelected: 3,
                success: false,
                valid: true,
                anotherWork: ['Вынести мусор', 'Прислать фото', 'Заехать в магазин'],
                anotherWorkItems: ['Streaming', 'Eating'],
                nameRules: [
                    v => !!v || 'Name is required',
                    v => (v && v.length <= 100) || 'Name must be less than 100 characters',
                ],
                email: '',
                emailRules: [
                    v => !!v || 'E-mail is required',
                    v => /.+@.+\..+/.test(v) || 'E-mail must be valid',
                ],
                priceForItems: ['за услугу',
                    'за час', 'за день', 'за км', 'за метр', 'за кг',

                ],
                fixedTimeItems: ['Утром (до 12)', 'Днём (с 12 до 17)', 'Вечером (с 17 до 22)', 'Ночью (после 22)', 'В любое время'
                ],
                rubrics: ['Item 1', 'Item 2', 'Item 3', 'Item 4',
                ],
                checkbox: false,
                files: [],
            }
        },
        watch: {
          task: function(newVal, oldVal) {
              this.text = newVal.text;
              this.id = newVal.id
          }
        },
        methods: {
            // edit(task) {
            //     this.task = task;
            // },
            save() {
                let validateResult = this.$refs.form.validate();
                if (validateResult) {
                    const task = {
                        name: this.name,
                        rubric: this.rubric,
                        description: this.description,
                        address: this.address,
                        timeStart: this.timeStart,
                        timeEnd: this.timeEnd,
                        fixedTime: this.fixedTime,
                        fixedDate: this.fixedDate,
                        price: this.price,
                        priceFor: this.priceFor,
                        anotherWork: this.anotherWork,
                        paymentMethod: this.paymentMethod,
                        id: this.id,
                        files: this.files
                    };

                    if (this.id) {
                        tasksApi.update(task).then(result =>
                            result.json().then(data => {
                                const index = getIndex(this.tasks, data.id);
                                this.tasks.splice(index, 1, data);
                            })
                        )
                    } else {
                        let formData = new FormData();
                        formData.append('file', this.avatar);
                        axios.post('/task/image', formData
                            // {'imageTest': 'this.avatar'}
                            )
                        tasksApi.add(task).then(result =>
                            result.json().then(data => {
                                this.tasks.push(data);
                            }))
                        // this.$router.push("/tasks")
                    }
                }

            },
            deleteTask (task) {
                console.log(task)
                tasksApi.remove({id: task.id}).then(result => {
                    if (result.ok) {
                        this.tasks.splice(this.tasks.indexOf(task), 1)
                    }}
                )
            },
            fixedPrice() {
                this.selected = 2
                this.executorPriceHidden = true
                this.fixedPriceHidden = false
            },
            executorPrices() {
                this.selected = 1
                this.executorPriceHidden = false
                this.fixedPriceHidden = true
            },
            reset() {
                this.$refs.form.reset()
            },
            resetValidation() {
                this.$refs.form.resetValidation()
            },
            adressOnDistance() {
              this.addressSelected = 1
                this.onPlace = true
                this.onDistance = false
                this.address = ''
            },
            adressOnPlace() {
                this.addressSelected = 2
                this.onDistance = true
                this.onPlace = false
            },
            timeContract() {
                this.timeSelected = 3
                this.periodHidden = true
                this.fixedHidden = true
                this.timeStart = ''
                this.timeEnd = ''
                this.fixedTime = ''
                this.fixedDate = ''
            },
            timePeriod() {
                this.timeSelected = 4
                this.fixedHidden = true
                this.periodHidden = false
                this.timeStart = new Date().toISOString().substr(0, 10)
                this.timeEnd = new Date().toISOString().substr(0, 10)
                this.fixedTime = ''
                this.fixedDate = ''
            },
            timeFixed() {
                this.timeSelected = 5
                this.periodHidden = true
                this.fixedHidden = false
                this.timeStart = ''
                this.timeEnd = ''
                this.fixedDate = new Date().toISOString().substr(0, 10)
            },
            formatDate(dates) {
                for (let i = 0; i < dates.length; i++) {
                    const [day, month, year] = dates[i].split('-')
                    dates[i] = `${day}/${month}/${year}`
                }
                return dates;
            },
            remove (item) {
                this.anotherWork.splice(this.anotherWork.indexOf(item), 1)
                this.anotherWork = [...this.anotherWork]
            },
            GetImage (e) {
                let image = this.files[0]
                let reader = new FileReader()
                reader.readAsDataURL(image)
                reader.onload = (e) => {
                    this.avatar = reader.result
                }
            },
        },
        created: function () {
            tasksApi.list().then(result=>
                result.json().then(data =>
                    data.forEach(task => this.tasks.push(task))))
        },

        computed: {
            successMsg() {
                return this.success ? ['Спасибо за подтверждение'] : []
            },
            dateRangeText() {
                return this.dates.join(' ~ ')
            },

        }
    }
</script>

<style lang="sass" scoped>
  .new-task-form
    .primary--text
      color: #4caf50 !important
      caret-color: #4caf50 !important

    .currency-input
      border: 1px solid
      border-radius: 4px
      min-height: 40px
      padding: 0 12px
      cursor: pointer
      border-color: rgba(0, 0, 0, .42)
      outline: none
      width: 100%
      transition: all .5s ease

      &:hover
        border: #666666 1px solid

      &:focus
        border: #666666 2px solid

    .v-application .primary--text
      color: #666666 !important
      caret-color: #666666 !important


</style>
