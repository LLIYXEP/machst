<template>
  <section class="s-wide s-executor-check">
    <v-container fluid>
      <v-row>
        <v-col cols="12" class="mb-12 d-flex justify-center">
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
            <h2 class="mb-7">Стать исполнителем</h2>
            <p>* Выполнять задания на YouDo могут <span
                    style="color: #ff5252">только совершеннолетние пользователи</span>, которые прошли процедуру
              верификации.</p>
            <p>* Мы оставляем за собой право отказать в присвоении статуса исполнителя без объяснения причин.</p>
          </v-alert>
        </v-col>

        <v-col cols="12">
          <v-card outlined class="py-6 px-4">
            <v-row>
              <v-col cols="12" sm="5">
                <v-alert
                        color="#1867c0"
                        colored-border
                        elevation="2"
                        border="left"
                        class="text-center px-7 fsn mb-7"
                        style="background-color: #F2F2F2"
                        max-width="800px"
                        transition="scroll-y-transition"
                >
                  <v-col cols="12" class="text-center mt-1">
                    <h5 class="mb-6">MachstDu поможет найти новых клиентов и зарабатывать на выполнении любых услуг.</h5>
                    <v-list>
                      <v-list-item>
                        <v-list-item-icon><v-icon>format_paint</v-icon></v-list-item-icon>
                        <v-list-item-content>Больше не нужно тратить деньги на собственный сайт и рекламу — выбирайте задания и отправляйте предложения заказчикам, которым услуга нужна прямо сейчас.</v-list-item-content>
                      </v-list-item>
                      <v-list-item>
                        <v-list-item-icon><v-icon>format_paint</v-icon></v-list-item-icon>
                        <v-list-item-content>Читайте отзывы о заказчиках и выполняйте задания.</v-list-item-content>
                      </v-list-item>
                      <v-list-item>
                        <v-list-item-icon><v-icon>format_paint</v-icon></v-list-item-icon>
                        <v-list-item-content>Выполняйте задания в удобное для вас время и устраивайте выходные, когда захотите.</v-list-item-content>
                      </v-list-item>
                    </v-list>
                  </v-col>

                </v-alert>

                <v-img
                    width="450"
                    max-width="100%"
                    class="mx-auto"
                    src="assets/images/executor-master.png"
                >
                </v-img>


                <v-alert
                        color="#1867c0"
                        colored-border
                        icon="info"
                        elevation="2"
                        border="left"
                        class="text-center px-7 fsn my-7"
                        style="background-color: #F2F2F2"
                        max-width="800px"
                        transition="scroll-y-transition"
                >
                  <v-col cols="12" class="text-center mt-1">
                    <h5 class="mb-6">Пожалуйста, внимательно проверьте указанные данные!</h5>
                    <p>MachstDu проверяет достоверность данных по нескольким критериям. Если предоставленная информация
                      не будет соответствовать реальным данным, профиль может быть заблокирован.</p>
                  </v-col>

                </v-alert>

                <v-img
                        width="450"
                        max-width="100%"
                        class="mx-auto"
                        src="assets/images/executor-check.png"
                >
                </v-img>
              </v-col>
              <v-col cols="12" sm="7">
                <v-card outlined class="px-4 py-4">
                  <v-row>
                    <v-col cols="12" class="text-center mb-6">
                      <h4>Информация о фирме</h4>
                    </v-col>
                    <v-col cols="12">
                      <v-form class="pers-data-form d-flex flex-column justify-center">
                        <v-item-group class="d-flex">
                          <div class="pers-data-form-label mt-3 mr-4"><span class="mr-1 required">*</span>Название фирмы
                          </div>
                          <v-text-field
                                  :counter="20"
                                  :rules="nameRules"
                                  required
                                  outlined
                                  placeholder="Naprimer Gmbh"
                                  color="#4caf50"
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

                        <v-item-group class="d-flex">
                          <div class="pers-data-form-label mt-3 mr-4">Копия паспорта</div>
                          <v-file-input
                                  v-model="files"
                                  color="#4caf50"
                                  counter
                                  multiple
                                  placeholder="Необходимо для подтверждения личности"
                                  prepend-icon="mdi-paperclip"
                                  outlined
                                  :show-size="1000"
                                  class="mb-5"
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
                          <div class="pers-data-form-label mt-3 mr-4">Копия фирмы</div>
                          <v-file-input
                                  v-model="files"
                                  color="#4caf50"
                                  counter
                                  multiple
                                  placeholder="Необходимо для подтверждения фирмы"
                                  prepend-icon="mdi-paperclip"
                                  outlined
                                  :show-size="1000"
                                  class="mb-5"
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

                        <v-col cols="12" class="mb-5 text-center">
                          <h4>Отметьте категории, которые вам интересны</h4>
                          <v-card-subtitle>Выберите категории заданий, которые вам будет интересно выполнять.<br>А также
                            вы будете получать рассылку только по выбранным категориям.
                          </v-card-subtitle>
                        </v-col>

                        <v-select
                                v-for="category in categoryItems"
                                :key="category.title"
                                v-model="executorCategories"
                                :items="category.items"
                                :label="category.title"
                                :placeholder="category.title"
                                chips
                                multiple
                                outlined
                        >
                          <!-- Template for render selected data -->
                          <template
                                  slot="selection"
                                  slot-scope="data"
                          >
                            <v-chip
                                    close
                                    class="chip--select-multi"
                                    @click:close="removeSelectedCategory(data.item)"
                            >
                              {{ data.item }}
                            </v-chip>
                          </template>
                          <!-- Template for render data when the select is expanded -->
                          <template
                                  slot="item"
                                  slot-scope="data"
                          >
                            <!-- Divider and Header-->
                            <template>
                              <v-list-item-content v-html="data.item"/>
                            </template>
                          </template>
                        </v-select>

                        <div>
                          <div class="btn-wrap w100 text-center mb-4">
                            <v-btn
                                    depressed
                                    color="success"
                            >Отправить на проверку
                            </v-btn>
                          </div>
                          <v-list-item-subtitle class="w-space text-center">Нажимая «Отправить на проверку», вы
                            подтверждаете, что проходите верификацию на MachstDu впервые, указали достоверную информацию
                            о себе и соглашаетесь на обработку персональных данных.
                          </v-list-item-subtitle>
                        </div>

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
        name: "ExecutorCheck",
        data() {
            return {
                executorCategories: [],
                files: undefined,
                nameRules: [
                    v => !!v || 'Name is required',
                    v => (v && v.length <= 20) || 'Name must be less than 20 characters',
                ],
                categoryItems: [
                    {
                        action: 'local_activity',
                        title: 'Attractions',
                        items: ['List Item1'],
                    },
                    {
                        action: 'restaurant',
                        title: 'Dining',
                        active: true,
                        items: ['Breakfast & brunch', 'New American', 'Sushi'],
                    },
                    {
                        action: 'school',
                        title: 'Education',
                        items: ['List Item2', 'List Item3'],
                    },
                    {
                        action: 'directions_run',
                        title: 'Family',
                        items: ['List Item4', 'List Item5', 'List Item6'],
                    },
                    {
                        action: 'healing',
                        title: 'Health',
                        items: ['List Item7', 'List Item8'],
                    },
                    {
                        action: 'content_cut',
                        title: 'Office',
                        items: ['List Item9', 'List Item10', 'List Item11'],
                    },
                    {
                        action: 'local_offer',
                        title: 'Promotions',
                        items: ['List Item12', 'List Item13'],
                    },
                ],
            }
        },
        methods: {
            removeSelectedCategory(category) {
                let categoryIndex = this.executorCategories.indexOf(category)
                this.executorCategories.splice(categoryIndex, 1)
            },
        }
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
