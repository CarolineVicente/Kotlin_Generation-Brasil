fun main() {

    /*
    5- Crie um programa que leia um número do teclado até que encontre um
    número igual a zero. No final, mostre a soma dos números
    digitados.(DO...WHILE)
     */

    var soma = 0

    do {
        val num = (0..9).random()
        soma += num

        print("$num ")

    } while (num != 0)

    println()

    println("A soma dos números digitados é: ${soma}")

}