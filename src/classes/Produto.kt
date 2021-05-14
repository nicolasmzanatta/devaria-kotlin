package classes

class Produto (val nome : String, val preco : Double){  //em uma linha ja criou a classe e os atributos
    fun exibirDadosProdutos () : String {
        return "Produto nome: $nome e valor R$ $preco"
    }
}