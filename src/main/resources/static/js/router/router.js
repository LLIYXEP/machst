import Vue from 'vue'
import VueRouter from 'vue-router'
import CreateTask from "pages/CreateTask.vue";
import FindTask from "pages/FindTask";
import First from "pages/First";
import FindExecutor from "pages/FindExecutor";
import Login from "pages/Login";
import Profile from "pages/Profile";
import ExecutorCheck from "pages/ExecutorCheck";
import MyTasks from "../pages/MyTasks";
import Comments from "../pages/Comments";
import TaskDetails from "../pages/TaskDetails";

Vue.use(VueRouter)


const routes = [
  { path: '/', component: First },
  { path: '/create-task', component: CreateTask },
  { path: '/tasks', component: FindTask },
  { path: '/task-details', component: TaskDetails },
  { path: '/executors', component: FindExecutor },
  { path: '/profile', component: Profile },
  { path: '/executor-check', component: ExecutorCheck },
  { path: '/my-tasks', component: MyTasks },
  { path: '/comments', component: Comments },
  { path: '/login', component: Login },
]

export default new VueRouter({
  // Убрать хэш тэг (#) из пути
  mode: 'history',
  routes
})
