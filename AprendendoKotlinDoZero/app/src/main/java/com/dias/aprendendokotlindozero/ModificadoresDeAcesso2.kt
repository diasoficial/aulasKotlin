package com.dias.aprendendokotlindozero

open class Carro {

    //Atributo / Propriedade
    //var modelo = ""

    //Metodo
    protected open fun injetarCombustivel() {
        println("Injeção do combustível")
    }

    fun acelerar(){
        injetarCombustivel()
        println("Acelerar o carro")
    }
}

class Gol : Carro() {
    override fun injetarCombustivel() {
        super.injetarCombustivel()
    }
}

class Ferrari : Carro() {

}

fun main() {
    val gol = Gol()
    gol.acelerar()

    //Estancia
    //val carro = Carro()
    //carro.acelerar()
}