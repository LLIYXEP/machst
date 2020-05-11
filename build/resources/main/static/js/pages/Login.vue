<template>
  <section class="s-registration s-wide">
    <v-container fluid>
      <v-row>
        <v-col cols="12" sm="8" offset-sm="2">
          <h2>{{loginHeader}}</h2>
        </v-col>

        <v-col cols="12" sm="6" offset-sm="3">
          <v-form v-model="dialog" persistent max-width="600px" min-width="360px">
            <div>
              <v-tabs v-model="tab" show-arrows background-color="success accent-4" icons-and-text dark grow>
                <v-tabs-slider color="success darken-4"></v-tabs-slider>
                <v-tab v-for="i in tabs" :key="i.name" @click="changeHeader(i.name)">
                  <v-icon large>{{ i.icon }}</v-icon>
                  <div class="caption py-1">{{ i.name }}</div>
                </v-tab>
                <v-tab-item>
                <v-card class="px-4">
                  <v-card-text>
                    <v-form ref="loginForm" v-model="valid" lazy-validation>
                      <v-row>
                        <v-col cols="12" class="mt-5">
                          <h4 class="text-center">Войти через</h4>
                        </v-col>
                        <v-col class="d-flex align-center flex-column mt-5 fast-login-btns" cols="12">
                          <div class="fast-login-btn-wrap">
                            <v-btn width="200px" large class="text-none fast-login-btn mb-6" color="error" >Google<v-icon>add</v-icon></v-btn>
                          </div>
                          <div class="fast-login-btn-wrap">
                            <v-btn width="200px" large class="text-none fast-login-btn " color="#45619b" >Facebook</v-btn>
                          </div>
                        </v-col>
                        <v-col cols="12" class="my-5">
                          <h4 class="text-center">Вход по паролю</h4>
                        </v-col>

                        <v-col cols="12">
                          <v-text-field outlined v-model="loginEmail" :rules="loginEmailRules" label="E-mail"
                                        required></v-text-field>
                        </v-col>
                        <v-col cols="12">
                          <v-text-field outlined v-model="loginPassword" :append-icon="show1?'eye':'eye-off'"
                                        :rules="[rules.required, rules.min]" :type="show1 ? 'text' : 'password'"
                                        name="input-10-1" label="Password" hint="At least 8 characters" counter
                                        @click:append="show1 = !show1" class="asas"></v-text-field>
                        </v-col>
                        <v-col class="d-flex" cols="12" sm="6" xsm="12">
                        </v-col>
                        <v-spacer></v-spacer>
                        <v-col class="d-flex justify-end ml-auto mt-5" cols="12" xsm="12" align-end>
                          <v-btn min-width="150" large :disabled="!valid" color="success" @click="validate"> Login</v-btn>
                          <v-btn large class="ml-6"  color="warning" @click="resetValidation">Reset Validation</v-btn>
                          <v-btn large class="ml-6" text >Забыли пароль?</v-btn>
                        </v-col>
                      </v-row>
                    </v-form>
                  </v-card-text>
                </v-card>
              </v-tab-item>
                <v-tab-item>
                  <v-card class="px-4">
                    <v-card-text>
                      <v-form ref="registerForm" v-model="validRegister" lazy-validation>
                        <v-row>
                          <v-col cols="12" class="mt-5">
                            <h4 class="text-center">Быстрая регистрация через</h4>
                          </v-col>
                          <v-col class="d-flex align-center flex-column mt-5 fast-login-btns" cols="12">
                            <div class="fast-login-btn-wrap">
                              <v-btn width="200px" large class="text-none fast-login-btn mb-6" color="error" >Google<v-icon>add</v-icon></v-btn>
                            </div>
                            <div class="fast-login-btn-wrap">
                              <v-btn width="200px" large class="text-none fast-login-btn " color="#45619b" >Facebook</v-btn>
                            </div>
                          </v-col>
                          <v-col cols="12" class="my-5">
                            <h4 class="text-center">Регистрация через сайт</h4>
                          </v-col>

                          <v-col cols="12" sm="6" md="6">
                            <v-text-field v-model="firstName" :rules="[rules.required]" label="First Name"
                                          maxlength="20" required></v-text-field>
                          </v-col>
                          <v-col cols="12" sm="6" md="6">
                            <v-text-field v-model="lastName" :rules="[rules.required]" label="Last Name" maxlength="20"
                                          required></v-text-field>
                          </v-col>
                          <v-col cols="12">
                            <v-text-field v-model="email" :rules="emailRules" label="E-mail" required></v-text-field>
                          </v-col>
                          <v-col cols="12">
                            <v-text-field v-model="password" :append-icon="show1 ? 'mdi-eye' : 'mdi-eye-off'"
                                          :rules="[rules.required, rules.min]" :type="show1 ? 'text' : 'password'"
                                          name="input-10-1" label="Password" hint="At least 8 characters" counter
                                          @click:append="show1 = !show1"></v-text-field>
                          </v-col>
                          <v-col cols="12">
                            <v-text-field block v-model="verify" :append-icon="show2 ? 'mdi-eye' : 'mdi-eye-off'"
                                          :rules="[rules.required, passwordMatch]" :type="show1 ? 'text' : 'password'"
                                          name="input-10-1" label="Confirm Password" counter
                                          @click:append="show2 = !show2"></v-text-field>
                          </v-col>
                          <v-spacer></v-spacer>

                          <v-col class="d-flex ml-auto mt-5" cols="12" sm="6" xsm="12">
                            <v-btn large  :disabled="!validRegister" color="success" @click="validateRegister">Register</v-btn>
                            <v-btn large class="ml-6"  color="warning" @click="resetRegValidation">Reset Validation</v-btn>
                          </v-col>
                        </v-row>
                      </v-form>
                    </v-card-text>
                  </v-card>
                </v-tab-item>
              </v-tabs>
            </div>
          </v-form>
        </v-col>
      </v-row>
    </v-container>
  </section>
