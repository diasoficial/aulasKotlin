package com.dias.aulacomponenteslistagemcolecoes.teste

//DRY -> Dont Repeat Yourself (Não repita código) (ok)
//Divisão de responsabilidades (ok)
//Classes devem utilizar outras classes (ok)
//Alto acoplamento e Baixo acoplamento (ok)
class Musico(val instrumento: Instrumento) {
    fun tocar() {
        //val violao = Violao()//Alto acoplamento
        println("Musico tocando")
        instrumento.sendoTocado()//Violao tem um metodo
    }
}

//Herança e Interface (Contrato) -> Composição
interface Instrumento {
    //Objetivo da interface é dizer que qualquer violao que queira se comportar como um instrumento deve ser de certa maneira
    fun sendoTocado()
    //Para ser um instrumento ele precisa ter o metodo sendoTocado
}

//Int e String - tipos: Violao e Bateria
class Violao : Instrumento {// Ele é do Tipo violao. Instrumento
    override fun sendoTocado() {
        println("Utilizar cordas")
        println("para tocar o violao")
    }
    fun ajustarCordas() {
        println("Ajustar cordas")
    }
}

class Bateria : Instrumento {
    override fun sendoTocado() {
        println("Utilizar baquetas")
        println("para tocar o a bateria")
    }
    fun ajustarBaqueta() {
        println("Ajustar baqueta")
    }
}

class Guitarra : Instrumento {
    override fun sendoTocado() {
        println("Utilizar cordas")
        println("Utilizar tambem ajuste de som")
        println("para tocar a guitarra")
    }
}

class Activity {
    fun putExtra() {

    }
}

fun main() {
    /* 1
    //Violao e Bateria passam a ser de dois tipos, Instrumento e Violao / Bateria

    //val violao : Instrumento = Violao()
    //val bateria : Instrumento = Bateria()

    //Tela 1 (violao)
    val violao1 = Violao()
    val musico1 = Musico(violao1)
    musico1.tocar()

    println("+++++++++++++++++++++++++")

    //Tela 2 (violao)
    val violao2 = Violao()
    val musico2 = Musico(violao2)
    musico2.tocar()

    println("+++++++++++++++++++++++++")

    //Tela 3 (bateria)

    val bateria1 = Bateria()
    val musico3 = Musico(bateria1)//Bateria como Instrumento (uso apenas métodos de instrumento os métodos de bateria vão ser desconsiderados)
    musico3.tocar()

    println("+++++++++++++++++++++++++")

    //Tela 4 (guitarra)
    val guitarra = Guitarra()
    val musico4 = Musico(guitarra) // Dois tipos: Guitarra e Instrumento
    musico4.tocar()
    */


}

//Quando uso herança eu uso ()
//Quando uso interface eu apenas escrevo o nome da interface