<template>
  <section class="s-wide s-profile-comments">
    <v-container fluid>
      <v-row>
        <v-col cols="12" class="s-find-executor-heading">
          <div class="d-flex justify-center">
            <v-alert
                    width="70%"
                    dismissible
                    color="#666"
                    border="left"
                    elevation="2"
                    colored-border
                    icon="info"
                    class="text-center"
                    style="background-color: #FFF3E0"
                    max-width="800px"
                    transition="scroll-y-transition"
            >
              <h2 class="mb-7">Отзывы</h2>
              <p>Отзывы - один из самых важных критериев для подбора себе <router-link to="/tasks" style="text-decoration: none" class="info-c">заказчика</router-link> или <router-link class="link" to="/executors">исполнителя</router-link> на MachstDu.</p>
              <p>На MachstDu отзыв может получить как заказчик так и исполнитель после каждого закрытого задания.</p>
            </v-alert>
          </div>
        </v-col>
        <v-col cols="12" sm="4">

          <h4 class="my-7 text-center">Меня зовут Петров Илья</h4>

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

          <div class="comments-page-aboutMe mb-8">
            <div class="comments-page-aboutMe-header">
              <h4 class="text-center mb-7">Обо мне</h4>
            </div>
            <div class="comments-page-aboutMe-content">
              <p>Здравствуйте! Готов предложить Вам услуги пешего курьера. Осуществим срочную и своевременную доставку. В штате опытные, и проверенные курьеры. За всех курьеров несу  материальную ответственность. Оплата возможна на карту СБЕРБАНКА, Тинкоффа!
                Для связи имеется WHATSAPP/TELEGRAM</p>
            </div>
          </div>

          <div class="comments-page-categories mb-10">
            <h4 class="mb-7 text-center">Виды выполняемых работ</h4>
            <div class="comments-page-categories-list">
              <ul>
                <li><v-icon>done_outline</v-icon>Услуги пешего курьера</li>
                <li><v-icon>done_outline</v-icon>Срочная доставка</li>
                <li><v-icon>done_outline</v-icon>Доставка продуктов</li>
                <li><v-icon>done_outline</v-icon>Курьер на день</li>
                <li><v-icon>done_outline</v-icon>Услуги курьера на легковом авто</li>
              </ul>
            </div>
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
            <div v-for="n in 4" :key="n" class="profile-comment">
              <div class="profile-comment-head d-flex align-center px-3 py-3">
                <div class="profile-comment-head-img mr-2">
                  <v-img width="50" src="assets/images/profile.png" alt=""></v-img>
                </div>
                <div class="profile-comment-head-content">
                  <span>Scurtu Andrei</span>
                  <p class="mb-0">Comments: <v-icon style="margin-top: -5px" size="17">thumb_up</v-icon> 103 - Исполнитель</p>
                </div>
              </div>
              <div class="profile-comment-content px-3 pt-3">
                <div class="profile-comment-content-header d-flex">
                  <v-icon style="margin-top: -13px; margin-right: 8px">assignment</v-icon>
                  <p>Задание "<router-link to="/">Забрать посылку и купить продуктов по мелочи</router-link>" выполнено</p>
                </div>
                <v-divider class="mb-2"></v-divider>
                <div class="profile-comment-content-content">
                  <p>Спасибо за задание , рада была помочь. Заказчика рекомендую!)</p>
                </div>
                <div class="profile-comment-content-footer d-flex">
                  <p>Оценка: <span>5.0</span></p>
                  <ul class="d-flex">
                    <li class="d-flex mr-2"><span class="mr-2">Вежливость</span><v-rating
                            background-color="orange"
                            color="orange"
                            size="13"
                            half-increments
                    ></v-rating></li>
                    <li class="d-flex mr-2"><span class="mr-2">Пунктуальность</span><v-rating
                            background-color="orange"
                            color="orange"
                            x-small
                            half-increments
                    ></v-rating></li>
                    <li class="d-flex"><span class="mr-2">Адекватность</span><v-rating
                            background-color="orange"
                            color="orange"
                            x-small
                            half-increments
                    ></v-rating></li>
                  </ul>
                </div>
              </div>
            </div>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </section>
</template>

<script>
    export default {
        name: "Comments"
    }
</script>

<style lang="sass" scoped>
  .comments-page-categories-list ul li
    margin-bottom: 8px
    .v-icon
      color: #4caf50
      margin-right: 8px
      font-size: 18px
  .comments-page-profile
    p
      margin-bottom: 0px
  .profile-comment
    box-shadow: 0 3px 1px -2px rgba(0,0,0,.2), 0 2px 2px 0 rgba(0,0,0,.14), 0 1px 5px 0 rgba(0,0,0,.12)
    margin-bottom: 30px
    &-head-content
      font-size: 17px
      p
        font-size: 14px
        opacity: .6
    &-content
      background-color: #FFF3E0
      &-content
        font-size: 17px
      &-footer
        font-size: 14px
        opacity: .6
      &-header
        font-size: 14px
        opacity: .6
        a
          color: #666
          text-decoration: none
          &:hover
            color: #ea0037
            text-decoration: underline
</style>
