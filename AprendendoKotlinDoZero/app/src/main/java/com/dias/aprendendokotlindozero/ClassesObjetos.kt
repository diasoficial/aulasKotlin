package com.dias.aprendendokotlindozero
//Jogo Mario Kart

//Função
/* Aqui eu posso usar ela na fun main
fun acelerar() {
    println("Acelerar")
}
*/


//Classe 1º
class Jogador {

    //Propriedade 2º
    var kart     = ""
    var pneu     = ""
    var planador = ""

    //Metodo 3º
    fun acelerar( aceleracao: Int = 0) {
        println("Acelerar na velocidade: $aceleracao Km/h")
    }

    //Metodo que Retorna
    /*
    fun retornarPoder(): String {
        return "Casco vermelho"
    }
    */

    fun retornarPoder(): String = "Casco vermelho"


}

fun main() {

    //Aqui o que não pode mudar é o jogador/objeto e não os atributos que estão dentro dele
    val jogador = Jogador()
    //jogador.kart = "Kart do Mario"
    //jogador.acelerar(aceleracao = 80)
    val poder = jogador.retornarPoder()
    println(poder)
    //println(jogador.kart)

}