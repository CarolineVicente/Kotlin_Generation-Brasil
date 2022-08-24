package Exercício_de_herança

open class Animal(
    var nome: String,
    var idade: Int,
    var sexo: String
    ) {

    open fun emitirSom(){

    }

    open fun correr (){
        println("Correndo")
    }

}