<template>
  <section class="s-wide s-task-details">
    <v-container fluid>
      <v-row>
        <v-col cols="12" sm="4">

          <h6 style="font-weight: normal" class="mt-7 text-center">Задание № 7259759</h6>
          <h4 class="mb-7 mt-3 text-center">Заказчик, Петров Илья</h4>

          <div class="comments-page-profile d-flex mb-8">
            <div class="comments-page-profile-img">
              <v-img width="150" src="assets/images/profile.png" alt=""></v-img>
            </div>
            <div class="comments-page-profile-content px-3 pt-3">
              <div class="comments-page-profile-content-status" style="font-weight: 600">
                <v-icon color="success" style="margin-top: -5px" size="19" class="mr-1">verified_user</v-icon>
                <span>Проверенный пользователь</span>
              </div>
              <div class="comments-page-profile-content-info">
                <p><v-icon color="success" style="margin-top: -5px" size="19" class="mr-2">face</v-icon><span style="font-weight: 600">Петров Илья </span>34 года</p>
                <p class="mt-3">Выполнил 3089 заданий, создал 4 задания</p>
                <div class="rating d-flex">
                  <span>Средняя оценка: 5,0</span>
                  <v-rating
                          background-color="orange"
                          color="orange"
                          size="13"
                          half-increments
                          class="mx-2"
                  ></v-rating>
                  <span>(28 отзывов)</span>
                </div>
              </div>
            </div>
          </div>

          <div class="offer-btn mb-12 mt-12 text-center">
            <v-btn @click.stop="dialog = true" x-large color="success">Предложить свои услуги</v-btn>
          </div>

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
                  width="350"
                  max-width="100%"
                  class="mx-auto"
                  src="assets/images/executor-check.png"
          >
          </v-img>

        </v-col>
        <v-col cols="12" sm="8">
          <v-card class="px-7 py-8">
            <div class="task-details">
              <div class="task-details-header">
                <div class="name mb-2">
                  <h3>Циклевка деревянного пола</h3>
                </div>
                <div class="price-type d-flex align-center">
                  <div class="price py-2 px-6">7 000 €</div>
                  <div class="type ml-4">Сделка без риска</div>
                </div>
                <div class="sm-details my-2">
                  <ul class="d-flex pl-0">
                    <li class="status succ-c">Открыто<span style="color: #000" class="mx-2">|</span></li>
                    <li class="views">9 просмотров<span class="mx-2">|</span></li>
                    <li class="create">Создано 18 апреля 2020 13:42<span class="mx-2">|</span></li>
                    <li class="category">Доставка</li>
                  </ul>
                </div>
              </div>
              <v-divider class="mb-8 mt-5"></v-divider>
              <div class="task-details-content">
                <div class="address mb-4">
                  <v-row>
                    <v-col cols="2">
                      <div class="address-name">
                        <h5>Адрес</h5>
                      </div>
                    </v-col>
                    <v-col cols="10">
                      <div class="address-content">Можайское шоссе, 19, Одинцово, Московская область, Россия </div>
                    </v-col>
                  </v-row>
                </div>
                <div class="start mb-4">
                  <v-row>
                    <v-col cols="2">
                      <div class="start-name">
                        <h5>Начать</h5>
                      </div>
                    </v-col>
                    <v-col cols="10">
                      <div class="start-content">18 апреля 2020, 12:00</div>
                    </v-col>
                  </v-row>
                </div>
                <div class="price mb-4">
                  <v-row>
                    <v-col cols="2">
                      <div class="price-name">
                        <h5>Стоимость</h5>
                      </div>
                    </v-col>
                    <v-col cols="10">
                      <div class="price-content">7 000 €</div>
                    </v-col>
                  </v-row>
                </div>
                <div class="payment mb-4">
                  <v-row>
                    <v-col cols="2">
                      <div class="payment-name">
                        <h5>Оплата задания</h5>
                      </div>
                    </v-col>
                    <v-col cols="10">
                      <div class="payment-content">Банковской картой</div>
                    </v-col>
                  </v-row>
                </div>
                <div class="additionally mb-4">
                  <v-row>
                    <v-col cols="2">
                      <div class="additionally-name">
                        <h5>Также потребуется</h5>
                      </div>
                    </v-col>
                    <v-col cols="10">
                      <div class="additionally-content">
                        <ul class="pl-0">
                          <li>Закупка материалов</li>
                          <li>Закупка материалов</li>
                          <li>Закупка материалов</li>
                        </ul>
                      </div>
                    </v-col>
                  </v-row>
                </div>
                <div class="description mb-4">
                  <v-row>
                    <v-col cols="2">
                      <div class="description-name">
                        <h5>Нужно</h5>
                      </div>
                    </v-col>
                    <v-col cols="10">
                      <div class="description-content">
                        <div class="description-content-text">В комнате 12,5 метров нужно отциклевать старый деревянный пол и в месте за холодильником его подремонтировать. На фото всё видно. После покрыть лаком. Хоть это и старый пол, в старой квартире, но очень хочется чтобы работа была выполнена хорошо и на совесть.</div>
                        <div class="description-content-images mt-8">
                          <v-carousel
                                  style="min-height: 400px"
                                  cycle
                                  height="auto"
                                  hide-delimiter-background
                                  show-arrows
                                  continuous
                                  light
                          >
                            <v-carousel-item
                                    v-for="(slide, i) in slides"
                                    :key="i"
                            >
                              <v-row
                                      class="fill-height"
                                      align="center"
                                      justify="center"
                              >
                                <div class="img-wrap">
                                  <img style="width: 600px; height: auto" class="img-responsive" src="assets/images/connect.png" alt="">
                                </div>
                              </v-row>
                            </v-carousel-item>
                          </v-carousel>
                        </div>
                      </div>
                    </v-col>
                  </v-row>
                </div>

                <div class="offer-btn mb-12 mt-12 text-center">
                  <v-btn @click.stop="dialog = true" x-large color="success">Предложить свои услуги</v-btn>
                </div>

                <v-dialog v-model="dialog" persistent width="100%" max-width="700">
                  <v-card class="pb-7 pt-3 px-5">
                    <v-card-title style="font-weight: 600">Добавить предложение к заданию</v-card-title>
                    <v-divider></v-divider>

                    <v-container>
                      <v-row>
                        <v-col cols="12">
                          <v-textarea
                            label="Текст вашего предложения"
                            placeholder="Укажите свой опыт работы, опишите свои преимущества и напишите, почему именно вы должны стать исполнителем этого задания."
                            outlined></v-textarea>
                        </v-col>
                        <v-col cols="12" class="d-flex justify-space-between">
                          <div class="old-price">
                            <div class="old-price-header">Предлагаемая стоимость</div>
                            <div class="old-price-text">
                              Заказчик указал бюджет - <span>2 000</span> €.
                            </div>
                          </div>
                          <div class="new-price d-flex align-center ml-3">
                            <div class="new-price-input">
                              <v-text-field hide-details outlined label="Ваше предложение"></v-text-field>
                            </div>
                            <span class="new-price-currency ml-2">€.</span>
                          </div>
                        </v-col>
                        <v-col cols="12">
                          <v-checkbox hide-details v-model="checkbox1" :label="`${checkbox1.toString()} : Уведомить меня, если исполнителем задания выберут другого`"></v-checkbox>
                        </v-col>
                        <v-col cols="12" class="d-flex flex-column">
                        <div class="btn-wrap">
                          <v-btn color="green " @click="dialog = false" style="color: #ffffff" class="my-2">Добавить предложение</v-btn>
                        </div>
                        <div class="add-offer-agr">Нажимая "Добавить предложение", вы соглашаетесь с правилами оплаты на сайте MachstDu</div>
                        </v-col>
                      </v-row>
                    </v-container>
                    <v-card-actions>
                      <v-spacer></v-spacer>
                      <v-btn color="error " depressed @click="dialog = false">Отмена</v-btn>
                    </v-card-actions>
                  </v-card>
                </v-dialog>

                <v-divider class="mt-5 mb-10"></v-divider>

                <div class="offers-list text-center mb-8">
                  <h5>Предложения исполнителей скрыты</h5>
                  <p>Предложения видны только заказчику</p>
                </div>
                <div class="offers-list text-center mb-8">
                  <h5>Предложения исполнителей</h5>
                  <p>Обратите внимание на стаж работы, отзывы, стоимость</p>
                </div>
              </div>
              <v-card outlined class="px-4 py-6">
                <v-row>
                  <v-col cols="12" sm="8">
                    <div class="executor-offer">
                      <div class="task-offer d-flex mb-0">
                        <div class="task-offer-img">
                          <v-img width="150" src="assets/images/profile.png" alt=""></v-img>
                        </div>
                        <div class="task-offer-content px-3 pt-3">
                          <div class="task-offer-content-status" style="font-weight: 600">
                            <v-icon color="success" style="margin-top: -5px" size="19" class="mr-1">verified_user</v-icon>
                            <span>Проверенный пользователь</span>
                          </div>
                          <div class="task-offer-content-info">
                            <p><v-icon color="success" style="margin-top: -5px" size="19" class="mr-2">face</v-icon><span style="font-weight: 600">Петров Илья </span>34 года</p>
                            <div class="task-offer-content-info-text">
                              <p>Добрый день! Могу приступить к выполнению задания в ближайшее время, за целосность груза можете не переживать (имею опыт перевоза хкупкого и ценного груза)</p>
                            </div>
                            <p class="mb-0 pb-0 font-weight-bold">Телефон исполнителя <span class="ml-3" >+1 234 567 890</span></p>
                            <div class="rating d-flex">
                              <span>Средняя оценка: 5,0</span>
                              <v-rating
                                background-color="orange"
                                color="orange"
                                size="13"
                                half-increments
                                class="mx-2"
                              ></v-rating>
                              <span>(28 отзывов)</span>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </v-col>
                  <v-col cols="12" sm="4" class="text-center">
                    <v-chip
                      class="ma-2 mb-4"
                      color="#3f3f3f"
                      label
                      outlined
                    >
                      <v-icon left>money</v-icon>
                      Стоимость <span class="ml-2 font-weight-bold" style="font-size: 18px; letter-spacing: 1.5px; color: #4caf50">850€</span>
                    </v-chip>
                    <v-btn to="/comments" class="ma-2 mb-4" outlined color="error">Просмотреть профиль</v-btn>
                    <v-btn @click.stop="dialogSelect = true" class="ma-2" outlined color="success">Выбрать исполнителем</v-btn>
                    <v-dialog
                      v-model="dialogSelect"
                      max-width="550"
                    >
                      <v-card class="px-3 py-5">
                        <div class="confirm-executor-modal-header text-center">
                          <h4>Выбрать пользователя <br> <span class="succ-c">Иванов Сергей</span> <br> Исполнителем задания?</h4>
                        </div>

                        <div class="confirm-executor-modal-price">
                          Стоимость задания 850 €
                        </div>

                        <div class="confirm-executor-modal-text">
                            <ul class="mt-4">
                              <h5 class="mb-2">Лучше всегда это делать и вот почему:</h5>
                              <li> - у вас будет возможность оставить отзыв</li>
                              <li> - отзывы - стимулируют исполнителей</li>
                              <li> - если что-то пойдёт не так, вы сможете обратиться в поддержку YouDo.</li>
                            </ul>
                          <span class="ma-4 d-inline-block">Когда вы поймёте, кто из исполнителей вам подходит, и обсудите детали, просто нажмите большую зелёную кнопку «Выбрать».</span>
                        </div>


                        <v-card-actions>
                          <v-spacer></v-spacer>

                          <v-btn
                            color="green"
                            text
                            @click="dialogSelect = false"
                          >
                            Выбрать
                          </v-btn>

                          <v-btn
                            color="error"
                            text
                            @click="dialogSelect = false"
                          >
                            Отмена
                          </v-btn>
                        </v-card-actions>
                      </v-card>
                    </v-dialog>
                  </v-col>
                </v-row>
              </v-card>
            </div>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </section>
</template>

<script>
    import SelectExecutorDialog from "../components/dialogs/SelectExecutorDialog.vue";
    export default {
        name: "TaskDetails",
        components: {SelectExecutorDialog},
        data () {
            return {
                dialogSelect: false,
                checkbox1: false,
                dialog: false,
                colors: [
                    'indigo',
                    'warning',
                    'pink darken-2',
                    'red lighten-1',
                    'deep-purple accent-4',
                ],
                slides: [
                    'First',
                    'Second',
                    'Third',
                    'Fourth',
                    'Fifth',
                ],
            }
        },
    }
</script>

<style lang="sass" scoped>
  .old-price
    &-header
      font-size: 20px
      font-weight: 600
    &-text
      font-size: 14px
      opacity: .6

  .add-offer-agr
    font-size: 14px
    opacity: .6
  .price-type
    .price
      background-color: rgb(255, 243, 224)
  .sm-details
    font-size: 15px
  .confirm-executor-modal-price
    text-align: center
    padding: 20px 0
    margin: 20px 0
    background-color: rgb(255, 243, 224)
    font-size: 19px
</style>
