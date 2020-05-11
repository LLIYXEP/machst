<template>
  <section class="first-page-advantages s-wide s-shadow">
    <v-container fluid>
      <v-row>
        <v-col cols="12">
          <h2>Основные преимущества использования нашего сервиса</h2>
        </v-col>
        <v-col cols="12" sm="6" offset-sm="3" class="advantage-item mb-5">
          <v-card class="px-4 py-8 d-flex align-center">
            <div class="advantage-item-icon mr-7">
              <v-icon color="error" size="65">card_giftcard</v-icon>
            </div>
            <div class="advantage-item-content">
              <h4 class="mb-3">Бесплатный сервис</h4>
              <span>Использование нашего сервиса абсолютно бесплатно для заказчиков. Создай задание и получай предложения от исполнителей</span>
            </div>
          </v-card>
        </v-col>
        <v-col cols="12" sm="6" offset-sm="3" class="advantage-item mb-5">
          <v-card class="px-4 py-8 d-flex align-center">
            <div class="advantage-item-icon mr-7">
              <v-icon color="error" size="65">euro_symbol</v-icon>
            </div>
            <div class="advantage-item-content">
              <h4 class="mb-3">Выгодные цены</h4>
              <span>У частных исполнителей нет расходов на офис, рекламу, зарплату секретарю и других затрат, которые сервисные компании обычно включают в стоимость своих услуг.</span>
            </div>
          </v-card>
        </v-col>
        <v-col cols="12" sm="6" offset-sm="3" class="advantage-item mb-5">
          <v-card class="px-4 py-8 d-flex align-center">
            <div class="advantage-item-icon mr-7">
              <v-icon color="error" size="65">verified_user</v-icon>
            </div>
            <div class="advantage-item-content">
              <h4 class="mb-3">Проверенные исполнители</h4>
              <span>Все исполнители MachstDu проходят процедуру верификации, мы проверяем отзывы, разбираемся с жалобами и контролируем качество их работы.</span>
            </div>
          </v-card>
        </v-col>
        <v-col cols="12" sm="6" offset-sm="3" class="advantage-item">
          <v-card class="px-4 py-8 d-flex align-center">
            <div class="advantage-item-icon mr-7">
              <v-icon color="error" size="65">history</v-icon>
            </div>
            <div class="advantage-item-content">
              <h4 class="mb-3">Экономия времени</h4>
              <span>На MachstDu вы можете найти подходящего исполнителя за несколько минут. Многие из них готовы приступить к работе в тот же день, а иногда в тот же час.</span>
            </div>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </section>
</template>

<script>
    export default {
        name: "AdvantagesSection"
    }
</script>

<style lang="sass" scoped>
  .how-etap-3-content-criteries-item
    display: inline-block
    width: 40%
    margin-bottom: 10px
    opacity: .6
</style>
