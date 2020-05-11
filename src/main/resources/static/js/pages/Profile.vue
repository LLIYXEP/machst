<template>
  <section class="s-wide s-profile">
    <v-container fluid>
      <v-row>
        <v-col cols="12" class="d-flex justify-center">
          <v-alert
                  width="800px"
                  color="success"
                  elevation="2"
                  colored-border
                  class="text-center"
                  style="background-color: #FFF3E0"
                  max-width="100%"
                  transition="scroll-y-transition"
          >
            <h2 class="mb-7">Здравствуйте, Andrei!</h2>
            <p>* Повысьте доверие пользователей к себе – постарайтесь заполнить как можно больше личной информации.</p>
            <p>* Станьте <router-link to="/executor-check" text style="color: #1976d2; text-decoration: none">исполнителем</router-link> и начните зарабатывать с MachstDu</p>
          </v-alert>
        </v-col>

        <v-col cols="12">
          <v-card outlined class="py-6 px-4">
            <v-row>
              <v-col cols="12" sm="5">
                <v-card
                        outlined
                        width="400px"
                        max-width="100%"
                        class="mx-auto mb-8"
                >
                  <v-img
                          src="https://cdn.vuetifyjs.com/images/lists/ali.png"
                          height="300px"
                          dark
                  >
                    <v-row class="fill-height">
                      <v-card-title class="white--text pl-12 pt-12">
                        <div class="display-1 pl-12 pt-12">Ali Conners</div>
                      </v-card-title>
                    </v-row>
                  </v-img>

                  <v-list two-line>
                    <v-list-item>
                      <v-list-item-icon>
                        <v-icon color="success">person</v-icon>
                      </v-list-item-icon>

                      <v-list-item-content>
                        <v-list-item-title>Scurtu Andrei</v-list-item-title>
                        <v-list-item-subtitle>Name / Vorname</v-list-item-subtitle>
                      </v-list-item-content>

                      <v-list-item-icon>
                        <v-icon color="success" class="mr-2">money</v-icon>
                      </v-list-item-icon>
                      <v-list-item-content>
                        <v-list-item-title>43 €</v-list-item-title>
                        <v-list-item-subtitle><a style="color: #1867c0">Пополнить</a></v-list-item-subtitle>
                      </v-list-item-content>
                    </v-list-item>

                    <v-list-item>
                      <v-list-item-icon>
                        <v-icon color="success">thumb_up</v-icon>
                      </v-list-item-icon>
                      <v-list-item-content>
                        <div class="d-flex">
                          <v-rating
                                  color="error"
                                  background-color="error"
                                  readonly
                                  size="20"
                                  half-increments
                                  class="profile-rating"
                                  v-model="rating"
                          ></v-rating>
                          <span class="grey--text mt-2 ml-2">4.5</span>
                        </div>
                      </v-list-item-content>
                    </v-list-item>

                    <v-list-item>
                      <v-list-item-icon>
                        <v-icon color="success">comment</v-icon>
                      </v-list-item-icon>
                      <v-list-item-content>
                        <v-list-item-title>Comments: 45</v-list-item-title>
                        <v-list-item-subtitle class="w-space">От созданных и выполненых заданий
                        </v-list-item-subtitle>
                      </v-list-item-content>
                    </v-list-item>

                    <v-divider inset></v-divider>

                    <v-list-item>
                      <v-list-item-icon>
                        <v-icon color="success">cake</v-icon>
                      </v-list-item-icon>
                      <v-list-item-content>
                        <v-list-item-title>02-11-1999</v-list-item-title>
                        <v-list-item-subtitle class="w-space">Дата рождения</v-list-item-subtitle>
                      </v-list-item-content>
                    </v-list-item>

                    <v-list-item>
                      <v-list-item-action></v-list-item-action>
                      <v-list-item-content>
                        <v-list-item-title>Мужской</v-list-item-title>
                        <v-list-item-subtitle class="w-space">Пол</v-list-item-subtitle>
                      </v-list-item-content>
                    </v-list-item>

                    <v-divider inset></v-divider>

                    <v-list-item>
                      <v-list-item-icon>
                        <v-icon color="success">mdi-phone</v-icon>
                      </v-list-item-icon>

                      <v-list-item-content>
                        <v-list-item-title><span class="mr-2">Mobile:</span>(650) 555-1234
                        </v-list-item-title>
                        <v-list-item-subtitle class="w-space">Телефон скрыт от других пользователей
                        </v-list-item-subtitle>
                      </v-list-item-content>
                    </v-list-item>

                    <v-list-item>
                      <v-list-item-action></v-list-item-action>
                      <v-list-item-content>
                        <v-list-item-title><span class="mr-2">Work:</span>(323) 555-6789</v-list-item-title>
                        <v-list-item-subtitle class="w-space">Телефон скрыт от других пользователей
                        </v-list-item-subtitle>
                      </v-list-item-content>
                    </v-list-item>

                    <v-divider inset></v-divider>

                    <v-list-item>
                      <v-list-item-icon>
                        <v-icon color="success">mdi-email</v-icon>
                      </v-list-item-icon>

                      <v-list-item-content>
                        <v-list-item-title><span class="mr-2">Personal:</span>aliconnors@example.com
                        </v-list-item-title>
                        <v-list-item-subtitle class="w-space">Почтовый адрес скрыт от других пользователей
                        </v-list-item-subtitle>
                      </v-list-item-content>
                    </v-list-item>

                    <v-list-item>
                      <v-list-item-action></v-list-item-action>
                      <v-list-item-content>
                        <v-list-item-title><span class="mr-2">Work:</span>ali_connors@example.com
                        </v-list-item-title>
                        <v-list-item-subtitle class="w-space">Почтовый адрес скрыт от других пользователей
                        </v-list-item-subtitle>
                      </v-list-item-content>
                    </v-list-item>

                    <v-divider inset></v-divider>

                    <v-list-item>
                      <v-list-item-icon>
                        <v-icon color="success">mdi-map-marker</v-icon>
                      </v-list-item-icon>
                      <v-list-item-content>
                        <v-list-item-title>Budapester str., 12</v-list-item-title>
                        <v-list-item-subtitle>Улица / Номер</v-list-item-subtitle>
                      </v-list-item-content>
                    </v-list-item>

                    <v-list-item>
                      <v-list-item-action></v-list-item-action>
                      <v-list-item-content>
                        <v-list-item-title>01777, Dresden</v-list-item-title>
                        <v-list-item-subtitle>Индекс / Город</v-list-item-subtitle>
                      </v-list-item-content>
                    </v-list-item>
                  </v-list>
                </v-card>


                <v-alert
                        color="#666"
                        elevation="2"
                        border="left"
                        class="text-center pl-0"
                        style="background-color: #F2F2F2"
                        max-width="800px"
                        transition="scroll-y-transition"
                >
                  <v-col cols="12" class="text-center mb-6">
                    <h4>Пополнить счёт</h4>
                  </v-col>

                  <v-item-group class="d-flex">
                    <div class="pers-data-form-label mt-3"><span class="mr-1 required">*</span>Пароль</div>
                    <v-text-field
                            required
                            outlined
                            placeholder="Новый пароль"
                            color="#4caf50"
                    ></v-text-field>
                  </v-item-group>

                  <v-item-group class="d-flex">
                    <div class="pers-data-form-label mt-3"><span class="mr-1 required">*</span>Подтвердить</div>
                    <v-text-field
                            required
                            outlined
                            placeholder="Подтвердить новый пароль"
                            color="#4caf50"
                    ></v-text-field>
                  </v-item-group>

                  <div class="text-center mt-1 mb-4">
                    <v-btn
                            depressed
                            color="success"
                    >Изменить пароль
                    </v-btn>
                  </div>
                </v-alert>
              </v-col>
              <v-col cols="12" sm="7">
                <v-card outlined class="px-4 py-4">
                  <v-row>
                    <v-col cols="12" class="text-center mb-6">
                      <h4>Личные настройки</h4>
                    </v-col>
                    <v-col cols="12">
                      <v-form class="pers-data-form d-flex flex-column justify-center">
                        <v-item-group class="d-flex">
                          <div class="pers-data-form-label mt-3 mr-4"><span class="mr-1 required">*</span>Имя</div>
                          <v-text-field
                                  :counter="20"
                                  :rules="nameRules"
                                  required
                                  outlined
                                  placeholder="Имя"
                                  color="#4caf50"
                          ></v-text-field>
                        </v-item-group>

                        <v-item-group class="d-flex">
                          <div class="pers-data-form-label mt-3 mr-4"><span class="mr-1 required">*</span>Фамилия</div>
                          <v-text-field
                                  :counter="20"
                                  :rules="nameRules"
                                  required
                                  outlined
                                  placeholder="Фамилия"
                                  color="#4caf50"
                          ></v-text-field>
                        </v-item-group>

                        <v-item-group class="d-flex mb-5">
                          <div class="pers-data-form-label mt-3 mr-4"><span class="mr-1 required">*</span>Дата рождения
                          </div>
                          <v-menu
                                  ref="menu1"
                                  v-model="menu1"
                                  :close-on-content-click="false"
                                  transition="scale-transition"
                                  offset-y
                                  max-width="290px"
                                  min-width="290px"
                          >
                            <template v-slot:activator="{ on }">
                              <v-text-field
                                      outlined
                                      required
                                      v-model="dateFormatted"
                                      :hint="date"
                                      persistent-hint
                                      @blur="date = parseDate(dateFormatted)"
                                      v-on="on"
                              ></v-text-field>
                            </template>
                            <v-date-picker v-model="date" no-title @input="menu1 = false"></v-date-picker>
                          </v-menu>
                        </v-item-group>

                        <v-item-group class="d-flex">
                          <div class="pers-data-form-label mt-3 mr-4"><span class="mr-1 required">*</span>Пол</div>
                          <v-select
                                  placeholder="Пол"
                                  required
                                  :items="items"
                                  outlined
                                  color="success"
                          ></v-select>
                        </v-item-group>

                        <v-item-group class="d-flex">
                          <div class="pers-data-form-label mt-3 mr-4">Фото профиля</div>
                          <v-file-input
                                  color="#4caf50"
                                  counter
                                  multiple
                                  placeholder="Главное фото вашего профиля"
                                  prepend-icon="mdi-paperclip"
                                  outlined
                                  :show-size="1000"
                                  class="mb-5"
                                  hint="Загрузите вашу фотографию (хорошее качество, лицо крупным планом). Профили без фото отклоняются во время проверки данных. Минимальный размер: 300 × 300 px."
                                  persistent-hint
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
                        </v-item-group>

                        <v-item-group class="d-flex">
                          <div class="pers-data-form-label mt-3 mr-4"><span class="mr-1 required">*</span>Email</div>
                          <v-text-field
                                  type="email"
                                  required
                                  outlined
                                  placeholder="Почтовый адрес скрыт от других пользователей"
                                  color="#4caf50"
                                  hint="Почтовый адрес скрыт от других пользователей"
                          ></v-text-field>
                        </v-item-group>

                        <v-item-group class="d-flex">
                          <div class="pers-data-form-label mt-3 mr-4"><span class="mr-1 required">*</span>Телефон</div>
                          <v-text-field
                                  type="number"
                                  required
                                  outlined
                                  placeholder="Телефон скрыт от других пользователей"
                                  color="#4caf50"
                                  hint="Телефон скрыт от других пользователей"
                          ></v-text-field>
                        </v-item-group>

                        <v-item-group class="d-flex">
                          <div class="pers-data-form-label mt-3 mr-4">Телефон (Work)</div>
                          <v-text-field
                                  type="number"
                                  outlined
                                  placeholder="Рабочий телефон скрыт от других пользователей"
                                  color="#4caf50"
                                  hint="Рабочий телефон скрыт от других пользователей"
                          ></v-text-field>
                        </v-item-group>

                        <v-item-group class="d-flex">
                          <div class="pers-data-form-label mt-3 mr-4">Улица / Номер</div>
                          <v-text-field
                                  required
                                  outlined
                                  placeholder="Улица"
                                  color="#4caf50"
                          ></v-text-field>
                          <v-text-field
                                  required
                                  outlined
                                  placeholder="Номер"
                                  color="#4caf50"
                                  class="ml-4"
                          ></v-text-field>
                        </v-item-group>

                        <v-item-group class="d-flex">
                          <div class="pers-data-form-label mt-3 mr-4">Индекс / Город</div>
                          <v-text-field
                                  required
                                  outlined
                                  placeholder="Индекс"
                                  color="#4caf50"
                          ></v-text-field>
                          <v-text-field
                                  required
                                  outlined
                                  placeholder="Город"
                                  color="#4caf50"
                                  class="ml-4"
                          ></v-text-field>
                        </v-item-group>

                        <v-list-item-action>
                          <v-btn
                                  depressed
                                  color="success"
                          >Сохранить
                          </v-btn>
                        </v-list-item-action>

                        <v-divider class="mt-8"></v-divider>

                        <v-col cols="12" class="text-center my-6">
                          <h4>Изменить пароль</h4>
                        </v-col>

                        <v-item-group class="d-flex">
                          <div class="pers-data-form-label mt-3 mr-4"><span class="mr-1 required">*</span>Пароль</div>
                          <v-text-field
                                  required
                                  outlined
                                  placeholder="Новый пароль"
                                  color="#4caf50"
                          ></v-text-field>
                        </v-item-group>

                        <v-item-group class="d-flex">
                          <div class="pers-data-form-label mt-3 mr-4"><span class="mr-1 required">*</span>Подтвердить
                          </div>
                          <v-text-field
                                  required
                                  outlined
                                  placeholder="Подтвердить новый пароль"
                                  color="#4caf50"
                          ></v-text-field>
                        </v-item-group>

                        <v-list-item-action>
                          <v-btn
                                  depressed
                                  color="success"
                          >Изменить пароль
                          </v-btn>
                        </v-list-item-action>
                      </v-form>
                    </v-col>
                  </v-row>
                </v-card>
              </v-col>
            </v-row>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </section>
</template>

<script>
    export default {
        name: "Profile",
        data() {
            return {
                items: ['Мужской', 'Женский'],
                rating: 4.5,
                nameRules: [
                    v => !!v || 'Name is required',
                    v => (v && v.length <= 20) || 'Name must be less than 20 characters',
                ],
                date: new Date().toISOString().substr(0, 10),
                dateFormatted: this.formatDate(new Date().toISOString().substr(0, 10)),
                menu1: false,
            }
        },
        computed: {
            computedDateFormatted() {
                return this.formatDate(this.date)
            },
        },
        watch: {
            date(val) {
                this.dateFormatted = this.formatDate(this.date)
            },
        },

        methods: {
            formatDate(date) {
                if (!date) return null

                const [year, month, day] = date.split('-')
                return `${month}/${day}/${year}`
            },
            parseDate(date) {
                if (!date) return null

                const [month, day, year] = date.split('/')
                return `${year}-${month.padStart(2, '0')}-${day.padStart(2, '0')}`
            },
        },
    }
</script>

<style lang="sass" scoped>
  .pers-data-form
    max-width: 100%

    &-label
      color: #666666
      min-width: 180px

      .required
        color: #ea0037

</style>
