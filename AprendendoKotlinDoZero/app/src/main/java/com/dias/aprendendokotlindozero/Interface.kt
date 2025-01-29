package com.dias.aprendendokotlindozero

interface Presidenciavel {
    fun candidatarSe()
}

abstract class Pessoa {
    //Metodos
    fun comer() = println("comer")

    /*
    Aqui todo mundo seria obrigado a se candidatar-se,
    mas apenas o jornalista quer se candidadar
     */

    //abstract fun candidatarSe()
}

class DesenvolvedorAndroid : Pessoa() {
    fun programar() = println("programar")
}
class DesenvolvedorWeb : Pessoa() {
    fun programar() = println("programar")
}
class Jornalista : Pessoa(), Presidenciavel {
    fun escreverNoticia() = println("Escrever noticia")
    override fun candidatarSe() {
        println("Fazendo o processo para se candidatar")
    }
}
class FuncionarioPublico : Pessoa() {

}


fun main() {

    val desenvolvedorAndroid = DesenvolvedorAndroid()
    desenvolvedorAndroid.comer()


    println("-------")

    val jornalista = Jornalista()
    jornalista.comer()
    jornalista.candidatarSe()

}