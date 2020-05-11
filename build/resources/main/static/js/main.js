import Vue from 'vue'
import 'styles/main.sass'
import 'api/resource'
import App from '../App.vue'
import Vuetify from 'vuetify'
import 'vuetify/dist/vuetify.min.css'
import router from "router/router"
import VueCurrencyInput from 'vue-currency-input'

Vue.use(VueCurrencyInput)
Vue.use(Vuetify)

new Vue({
  el: '#app',
  router,
  vuetify: new Vuetify(),
  render: h => h(App)
})

