package com.dias.aprendendokotlindozero
/*
//Classe que vai ser usada nos dois - Classe pai, super classe e ABSTRATA
//Em vez de usar OPEN posso utilizar ABSTRACT
abstract class Animal {
    var cor = ""
    var tamanho = ""//Pequeno, Médio e Grande
    var peso = 0.0

    //Metodos
    open fun correr() {
        println("Correr como um ")
        /*
        */
    }
    abstract fun dormir()
    // Fazendo isso você obriga a toda classe que herdar Animal() a usar o metodo dormir
}

//Subclasse ou Classe filha, CONCRETA
class Cao : Animal() {
    fun latir() = println("Latindo")
    // O cão corre de uma maneira diferente do passaro
    //Polimorfismo de sobreposição
    override fun correr(){
        super.correr()
        println("cão com 4 patas")
    }

    override fun dormir() {
        println("Dormir como um cão")
    }
}

class Passaro : Animal(){
    fun voar() = println("Voando")
    override fun correr(){
        super.correr()
        println("passaro com 2 perninhas")
    }
    override fun dormir(){
        println("Dormir como um passaro")
    }
}

fun main() {

    /*val cao = Cao()
    cao.correr()
    //cao.latir()

    val passaro = Passaro()
    passaro.correr()
    //passaro.voar()*/
}

 */