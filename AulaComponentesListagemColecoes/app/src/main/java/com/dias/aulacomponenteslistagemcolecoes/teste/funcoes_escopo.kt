package com.dias.aulacomponenteslistagemcolecoes.teste

data class Produto(
    var nome: String,
    var preco: Double
){
    fun desativar() {
        println("Produto ${com.dias.aulacomponenteslistagemcolecoes.teste.nome} com preco: $preco foi desativado")
    }
}

//Pode salvar o produto em um banco de dados, ou api
fun salvarProduto(produto: Produto){

}

class AlertaMensagem {
    fun configurarTitulo(titulo : String) = println(titulo)
    fun configurarDescricao(descricao : String) = println(descricao)

    fun configurarCancelar() = println("Acao de cancelar")
    fun configurarConfirmar() = println("Acao de confirmar")
}

fun main() {
    /*
    //o usuario pode ter o produto ou não
    var produto: Produto? = null
    //usuario é que pode escolher ou não ter o produto
    produto = Produto("Notebook", 1200.00)
    */

    /* * LET *
    Forma 1
    if(produto != null) {
        produto.preco = 1100.00
        salvarProduto(produto)
    }


    Forma 2
    val novoProduto = produto?.let {
        it.preco = 1100.00
        //salvarProduto(produto)
        it
    }



    produto?.let {
        it.preco = 1100.00
        salvarProduto(it)
    }

    Se existir um produto ele exibe o nome se não ele exibe null
    println(produto?.nome)
    println(produto?.preco)
    */

    /* RUN
    produto?.let { produto ->
        salvarProduto(produto)
    }

    produto?.run {
        desativar()
    }
    */

    /* WITH
    val novoObjeto = with(produto) {
        desativar()
        this
    }
    */

    /*APPLY

    val alertaMensagem = AlertaMensagem()
    /*alertaMensagem.configurarTitulo("Confirmar salvar?")
    alertaMensagem.configurarDescricao("Deseja salvar o produto?")
    alertaMensagem.configurarCancelar()
    alertaMensagem.configurarConfirmar()*/

    alertaMensagem.apply {
        configurarTitulo("Confirmar salvar?")
        configurarDescricao("Deseja salvar o produto?")
        configurarCancelar()
        configurarConfirmar()
    }
    */

    /*ALSO*/

    val lista = listOf("Gabriel", "Ana", "Pedro")

    lista
        .map { it.uppercase() }
        .also { println(it) }
}