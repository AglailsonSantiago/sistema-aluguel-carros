<script>
// @ is an alias to /src
import { ref, computed, onBeforeMount } from 'vue'
import { onBeforeRouteUpdate, useRoute } from 'vue-router'

import { getAllCarros } from '../service/carro'
import CarroCard from '../components/CarroCard.vue'
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'HomeView',
  components: {
    HelloWorld,
    CarroCard
  },

  data() {
    return {
      carros: []
    }
  },

  mounted() {
    this.getCarros()
  },

  methods: {
    async getCarros() {
      const response = await getAllCarros()
      this.carros = response
    }
  }
}
</script>

<template>
  <div class="home">

    <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3" v-for="carro in carros" :key="carro.id">
      <CarroCard :carro="carro" />
    </div>

  </div>
</template>


