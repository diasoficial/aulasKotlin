package com.dias.aprendendokotlindozero

class Car(
    var modelo: String = "",
    var velocidade: Int = 0
) {
    //Faz sentido utilizar assim porque é uma informação que não varia,
    //seria usado em todos os carros por exemplo.
    companion object {
        const val VELOCIDADE_MAX_PERMITIDA = 120
        fun exibirMensagemVelocidadeMaxima(){
            println("The maximum speed is:  $VELOCIDADE_MAX_PERMITIDA")
        }
    }

    fun exibirInformacoes(){
        println("Information: $modelo e $velocidade")
    }
}

class Usuario {
    companion object {
        fun verificarUsuarioLogado(): Boolean {
            //Verificação...
            return true
        }
    }
}

fun main() {

    val retorno = Usuario.verificarUsuarioLogado()
    println("Usuario logado: $retorno")


    //Criando instância ou objeto
    /*println("Velocidade Max: ${Car.VELOCIDADE_MAX_PERMITIDA}")
    Car.exibirMensagemVelocidadeMaxima()

    var fusca = Car("Fusca", 100)
    fusca.exibirInformacoes()

    var ferrari = Car("Ferrari", 200)
    ferrari.exibirInformacoes()

    println("PI: ${Math.PI}")
    */

}