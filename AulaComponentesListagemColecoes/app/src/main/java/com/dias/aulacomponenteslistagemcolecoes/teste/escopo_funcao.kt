package com.dias.aulacomponenteslistagemcolecoes.teste

class Pessoa {
    //Tem variaveis associadas a pessoa

    val nome: String = ""

}
//1
var nome = "Gabriel"//Escopo Global

fun executar() {
    //val nome = "executou novo nome camilla"//Escopo Local
    nome = "executou novo nome camilla"
}

fun main() {
    //nome = "Gabriel"

    //Executar função
    //2
    executar()
    //3
    nome = "voltou para o nome Gabriel"
    println(nome)
}