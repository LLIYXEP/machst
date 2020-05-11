<template>
  <v-dialog
    v-model="dialogSelect"
    max-width="290"
  >
    <v-card>
      <v-card-title class="headline">Use Google's location service?</v-card-title>

      <v-card-text>
        Let Google help apps determine location. This means sending anonymous location data to Google, even when no apps are running.
      </v-card-text>

      <v-card-actions>
        <v-spacer></v-spacer>

        <v-btn
          color="green darken-1"
          text
          @click="dialogSelect = false"
        >
          Disagree
        </v-btn>

        <v-btn
          color="green darken-1"
          text
          @click="dialogSelect = false"
        >
          Agree
        </v-btn>
      </v-card-actions>
    </v-card>
  </v-dialog>
</template>

<script>
    export default {
        name: "SelectExecutorDialog",
        props: {
            dialogSelect: Boolean
        },
        data() {
        }
    }
</script>

<style scoped>

</style>
