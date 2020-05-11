<template>
  <v-app>
    <v-card class="overflow-hidden">
      <top-toolbar></top-toolbar>
      <v-content style="padding-top: 200px; min-height: 1300px">
        <router-view></router-view>
      </v-content>
    </v-card>
    <footer-part></footer-part>
  </v-app>

</template>

<script>
    import TopToolbar from "./js/components/templates/TopToolbar";
    import FooterPart from "./js/components/templates/FooterPart";
    export default {
        components: {FooterPart, TopToolbar},
        data() {
            return {

            }
        },
    };
</script>

<style lang="sass">


</style>
