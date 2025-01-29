package com.dias.aprendendokotlindozero
/*
import android.net.http.UrlRequest.Status

// Aqui iremos utilizar o enum para evitar que outras pessoas erre alguma palavra
// e o pedido não seja atualizado
// aguardando_aprovacao
// pedido_realizado, pagamento_confirmado
// pedido_enviado, pedido_entregue

enum class StatusPedido {
    AGUARDANDO_APROVACAO, //0
    PEDIDO_REALIZADO, //1
    PAGAENTO_CONFIRMADO, //2
    PEDIDO_ENVIADO, //3
    PEDIDO_ENTREGUE //4
}

class Pedido (
    var total: Double = 0.0,
    var itens: String = "",
    var statusPedido: StatusPedido = StatusPedido.AGUARDANDO_APROVACAO
) {

}

fun main() {
    //Tela de compra
    val pedido = Pedido(125.90, "camiseta, livro")

    //Pagamento com cartão
    //pedido.statusPedido = StatusPedido.PEDIDO_REALIZADO

    //Transportadora vai atualizar o status
    //pedido.statusPedido = StatusPedido.PEDIDO_ENVIADO
    // Exibir o ENUM
    println("StatusPedido; ${StatusPedido.AGUARDANDO_APROVACAO.ordinal}")

    //Histórico de compras
    if(pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO) {
        println("O seu pedido foi realizado")
    } else if(pedido.statusPedido == StatusPedido.PEDIDO_ENVIADO) {
        println("O seu pedido foi enviado")
    } else if(pedido.statusPedido == StatusPedido.PAGAENTO_CONFIRMADO) {
        println("O seu pagamento foi confirmado")
    }
}

 */