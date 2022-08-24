package Exercício_de_herança

import Exercício_de_herança.Animal

class Cachorro(nome: String, idade: Int, sexo: String) : Animal(nome, idade, sexo) {

    override fun emitirSom() {
        println("O cachorro está latindo!")
    }

    override fun correr() {
        println("O cachorro está correndo!")
    }


    override fun toString(): String {
        return "O Cachorro se chama $nome, tem a idade de $idade anos e é do sexo $sexo\n."
    }

}