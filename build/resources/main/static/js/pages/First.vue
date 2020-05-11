<template>
  <div class="first-page">
    <connect-section></connect-section>
    <categories-section></categories-section>
    <how-section></how-section>
    <advantages-section></advantages-section>
  </div>
</template>

<script>
    import ConnectSection from "../components/firstPage/ConnectSection.vue";
    import CategoriesSection from "../components/firstPage/CategoriesSection";
    import HowSection from "../components/firstPage/HowSection";
    import AdvantagesSection from "../components/firstPage/AdvantagesSection";

    export default {
        name: "First",
        components: {AdvantagesSection, HowSection, CategoriesSection, ConnectSection}
    }
</script>

<style lang="sass" scoped>

</style>
