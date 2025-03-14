package com.dias.aulacomponenteslistagemcolecoes.teste

/*
data class Produto(
    val nome: String
)
*/

fun main() {
    //0 -> "Gabriel" 1 -> "Ana"
    //val listaItens = listOf("Gabriel", "Ana")
    //Lógica: 102545 to "Notebook", 105632 to "iPhone"
    //val lista = mapOf(0 to "Gabriel", 1 to "Ana" )
    //val lista = mutableMapOf(102545 to Produto("Notebook"), 105632 to "iPhone" )
    val lista = mutableMapOf("nome" to "Gabriel", "Cidade" to "Mogi Mirim" )
    println(lista["nome"])
    println(lista.size)
    //lista.put("idade", 20)
    lista["idade"] = "20"
    lista.remove("nome")
    lista.forEach { produto ->
        println("${produto.key} - ${produto.value}")
    }
}