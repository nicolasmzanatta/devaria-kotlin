/*
- Escrever um programa que recebe alguns produtos como argumento, -OK
- Validar se esses produtos estão na lista de itens disponíveis do mercado. -OK
- Caso estejam, avisar o usuário quais produtos tem -OK
- E quais não tem -OK
- Por último, exibir a lista de produtos disponíveis ordenados por ordem alfabética do mercado, para que o usuário possa pedir na próxima vez. -OK
*/
fun main(argumentos : Array<String>) {

    // validar se vieram produtos nos argumentos
    if(argumentos.isEmpty()){
        println("Favor informar sua lista de produtos para verificarmos a disponibilidade!")
        return
    }

    val produtosDisponiveis = arrayOf("PÃO", "BOLACHA", "QUEIJO", "ARROZ", "FEIJÃO", "OVO", "FRANGO",
        "AZEITE", "ÓLEO")

    val produtosRequisitadosDisponiveis = argumentos.filter { produtoRequisitado ->
                produtosDisponiveis.contains(produtoRequisitado.toUpperCase())
    }                 //melhor começar sempre pela menor lista

    for(produtoRequisitadoDisponivel in produtosRequisitadosDisponiveis){
        println("Este produto nós temos: $produtoRequisitadoDisponivel")
    }

    val produtosRequisitadoNaoDisponivel = argumentos.filter { produtoRequisitado ->
                !produtosDisponiveis.contains(produtoRequisitado.toUpperCase())
    }

    produtosRequisitadoNaoDisponivel.forEach { produtoNaoDisponivel -> println("Este produto nós" +
    " não temos infelizmente: $produtoNaoDisponivel")
    }

    val produtosOrdenados = produtosDisponiveis.sortedBy { produto -> produto }
    produtosOrdenados.forEach { produto -> println("Confira este produto disponível: $produto") }

 }