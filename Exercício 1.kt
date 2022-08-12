import java.util.Scanner

fun main() {

    var num: Int = 0
    var totalSomatorio: Int = 0
    var media: Int = 0
    var totalValores: Int = 0

    val reader = Scanner(System.`in`)

    while (num >= 0){
        print("Digite um número: ")
        num = readLine()!!.toInt()

        if (num >= 0 ){

            totalValores +=1
            totalSomatorio += num
            media =(totalSomatorio/totalValores)

        }else if(num < 0){

            println("Somatória: " + totalSomatorio)
            println("Média: " + media)
            println("Total valores lidos: " + totalValores)

        }
    }



}