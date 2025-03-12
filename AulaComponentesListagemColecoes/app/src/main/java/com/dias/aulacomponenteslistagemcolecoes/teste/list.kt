package com.dias.aulacomponenteslistagemcolecoes.teste

data class Cliente(
    val nome: String,
    val idade: Int
)

fun main() {

    val cliente1 = Cliente("Gabriel", 24)
    val cliente2 = Cliente("Ana", 22)

    /*val listaClientes = mutableListOf(
        Cliente("Gabriel", 24),
        Cliente("Ana", 22)
    )*/

    /*val listaArray = arrayOf("Gabriel", "Ana")
    //Com arrayOf não consigo fazer com que o proprio usuario digite os dados
    //Com o array eu posso mudar os valores, mas não posso adicionar mais itens

    //Alterar valor
    listaArray[0] = "Gabriel Alterado"

    listaArray.forEach { item ->
        println(item)
    }*/

    val lista = mutableListOf("Gabriel", "Ana", "Maria", "Pedro")

    /*
    listaArray[0] = "Gabriel Alterado"

    val novaLista = listOf("Marcelo", "Marcela")
    listaArray.addAll(novaLista)
    listaArray.add("Marcia")
    //listaArray.remove("Ana")
    listaArray.removeAt(1)
    */
    //listaClientes.clear()
    //listaClientes.size
    //println(lista[1])

    val novaLista = lista.shuffled()
    novaLista.forEach { nome ->
        println(nome)
        //println("${cliente.nome} - ${cliente.idade}")
    }
}