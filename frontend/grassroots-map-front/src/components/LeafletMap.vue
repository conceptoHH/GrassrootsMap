<template>
    <div>
        <h2>temp header</h2>
        <div id="map" style="height:90vh;"></div>
    </div>
</template>
<script setup>
import { ref, onMounted } from 'vue';
import "leaflet/dist/leaflet.css"
import * as L from 'leaflet'


const initialMap = ref(null);
const response = await fetch("http://127.0.0.1:8080/api/geo-points?minLng=0.0&minLat=0.0&maxLng=100.0&maxLat=100.0",{credentials: "omit"});
const obj = await response.json();

onMounted(() => {
    initialMap.value = L.map('map').setView([16.8535, -99.7984], 13)
    L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
        maxZoom: 19,
        attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
    }).addTo(initialMap.value)

});

console.log(obj)
</script>

