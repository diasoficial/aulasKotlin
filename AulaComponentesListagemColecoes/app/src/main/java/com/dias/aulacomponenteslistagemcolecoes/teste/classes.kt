package com.dias.aulacomponenteslistagemcolecoes.teste

class Motorista(val nome: String) {

    fun exibirDadosMotorista() = println("Motorista: $nome")

    // Classe aninhada (Nested Class) = uma classe que está dentro de outra classe
    /*class Caminhao(val nomeCaminhao: String) {
        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao")
    }*/

    // Para acessar o nome que está dentro de motorista
    inner class Caminhao(val nomeCaminhao: String) {
        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao, Motorista: $nome")
    }
}

fun main() {
    //Usar com classe com inner
    val motorista = Motorista("Gabriel")
    val caminhao = motorista.Caminhao("FH 60")
    caminhao.exibirDadosCaminhao()

    //Usar com classe aninhada sem inner
    /*val caminhao = Motorista.Caminhao("FH 60")
    caminhao.exibirDadosCaminhao()*/

    /*val motorista = Motorista("Gabriel")
    motorista.exibirDadosMotorista()*/
}