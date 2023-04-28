<script>

export default {
    name: "CarroCard",
    props: {
        carro: {
            type: Object,
            default: new Object
        }
    }
}

</script>
<template>
    <div class="col-lg-3 col-md-4 col-sm-1">
        <!-- <router-link to="`/carros/${id}`" class="text-decoration-none text-reset"> -->
            <div class="card shadow-sm">
                <img src="../assets/carro-esporte.png" class="card-img-top">

                <div class="card-body text-center">
                    <h5 class="card-title">{{carro.id}} - {{carro.nomeCarro}}</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Marca: {{carro.marca}}</h6>
                    <div class="d-flex justify-content-between align-items-center">
                        <h6 class="card-subtitle mb-2 text-muted">Placa: {{carro.placa}}</h6>
                        <h6 class="card-subtitle mb-2 text-muted">Ano: {{carro.ano}}</h6>
                        <h6 class="card-subtitle mb-2 text-muted">Renavam: {{carro.codRenavam}}</h6>
                        <h6 class="card-subtitle mb-2 text-muted">Diária: {{carro.valorDiaria}}</h6>
                    </div>
                </div>
            </div>
        <!-- </router-link> -->
    </div>
</template>