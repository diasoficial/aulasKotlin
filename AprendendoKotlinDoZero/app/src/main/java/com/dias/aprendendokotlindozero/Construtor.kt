package com.dias.aprendendokotlindozero
/* Modelo 1
// Construtor primário
class Usuario constructor(nome: String, sobrenome: String) {

    var nome: String = ""
    var sobrenome: String = ""

    init {//Inicializar
        this.nome = nome
        this.sobrenome = sobrenome
        println("Objeto Inicializado")
        println("Nome: $nome Sobrenome: $sobrenome")
    }
}

fun main() {
    val usuario = Usuario("Gabriel", sobrenome = "Dias")
    //usuario.nome = "Gabriel"
}
*/
/*
// Construtor primário
class Usuario constructor(
    var nome: String = "",
    var sobrenome: String = ""
) {

    /*
    var nome: String = ""
    var sobrenome: String = ""
    */

    init {//Inicializar
        this.nome = nome
        this.sobrenome = sobrenome
        println("Objeto Inicializado")
        println("Nome: $nome Sobrenome: $sobrenome")
    }

    // Construtor secundário
    constructor(nome: String): this(nome, "") {
        println("Construtor secundário")
    }
}

fun main() {
    val usuario = Usuario("Gabriel")
    //usuario.nome = "Gabriel"
}
*/