fun main(argumentos : Array<String>) {

    // for subindo
    for(indice in argumentos.indices){
        println("Percorrendo os argumentos posição: $indice e valor: ${argumentos[indice]}")
    }
    // for descendo
    for(indiceDecrescente in argumentos.size-1 downTo 0) {
        println("Percorrendo os argumentos de forma decrescente posição: $indiceDecrescente" +
                " e valor: ${argumentos[indiceDecrescente]}")
    }
    // for each
    for(argumento in argumentos){
        println("Percorrendo os argumentos com foreach valor: $argumento")
    }

    //while

    //do while

}