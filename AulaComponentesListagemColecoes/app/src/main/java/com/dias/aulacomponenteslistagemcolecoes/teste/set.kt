package com.dias.aulacomponenteslistagemcolecoes.teste

data class Carro(
    val nome: String,
    val marca: String
)

fun main() {

    //Você não pode acessar os indices para fazer a exibição
    //val lista = setOf("Gabriel", "Ana", "Pedro", "Ana")
    //val lista = mutableSetOf("Gabriel", "Ana", "Pedro", "Ana")
    val lista = mutableSetOf(
        Carro("Gol", "Volkswagem"),
        Carro("Brasilia", "Volkswagem")
    )
    lista.add(Carro("Astra", "Chevrolet"))
    //val novaLista = lista.plus("Ana")
    //println(lista.size)
    //println(lista.indexOf("Gabriel")) // Mostra o indice que está o gabriel

    //lista.add("Mariana")
    //lista.remove("Ana")
    //lista.clear()
    lista.forEach { carro ->
        println(carro.nome)
    }
}
