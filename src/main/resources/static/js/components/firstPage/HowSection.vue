<template>
  <section class="first-page-how s-wide">
    <v-container fluid>
      <v-row>
        <v-col cols="12">
          <h2>С MachstDu вы экономите на услугах до 70%. <br> Как это возможно?</h2>
        </v-col>
        <v-col cols="12">
          <div class="how-etap-1 mb-12">
            <v-row>
              <v-col cols="12" sm="4" offset-sm="2">
                <div class="how-img-wrap d-flex justify-center">
                  <div>
                    <v-img max-height="350px" width="470px" class="img-responsive" src="assets/images/cr-task.png"></v-img>
                  </div>
                </div>
              </v-col>
              <v-col cols="12" sm="4" class="d-flex align-center">
                <div class="how-etap-1-content">
                  <h3 class="mb-2">1. Создайте задание</h3>
                  <p>Опишите своими словами задачу, которую <br> требуется выполнить.</p>
                  <v-btn
                    outlined
                    color="success"
                  >Создать задание
                  </v-btn>
                </div>
              </v-col>
            </v-row>
          </div>
          <div class="how-etap-2 mb-12">
            <v-row>
              <v-col cols="12" sm="4" offset-sm="2" class="d-flex align-center">
                <div class="how-etap-2-content">
                  <h3 class="mb-2">2. Исполнители предложат вам свои услуги и цены</h3>
                  <p>Уже через пару минут вы начнете получать предложения от исполнителей, готовых выполнить ваше
                    задание.</p>
                </div>
              </v-col>
              <v-col cols="12" sm="4">
                <div class="how-img-wrap d-flex justify-center">
                  <div style="max-width: 100%">
                    <v-img max-height="300px" class="img-responsive" src="assets/images/exec.png"></v-img>
                  </div>
                </div>
              </v-col>
            </v-row>
          </div>
          <div class="how-etap-3">
            <v-row>
              <v-col cols="12" sm="4" offset-sm="2">
                <div class="how-img-wrap d-flex justify-center">
                  <div style="max-width: 100%">
                    <v-img max-height="320px" class="img-responsive" src="assets/images/best-ang.png"></v-img>
                  </div>
                </div>
              </v-col>
              <v-col cols="12" sm="4" class="d-flex align-center">
                <div class="how-etap-3-content">
                  <h3 class="mb-2">3. Выберите лучшее предложение</h3>
                  <p>Вы сможете выбрать подходящего исполнителя, <br> по разным критериям:</p>
                  <div class="how-etap-3-content-criteries d-flex">
                    <div class="d-flex flex-column" style="width: 50%">
                      <span class="how-etap-3-content-criteries-item"><v-icon class="mr-2">euro_symbol</v-icon>Стоимость услуг</span>
                      <span class="how-etap-3-content-criteries-item"><v-icon class="mr-2">grade</v-icon>Рейтинг</span>
                    </div>
                    <div class="d-flex flex-column" style="width: 50%">
                      <span class="how-etap-3-content-criteries-item"><v-icon class="mr-2">comment</v-icon>Отзывы заказчиков</span>
                      <span class="how-etap-3-content-criteries-item"><v-icon class="mr-2">perm_identity</v-icon>Примеры работ</span>
                    </div>
                  </div>
                </div>
              </v-col>
              <v-col cols="12" class="mt-12">
                <div class="d-flex justify-center mb-2">
                  <v-btn class="text-center" large color="error">Разместите задание прямо сейчас</v-btn>
                </div>
                <p class="d-block text-center">и найдите исполнителя за несколько минут</p>
              </v-col>
            </v-row>
          </div>
        </v-col>

      </v-row>
    </v-container>
  </section>
</template>

<script>
    export default {
        name: "HowSection"
    }
</script>

<style lang="sass" scoped>
  .how-etap-3-content-criteries-item
    margin-bottom: 10px
    opacity: .6
</style>
