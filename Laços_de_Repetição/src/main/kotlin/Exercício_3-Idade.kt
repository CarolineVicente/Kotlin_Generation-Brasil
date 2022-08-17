fun main() {

    /*
    3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    idade for =-99. (WHILE)
    */

    var menores = 0
    var maiores = 0

    while (true) {

        println("Digite a sua idade: ")
        var idade = readln().toInt()

        if (idade <= 20) {

            idade == menores
            menores++

        } else if (idade >= 50) {

            idade == maiores
            maiores++

        }

        if (idade <= -99) {
            break
        }
    }

    println("Total de pessoas com menos de 21 anos: ${menores - 1}")
    println("Total de pessoas com mais de 50 anos: $maiores")

}