</template>

<script>
    export default {
        name: "Login",
        data() {
            return {
                loginHeader: "Login form",
                dialog: true,
                tab: 0,
                tabs: [
                    {name: "Login", icon: "mdi-account"},
                    {name: "Register", icon: "mdi-account-outline"}
                ],
                valid: true,
                validRegister: true,
                firstName: "",
                lastName: "",
                email: "",
                password: "",
                verify: "",
                loginPassword: "",
                loginEmail: "",
                loginEmailRules: [
                    v => !!v || "Required",
                    v => /.+@.+\..+/.test(v) || "E-mail must be valid"
                ],
                emailRules: [
                    v => !!v || "Required",
                    v => /.+@.+\..+/.test(v) || "E-mail must be valid"
                ],

                show1: false,
                show2: false,
                rules: {
                    required: value => !!value || "Required.",
                    min: v => (v && v.length >= 8) || "Min 8 characters"
                }
            }
        },
        computed: {
            passwordMatch() {
                return () => this.password === this.verify || "Password must match";
            }
        },
        methods: {
            changeHeader(name) {
              if (name != 'Login') {
                  this.loginHeader = 'Registration form'
              } else {
                  this.loginHeader = 'Login form'
              }
            },
            validate() {
                if (this.$refs.loginForm.validate()) {
                    // submit form to server/API here...
                }
            },
            validateRegister() {
                if (this.$refs.registerForm.validate()) {
                    // submit form to server/API here...
                }
            },
            resetRegValidation() {
                this.$refs.registerForm.reset();
            },
            resetValidation() {
                this.$refs.loginForm.resetValidation();
            }
        },
    }
</script>

<style lang="sass" scoped>
  .fast-login-btn
    color: #ffffff
    font-size: 18px

</style>
