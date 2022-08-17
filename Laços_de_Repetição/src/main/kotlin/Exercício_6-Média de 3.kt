fun main() {

    /*
    6- Escrever um programa que receba vários números inteiros no teclado. E no
    final imprimir a média dos números múltiplos de 3. Para sair digitar
    0(zero).(DO...WHILE)
    */

    var media = 0
    var soma = 0
    var contador = 0


    do {
        println("Digite um número: ")
        println("Para sair do programa digite o número 0")
        var num = readln().toInt()

        if (num % 3 == 0 && num != 0) {

            soma += num
            contador++
        }

    } while (num != 0)

    media = soma / contador

    println("A média dos números múltiplos de 3 é: $media")
}