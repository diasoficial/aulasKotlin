package com.dias.aulacomponenteslistagemcolecoes.teste

fun converterMaiuscula(texto: String) : String {
    return texto.uppercase()
}

fun main() {
    val lista = listOf("Gabriel", "Pedro", "Ana", "Maria")

    /*
    val novaLista = mutableListOf<String>()
    //colocar todos eles com letras maiuscula

    lista.forEach { nome ->
        novaLista.add(nome.uppercase())
    }
    println(novaLista)
    */

    /*
    O item que estiver na lista
    for(nome in lista) {
        println(nome.uppercase())
    }
    */

    /*val novaLista = lista.map { nome ->
        converterMaiuscula(nome)
        //nome.uppercase()
        //"+ ${nome.uppercase()}"
    }*/

    val novaLista = lista.map { it.uppercase() }

    println(novaLista)
}