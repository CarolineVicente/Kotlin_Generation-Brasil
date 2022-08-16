fun main() {

    /*
    3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
    categoria ela se encontra:
     10-14 infantil
     15-17 juvenil
     18-25 adulto
    */

    println("Digite a sua idade para descobrir em qual categoria você esta: ")
    val idade = readln().toInt()

    when(idade){
        in 10 .. 14 -> println("Categoria infantil: 10-14")
        in 15 .. 17 -> println("Categoria juvenil: 15-17")
        in 18 .. 25 -> println("Categoria adulto: 18-25")
    }
}