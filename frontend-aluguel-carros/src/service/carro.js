import { ref, computed } from 'vue'
import { api } from '../baseConfig'

export async function getAllCarros(){
    const { data } = await api.get('/carros')
    return data._embedded.carroes
}

