package com.dias.aulacomponenteslistagemcolecoes.teste

fun main() {
    val listaLanches = listOf("Hamburguer", "Batata Frita")
    val listaEntradas = listOf("Coxa de Frango", "Pipoca")

    //val novaLista = listaLanches.union(listaEntradas)
    val listaExclusao = listOf("Batata Frita", "Pipoca")
    val novaLista = listaEntradas + listaLanches
    val listaCompleta = novaLista - listaExclusao
    println(listaCompleta)
}