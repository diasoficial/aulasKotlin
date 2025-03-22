package com.dias.aulacomponenteslistagemcolecoes.teste

fun main() {

    //val listaFrutas = listOf("Maça", "Laranja", "Banana")
    //val listaVendas = listOf(100, 500, 150, 1500, 800, 650)
    val nomes = listOf("Gabriel", "Ana", "Pedro")

    /*val novaLista = listaFrutas.filter { fruta ->
        //Regra para verificar cada um dos itens
        fruta == "Laranja"
    }*/

    //Vai filtrar e criar uma nova lista onde os valores são maior ou igual a 600
   /* val novaLista = listaVendas.filter { valor ->
        valor >= 600 //sempre condição (true or false)
    }*/

    //val novaLista = listaVendas.filter {it >= 500}
    val novaLista = nomes.filter {nome ->
        //Tudo o que tiver a letra A será adicionado na NovaLista
        nome.contains("a")// true se tive, false se não tiver
    }

    println(novaLista)
}