<template>
  <v-app-bar
    absolute
    color="#ea0037"
    dark
    shrink-on-scroll
    prominent
    src="assets/images/top2.jpg"
    fade-img-on-scroll

  >

    <template v-slot:img="{ props }">
      <v-img
        v-bind="props"
        gradient="to top right, rgb(34, 34, 34,.8), rgba(249, 163, 183,.5)"
      ></v-img>
    </template>

    <v-app-bar-nav-icon @click="drawer = true"></v-app-bar-nav-icon>

    <v-navigation-drawer
      v-model="drawer"
      absolute
      temporary
      height="700px"
      light
    >
      <v-list
        nav
        dense
      >
        <v-list-item-group
          active-class="deep-purple--text text--accent-4"
        >
          <v-list-item>
            <v-list-item-icon>
              <v-icon>mdi-home</v-icon>
            </v-list-item-icon>
            <v-list-item-title>Home</v-list-item-title>
          </v-list-item>

          <v-list-item>
            <v-list-item-icon>
              <v-icon>mdi-account</v-icon>
            </v-list-item-icon>
            <v-list-item-title><router-link to="/task-details">Task-details</router-link></v-list-item-title>
          </v-list-item>

        </v-list-item-group>
      </v-list>
    </v-navigation-drawer>

    <v-toolbar-title>MachstDu - Освободим вас от забот</v-toolbar-title>

    <v-spacer></v-spacer>

    <v-btn text to="/login" class="mt-2">Login</v-btn>

    <v-menu
      bottom
      left
    >
      <template v-slot:activator="{ on }">
        <v-btn
          icon
          v-on="on"
        >
          <v-icon>account_box</v-icon>
        </v-btn>
      </template>

      <v-list>
        <v-list-item
          v-for="(item, i) in items"
          :key="i"
        >
          <v-tab :to="item.link">{{ item.title }}</v-tab>
        </v-list-item>
      </v-list>
    </v-menu>

    <template v-slot:extension v-if="!drawer">
      <v-tabs align-with-title>
        <v-tab to="/">Главная</v-tab>
        <v-tab to="/create-task">Создать задание</v-tab>
        <v-tab to="/tasks">Найти задания</v-tab>
        <v-tab to="/executors">Исполнители</v-tab>
      </v-tabs>
    </template>
  </v-app-bar>
</template>

<script>
    export default {
        name: "TopToolbar",
        data() {
            return {
                items: [
                    {title: 'Профиль', link: '/profile'},
                    {title: 'Мои задания', link: '/my-tasks'},
                    {title: 'Отзывы', link: '/comments'},
                    {title: 'Стать исполнителем', link: '/executor-check'},
                    {title: 'Пополнить счёт', link: '/executor-check'},
                    {title: 'Сообщения', link: '/'},
                    {title: 'Кошелёк', link: '/'},
                    {title: 'Выход', link: '/logout'},
                ],
                drawer: false,
            }
        },
    }
</script>

<style scoped>

</style>
