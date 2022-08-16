fun main() {

   /*
   1- Faça um programa que receba três inteiros e diga qual deles é o maior.
   */

    println("Digite o primeiro número inteiro: ")
    val num1 = readln().toInt()

    println("Digite o segundo número inteiro: ")
    val num2 = readln().toInt()

    println("Digite o terceiro número inteiro: ")
    val num3 = readln().toInt()


    if(num1 > num2 && num1 > num3){

        println("O maior valor digitado foi: $num1")

    }else if(num2 > num1 && num2 > num3){

        println("O maior valor digitado foi: $num2")

    }else{

        println("O maior valor digitado foi: $num3")

    }
}