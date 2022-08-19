fun main() {

    /*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    - Armazenar dados da List;
    - Remover dados da list;
    - Atualizar dados da list;
    - Apresentar todos os dados da list.
     */

    println("*** ESTOQUE DA LOJA ***")

    println("Tamanho da List: ${estoque.size}")

    while (true) {
        println()
        println("1 - Adicionar itens ao estoque")
        println("2 - Remover itens do estoque")
        println("3 - Atualizar nome do item no estoque")
        println("4 - Exibir Items do Estoque")
        println("5 - Sair")
        println()
        println("Opção: ")

        when (readln().toInt()) {
            1 -> addItem()
            2 -> removeItem()
            3 -> attNomePeca()
            4 -> getItems()
            5 -> break
            else -> println("Opção Inválida")
        }
    }
}



