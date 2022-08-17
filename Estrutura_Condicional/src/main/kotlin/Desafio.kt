import java.time.LocalDateTime

fun main(){

    /*

    Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. Prazo - 17/08 as 21h

    Exemplo do sistema:

    Informe os anos:
    30
    Informe os meses:
    10
    Informe os dias:
    4
    Sua idade em dias é: 11280

     */


    val data = LocalDateTime.now()

    print("Quantos anos você tem? ")
    val idade = readln().toInt()

    print("Em qual mês você nasceu? ")
    val mes = readln().toInt()

    print("Em qual dia você nasceu? ")
    val dia = readln().toInt()

    val mesesAno = 12
    val diasMes = 30
    val diasVividos = (365 * idade) + (mes * diasMes) + dia

    println()

    println(" Sua idade " + idade)
    println(" Mês de nascimento " + mes)
    println(" A sua idade em dias é " + diasVividos)

}