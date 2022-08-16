import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    /*
    4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
    número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    ímpar exiba o número elevado ao quadrado.
     */

    println("Digite um número e descubra se ele é Par ou Ímpar: ")
    var num = readln().toDouble()

    if(num % 2.0 == 0.0) {

        var raiz = sqrt(num)
        println("O número digitado é: PAR, e sua raíz quadrada é: ${"%.2f".format(raiz)}")

    }else{

        var elevado = num.pow(2)
        println("O número digitado é: ÍMPAR, e seu valor ao quadrado é: $elevado")

    }

}