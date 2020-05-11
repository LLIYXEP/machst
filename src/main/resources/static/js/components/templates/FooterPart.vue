<template>
  <v-card>
    <v-footer
      padless
    >
      <v-card
        flat
        tile
        width="100%"
        class="red lighten-1 text-center"
      >

        <v-container>
          <v-row>
            <v-col cols="12" sm="3">
              <div class="footer-w1">
                <ul>
                  <li>Частые вопросы</li>
                  <li>Как стать исполнителем</li>
                </ul>
              </div>
            </v-col>
            <v-col cols="12" sm="3">
              <div class="footer-w2">
                <ul>
                  <li>Создать задание</li>
                  <li>Найти задание</li>
                </ul>
              </div>
            </v-col>
            <v-col cols="12" sm="3">
              <div class="footer-w3">
                <ul>
                  <li>Исполнители</li>
                  <li>Контакты</li>
                </ul>
              </div>
            </v-col>
            <v-col cols="12" sm="3">
              <div class="footer-w4">
                <ul>
                  <li><v-icon>donut_large</v-icon></li>
                  <li><v-icon>donut_large</v-icon></li>
                </ul>
              </div>
            </v-col>
          </v-row>
        </v-container>

        <v-divider></v-divider>

        <v-card-text class="white--text">
          © {{ new Date().getFullYear() }} — <strong>MachstDu</strong>
        </v-card-text>

      </v-card>
    </v-footer>
  </v-card>
</template>

<script>
    export default {
        name: "FooterPart"
    }
</script>

<style lang="sass" scoped>
  .footer
    &-w1, &-w2, &-w3, &-w4
      font-size: 18px
      ul
        color: #ffffff
        li
          margin-bottom: 8px

  .footer-w4
    height: 100%
    ul
      height: 100%
      display: flex
      align-items: center
      justify-content: center
      li
        .v-icon
          color: #ffffff
          font-size: 30px
        &:first-child
          margin-right: 20px
</style>
