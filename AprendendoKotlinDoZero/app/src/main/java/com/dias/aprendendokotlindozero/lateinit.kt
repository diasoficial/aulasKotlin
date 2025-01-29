package com.dias.aprendendokotlindozero

// 1) valor 2) null 3) Lateinit
class Produto {
    //var descricao: String = ""
    //var descricao: String? = null
    lateinit var descricao: String
}

fun main() {
    val produto = Produto()
    produto.descricao = "Notebook"
    println(produto.descricao)
}