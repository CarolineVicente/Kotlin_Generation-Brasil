fun main() {

    /*
    2- Faça um programa que entre com três números e coloque em ordem crescente.
    */

    println("Digite o primeiro número: ")
    val num1 = readln().toInt()

    println("Digite o segundo número: ")
    val num2 = readln().toInt()

    println("Digite o terceiro número: ")
    val num3 = readln().toInt()

    if (num2 in (num3 + 1) until num1){

        println("Os números escolhidos ordem crescente: $num1, $num2, $num3")

    }else if (num3 in (num2 + 1) until num1){

        println("Os números escolhidos ordem crescente: $num1, $num3, $num2")

    }else if (num1 in (num3 + 1) until num2){

        println("Os números escolhidos ordem crescente: $num2, $num1, $num3")

    }else if (num3 in (num1 + 1) until num2){

        println("Os números escolhidos ordem crescente: $num2, $num3, $num1")

    }else if (num1 in (num2 + 1) until num3){

        println("Os números escolhidos ordem crescente: $num3, $num1, $num2")

    }else{

        println("Os números escolhidos ordem crescente: $num3, $num2, $num1")

    }

}