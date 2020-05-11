import Vue from 'vue'

const tasks = Vue.resource('/tasks-list{/id}')

export default {
  add: task => tasks.save({}, task),
  update: task => tasks.update({id: task.id}, task),
  remove: id => tasks.remove(id),
  list: id => Vue.http.get(`/tasks-list`)
  // page: page => Vue.http.get('/tasks-list', {params: { page }})
}
