package com.dias.aulacomponenteslistagemcolecoes.teste

class Matematica {
    //Metodo
    fun somar(n1: Int, n2: Int) : Int {
        return n1 + n2
    }
}

/*//Função
fun somar(n1: Int, n2: Int) : Int {
    return n1 + n2
}*/

/*Esse parâmetro é como se foce uma variavel
Só que quando ele está no contexto de uma função ou metodo chamamos de parametro
fun calcular(texto: String ) {

}
*/

//Parametro que pode receber uma função inteira
fun calcular(funcao: (Int, Int) -> Int) {
    val retorno = funcao(10,10)
    println(retorno)
}
/*//Função convencional
fun executar() {
    println("Executar")
}

//Função Inline
fun executar2() = println("Executar")*/

/*class Botao {
    //Unit significa uma função sem retorno
    fun configurarCliqueBotao( nome: String, funcao: () -> Unit) {
        funcao()
        println("Nome: $nome")
    }
}*/

class Botao {
    //Unit significa uma função sem retorno
    fun configurarCliqueBotao(funcao: (String) -> Unit) {
        funcao("Gabriel")
    }
}

fun main () {

    val botao = Botao()
    botao.configurarCliqueBotao { nome ->
        println("Executou função lambda executou nome: $nome")
    }

    //Função Lambda
    /*val funcaoLambda = { nome: String, idade: Int ->
        println("Executar nome: $nome idade: $idade")
    }*/

    //funcaoLambda("Gabriel", 24)
    //Como passar uma funcao para o metodo
    //calcular(::somar )
    /*val matematica = Matematica()
    calcular(matematica::somar)*/
    //Estou acessando uma classe :: recurso da classe
    //val matematica = Matematica()
    //val retorno = matematica.somar(10, 10)
    //val retorno = somar(10, 10)
    //println(retorno)
}