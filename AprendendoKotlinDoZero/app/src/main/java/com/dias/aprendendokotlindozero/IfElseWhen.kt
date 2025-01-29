package com.dias.aprendendokotlindozero

// if, when(switch),

fun main() {
    /*
    val notaAluno = 5
    val condicao = notaAluno >= 6


    // IF
    val opcao = 5

    if (opcao == 1) {
        println("Cartao de credito")
    } else if (opcao == 2) {
        println("Extrato bancario")
    } else if (opcao == 3) {
        println("Saldo")
    } else {
        println("Opcao invalida")
    }

    // IF IN
    val opcao = 9
    if (opcao in 1..3) {
        println("opcoes selecionadas: 1, 2, 3")
    } else if (opcao in 4..8) {
        println("opcoes selecionadas: 4 ate 8")
    }
    */

    //WHEN(switch)
    val opcao = 6
    when (opcao) {
        1 -> println("Cartao de credito")
        2 -> println("Extrato bancario")
        in 3..5 -> println("Saldo")
        else -> println("Opcao invalida")
    }

}