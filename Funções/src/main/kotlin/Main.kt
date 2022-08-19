fun main() {

    // Exercício criar a calculadora funcional, com as 4 operações básicas (adição, subtração, multiplicação e divisão).

    println("*** Calculadora **")

    println("Digite o primeiro número: ")
    var n1 = readln().toDouble()

    println("Digite o segundo número: ")
    var n2 = readln().toDouble()

    println("Faça um calculo de: 1- adicão (+) | 2- subtração (-) | 3- multiplicação (x) | 4- divisão (x)")
    var resp = readln().toDouble()

    println(" O resultado da operação é: ${operacao(n1, n2, resp)}")
}


