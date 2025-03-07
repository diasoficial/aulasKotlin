package com.dias.aulacomponenteslistagemcolecoes.teste

//Estamos construindo um aplicativo de pergunta
data class Pergunta(val pergunta: String, val respostaCerta: Int)

fun main() {
    val pergunta1 = Pergunta("Qual a pergunta?", 1)//*
    val pergunta2 = Pergunta("Qual a pergunta?", 2)

    //Pega o primeiro valor que a pergunta e depois pega a resposta que PERGUNTA1 está recebendo
    val (pergunta, resposta) = pergunta1
    /*Isso será utilizado quando você for percorrer uma serie de itens e
    fica muito mais fácil você pegar os dados desta maneira
     */

    println(pergunta)
    println(resposta)

    //OU

    /*
    val p = pergunta1.pergunta
    val r = pergunta1.respostaCerta
    */
}