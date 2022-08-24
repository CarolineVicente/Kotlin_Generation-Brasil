package Exercício_de_herança

class Cavalo(nome: String, idade: Int, sexo: String) : Animal (nome, idade, sexo) {

    override fun emitirSom() {
        println("O cavalo está relinchando!")
    }

    override fun correr() {
        println("O cavalo está correndo!")
    }

    override fun toString(): String {
        return "O Cavalo se chama $nome, tem a idade de $idade anos e é do sexo $sexo\n."
    }
}