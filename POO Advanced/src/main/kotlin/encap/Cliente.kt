package encap

class Cliente(
    var nome: String,
    var endereco: String,
    var telefone: String
) {

    private val listaDeCompras = mutableListOf<String>()
    val listaCompras: List<String> = listaDeCompras

    init {
        if (nome.isBlank())
            throw Exception("Cadastro feito de maneira incorreta")
    }

    fun addCompra(compra: String) {
        if (compra.isNotBlank()) {
            listaDeCompras.add(compra)
            println("Produto adicionado com sucesso!")
        } else {
            println("Produto inválido")
        }
    }

    fun removeCompra(compra: String) {
        if (listaDeCompras.contains(compra)) {
            listaDeCompras.remove(compra)
            println("Produto removido com sucesso")
        } else {
            println("O produto $compra não existe na lista")
        }
    }

    fun exibirCompras() {
        println("*** Lista de Compras ***")
        listaDeCompras.forEach {
            println(it)
        }
    }


}