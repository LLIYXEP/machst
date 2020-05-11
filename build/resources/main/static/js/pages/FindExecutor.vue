<template>
  <section class="s-find-executor s-wide">
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
              <h2 class="mb-7">Alle Darsteller</h2>
              <p>Станьте исполнителем и оставляйте свой предложения на <router-link to="/tasks">задания</router-link> MachstDu</p>
            </v-alert>
          </div>
        </v-col>
        <v-col cols="3">
          <v-card
            max-width="500"
            class="mx-auto"
          >
            <v-toolbar
              color="#9e9e9e"
              dark
            >

              <v-toolbar-title>Все категории</v-toolbar-title>

              <v-spacer></v-spacer>

            </v-toolbar>

            <v-list>
              <v-list-group
                v-for="item in items"
                :key="item.title"
                v-model="item.active"
                :prepend-icon="item.action"
                no-action
                color="success"
              >
                <template v-slot:activator>
                  <v-list-item-content>
                    <v-list-item-title v-text="item.title"></v-list-item-title>
                  </v-list-item-content>
                </template>

                <v-list-item
                  v-for="subItem in item.items"
                  :key="subItem.title"
                  @click=""
                >
                  <v-list-item-content>
                    <v-list-item-title v-text="subItem.title"></v-list-item-title>
                  </v-list-item-content>
                </v-list-item>
              </v-list-group>
            </v-list>
          </v-card>
        </v-col>
        <v-col cols="9">
          <v-card class="px-2 py-4">
            <v-row>
              <v-col v-for="n in 6" :key="n" cols="12" sm="4">
                <v-card
                  outlined
                  class="mx-auto pt-5"
                  max-width="374"
                >
                    <v-img
                      class="mx-auto"
                      height="250"
                      width="250"
                      max-width="100%"
                      src="https://cdn.vuetifyjs.com/images/cards/cooking.png"
                    ></v-img>

                  <v-card-title class="pb-0">
                    Scurtu Andrei
                    <v-btn icon>
                      <v-icon class="ml-2">mdi-heart</v-icon>
                    </v-btn>
                  </v-card-title>

                  <v-card-text>
                    <v-row
                      align="center"
                      class="mx-0"
                    >
                      <v-rating
                        :value="4.5"
                        color="amber"
                        dense
                        half-increments
                        readonly
                        size="14"
                      ></v-rating>

                      <div class="grey--text ml-4">4.5 (413)</div>
                    </v-row>

                    <div class="my-0 subtitle-2">
                      Выполненных заданий  - 1545
                    </div>

                    <div class="mb-4 mt-0 subtitle-2">
                      Был(а) на сайте вчера 20:13
                    </div>

                    <div>Добрый день всем! Осуществляем СРОЧНЫЕ пешие и авто доставки. Оплата:Сбербанк,Альфа,НДС,без НДС.</div>
                  </v-card-text>

                  <v-divider class="mx-4"></v-divider>

                  <v-card-actions class="d-flex justify-center my-2">
                    <v-btn
                      color="success"
                      depressed
                    >
                      Предложить задание
                    </v-btn>
                  </v-card-actions>
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
        name: "FindExecutor",
        data() {
            return {
                items: [
                    {
                        action: 'local_activity',
                        title: 'Attractions',
                        items: [
                            {title: 'List Item'},
                        ],
                    },
                    {
                        action: 'restaurant',
                        title: 'Dining',
                        active: true,
                        items: [
                            {title: 'Breakfast & brunch'},
                            {title: 'New American'},
                            {title: 'Sushi'},
                        ],
                    },
                    {
                        action: 'school',
                        title: 'Education',
                        items: [
                            {title: 'List Item'},
                        ],
                    },
                    {
                        action: 'directions_run',
                        title: 'Family',
                        items: [
                            {title: 'List Item'},
                        ],
                    },
                    {
                        action: 'healing',
                        title: 'Health',
                        items: [
                            {title: 'List Item'},
                        ],
                    },
                    {
                        action: 'content_cut',
                        title: 'Office',
                        items: [
                            {title: 'List Item'},
                        ],
                    },
                    {
                        action: 'local_offer',
                        title: 'Promotions',
                        items: [
                            {title: 'List Item'},
                        ],
                    },
                ],
            }
        },
    }
</script>

<style lang="sass" scoped>
  .s-find-executor-heading
    a
      color: #ff5252
      text-decoration: none
</style>
