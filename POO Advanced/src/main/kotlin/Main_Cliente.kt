import encap.Cliente
import java.lang.Exception

fun main() {

    /*
    1. Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
    nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
    A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
    Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
     */

    try {
        println("Digite o seu nome: ")
        var nome = readln()

        println("Digite o seu endereço: ")
        var endereco = readln()

        println("Digite o número do seu telefone: ")
        var telefone = readln()

        val cliente = Cliente(nome, endereco, telefone)

        while (true) {

            println()
            println("*** Menu ***")
            println("1- Adicionar Compra")
            println("2- Remover Compra")
            println("3- Listar Compra")
            println("4- Sair")

            println("Opção: ")

            val opc = readln().toInt()

            when (opc) {

                1 -> {
                    print("Digite o produto que você deseja adicionar: ")
                    val prod = readln()
                    cliente.addCompra(prod)
                }

                2 -> {
                    print("Digite o produto que você deseja remover: ")
                    val prod = readln()
                    cliente.removeCompra(prod)
                }

                3 -> {
                    cliente.exibirCompras()
                }

                4 -> break
                else -> println("Opção Inválida")
            }
        }
    } catch (e: Exception) {
        println(e.message)
    }
}



