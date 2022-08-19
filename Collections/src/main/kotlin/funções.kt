val estoque = mutableListOf<String>()

fun addItem() {
    println("Nome do item que você deseja adicionar ao estoque: ")
    val roupa = readln()
    estoque.add(roupa)

    if (roupa != "") {
        println("Peça $roupa adicionado com sucesso!")
    } else {
        println("Valor Inválido")
    }
}


fun removeItem() {

    while (true) {
        println("Digite uma peça para ser excluída do estoque: ")
        val tipoRoup = readln()

        if (estoque.contains(tipoRoup)) {
            estoque.remove(tipoRoup)
            println("Peça $tipoRoup, excluída com sucesso")
            break
        } else {
            println("A peça $tipoRoup não existe lista do estoque")
        }
    }
}

fun attNomePeca() {
    println("Digite o nome do Item a ser renomeado: ")
    val tipoRoup = readln()

    if (estoque.contains(tipoRoup)) {
        val posicao = estoque.indexOf(tipoRoup)
        println("Atualize o nome da peça no estoque : ")
        estoque[posicao] = readln()
        println("Peça atualizada com sucesso!")

    } else {
        println("A peça $tipoRoup não existe na lista do estoque")
    }
}


fun getItems() {

    println()

    println(estoque)

}