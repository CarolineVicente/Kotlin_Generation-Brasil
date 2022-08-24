import Exercício_de_herança.Cachorro
import Exercício_de_herança.Cavalo
import Exercício_de_herança.Preguica

fun main() {

    /*
    1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela),
    utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a
    todos os animais fique na classe Exercício_de_herança.Animal:

    2- Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e
    invoque o método que emite o som de cada um de forma polimórfica, isto é, independente do
    tipo de animal.
     */

    println("Digite o nome do animal: ")
    val nome = readln()

    println("Digite a idade do animal: ")
    val idade = readln().toInt()

    println("Digite o sexo do animal: ")
    val sexo = readln()

    println("Qual a espécie do animal? ")
    println("1- Cachorro\n" +
            "2- Cavalo\n" +
            "3- Preguiça\n")
    var resp = readln().toInt()

    when (resp){

        1 -> {
            val cachorro = Cachorro (nome, idade, sexo)
            cachorro.emitirSom()
            cachorro.correr()
            println(cachorro)
        }
        2 -> {
            val cavalo = Cavalo (nome, idade, sexo)
            cavalo.emitirSom()
            cavalo.correr()
            println(cavalo)
        }
        3 -> {
            val preguica = Preguica (nome, idade, sexo)
            preguica.emitirSom()
            preguica.subirArvore()
            println(preguica)
        }

    }

}