package com.dias.aulacomponenteslistagemcolecoes.teste

fun main() {
    val listaNomes = listOf("Gabriel", "Ana", "Bruno", "Maria", "Zeus")
    val listaNumeros = listOf(2,1,3)

    //val novaListaNumeros = listaNumeros.sorted() // Ordenação ASC | A-Z | 0-9 |
    //val novaListaNumeros = listaNumeros.sortedDescending() // Ordenação DESC | Z-A | 9-0 |

    val ListaNomesAsc = listaNomes.sorted()
    val ListaNomesDesc = listaNomes.sortedDescending()

    println(ListaNomesAsc)
    println(ListaNomesDesc)
}