<template>
  <section class="first-page-connect s-wide">
    <v-container fluid>
      <v-row>
        <v-col cols="12">
          <h2>Сервис поиска исполнтьелей и заказчиков</h2>
        </v-col>
        <v-col cols="12" sm="5" offset-sm="1" class="d-flex align-center justify-center">
          <div class="first-page-connect-content">
            <h3 class="mb-2">Присоеденяйтесь</h3>
            <h4 class="mb-3">К сервису услуг ``Machst Du``</h4>
            <v-divider class="mb-2" style="width: 70%"></v-divider>
            <v-divider class="mb-3" style="width: 50%"></v-divider>
            <p>Бесплатный сервис поиска специалистов и исполнителей</p>
            <div class="first-page-connect-content-btns">
              <v-btn
                to="/tasks"
                depressed
                color="error"
              >Найти задания
              </v-btn>
              <v-btn
                to="/login"
                class="ml-8"
                outlined
                color="success"
              >Регистрация
              </v-btn>
            </div>
          </div>
        </v-col>
        <v-col cols="12" sm="5" class="d-flex align-center justify-center">
          <div class="first-page-connect-image">
            <img src="assets/images/connect.png">
          </div>
        </v-col>
      </v-row>
    </v-container>
  </section>
</template>

<script>
    export default {
        name: "ConnectSection"
    }
</script>

<style lang="sass" scoped>
  .first-page-connect-content
    h4
      color: #ff5252
</style>
