<template>
  <section class="s-find-task s-wide">
    <v-container fluid>
      <v-row>
        <v-col cols="12" class="s-find-task-heading">
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
              <h2 class="mb-7">Alle Aufgaben</h2>
              <p>Отклики на задания доступны только для <router-link to="/executors">исполнителей</router-link> MAchstDu</p>
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
          <v-card class="px-7 py-8">
            <v-card
              class="mx-auto pb-2 px-2 mb-8"
              max-width="100%"
              outlined
            >
              <v-list-item three-line>
                <v-list-item-content>
                  <div class="overline mb-4">Дата добавления 12-11-2020</div>
                  <v-list-item-title class="headline mb-1">Разработать дизайн лендинга</v-list-item-title>
                  <div class="mt-2 mb-3">
                    <span class="task-price py-2 px-4">5 000 €</span>
                  </div>
                  <v-list-item-subtitle>улица Николая Клюева, 67, посёлок Марьино</v-list-item-subtitle>
                  <v-list-item-subtitle>20 апреля, 19:00 — 21 апреля, 20:00</v-list-item-subtitle>
                </v-list-item-content>

                <div class="d-flex align-center">
                  <div class="task-user mt-3">
                    <div class="task-user-type">Заказчик:</div>
                    <div class="task-user-name" style="font-weight: 600">Scurtu Andrei</div>
                    <div class="task-user-comments d-flex" style="font-size: 15px; opacity: .6">
                      <div class="task-user-comments-text">Comments:</div>
                      <v-icon size="20" class="ml-1 mr-1">comment</v-icon>
                      <span class="task-user-comments-number">2</span>
                    </div>
                  </div>

                  <v-list-item-avatar
                    tile
                    size="80"
                    color="grey"
                  ></v-list-item-avatar>
                </div>

              </v-list-item>

              <v-card-actions>
                <v-btn to="/task-details" min-width="110" depressed color="success">Подробнее</v-btn>
                <v-btn to="/make-offer" depressed color="error">Сделать предложение</v-btn>
              </v-card-actions>
            </v-card>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </section>

</template>

<script>
    export default {
        name: "FindTask",
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
  .task-price
    background-color: rgb(255, 243, 224)
    border-radius: 10px
    font-size: 19px
    letter-spacing: 1px
  .task-user-comments
    font-size: 17px
  .s-find-task-heading
    a
      color: #ff5252
      text-decoration: none
</style>
