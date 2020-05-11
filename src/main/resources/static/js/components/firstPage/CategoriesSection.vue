<template>
  <section class="first-page-categories s-wide s-shadow">
    <v-container fluid>
      <v-row>
        <v-col cols="12" class="wrap d-flex flex-column justify-center mb-12">
          <h2 class="mb-3">Более 1 500 000 исполнителей</h2>
          <span class="d-flex justify-center">готовы помочь вам в решении самых разнообразных задач</span>
        </v-col>

        <v-col cols="12" sm="6" md="4" v-for="n in 9" :key="n">
          <v-hover
            v-slot:default="{ hover }"
            close-delay="100"
          >
            <v-card
              :elevation="hover ? 16 : 2"
              class="mx-auto py-4"
              max-width="90%"
              outlined
            >
              <v-list-item class="category-item">
                <v-list-item-content>
                  <div class="category-item-title d-flex flex-column justify-center">
                    <v-icon size="38" color="error" style="width: 100%" class="mb-3">gavel</v-icon>
                    <h2 class="headline mb-1">Юридические услуги {{n}}</h2>
                  </div>
                  <v-list-item-subtitle class="text-center">Greyhound divisely hello coldly fonwderfully
                  </v-list-item-subtitle>
                </v-list-item-content>
              </v-list-item>
            </v-card>
          </v-hover>
        </v-col>
        <v-col cols="12" class="d-flex justify-center">
          <v-btn
            class="mt-10"
            min-width="250"
            x-large
            depressed
            color="success"
          >Все категории
          </v-btn>
        </v-col>
      </v-row>
    </v-container>
  </section>
</template>

<script>
    export default {
        name: "CategoriesSection"
    }
</script>

<style lang="sass" scoped>
  .category-item
    transition: all .5s ease
    &:hover
      cursor: pointer
</style>
