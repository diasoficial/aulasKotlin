package com.dias.aulacomponenteslistagemcolecoes.teste



fun main() {

    val lista = arrayOf("Gabriel", "Maria", "Pedro", "Ana")
    //println(lista.contains("Joao"))
    //println(lista[0])
    //println(lista.size)
    //println(lista.indexOf("Gabriel"))
    //println(lista.first())
    //println(lista.last())
    //val novaLista = lista.plus("Joao")
    //forEach percorre cada item para fazer a exibição
    //forEach = Para cada item
    lista.shuffle()
    lista.forEach { item ->
        println(item)
    }
}