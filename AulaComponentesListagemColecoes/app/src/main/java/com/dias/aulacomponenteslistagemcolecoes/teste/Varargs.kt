package com.dias.aulacomponenteslistagemcolecoes.teste

class Usuario {
    fun salvarTelefones( vararg telefones: String) {

        for(telefone in telefones) {
            println("telefone: $telefone")
        }
    }
}

fun main() {

    val usuario = Usuario()
    usuario.salvarTelefones(
        "(019) 99999-5555",
        "(019) 99999-5855",
        "(019) 99999-5500",
        "(019) 99999-5585",
        "(019) 96666-5555"
    )

    /*val pessoa = Pessoa()
    pessoa.salvarTelefone(
        "(019) 99999-5555",
        "(019) 99999-5855",
        "(019) 99999-5500",
        "(019) 99999-5585",
        "(019) 96666-5555"
    )*/

}