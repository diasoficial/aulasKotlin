package com.dias.aprendendokotlindozero

fun main () {
    /*
    //Array
    val nomes = arrayOf(
        "Gabriel", "Camilla"
    )
    //nomes[0] = "mudou"

    println( nomes[0])
     */
    /*
    //While - Enquanto for verdadeiro, faço
    var numero = 1
    //(numero <= 5)
    while (numero in 1 ..8) {
        println("Executou: $numero")
        numero++
    }
    */
    /*
    //FOR

    for (numero in 1..5) {
        println("Executou: $numero")
    }
    */

    val postagens = arrayOf(
        "Viagem para a praia",
        "Levei meu cachorro no veterinario",
        "Trilha com os amigos"
    )
    //Para cada POSTAGEM dentro de POSTAGENS vai percorrer e exibir
    for(postagem in postagens) {
        println("titulo: $postagem")
    }
    for((indice, postagem) in postagens.withIndex()) {
        println("$indice: $postagem")
    }
}