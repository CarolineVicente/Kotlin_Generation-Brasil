package Exercício_de_herança

class Preguica(nome: String, idade: Int, sexo: String) : Animal(nome, idade, sexo){

    override fun emitirSom() {
        println("A preguiça está guinchando")
    }

    fun subirArvore(){
        println("A preguiça está subindo na árvore!")
    }

    override fun toString(): String {
        return "A preguiça se chama $nome, tem a idade de $idade anos e é do sexo $sexo\n."
    }
}