import java.util.Scanner

fun main(){
    val habitantes: Int = 4
    var mediaFilhos: Double = 0.0

    var totalSalario: Double = 0.0
    var totalFilhos: Int =  0

    var maiorSalario: Double = 0.0
    var mediaSalario: Double = 0.0
    var percentualSalario: Double = 0.0

    var totalPercentual: Double = 0.0

    val reader = Scanner(System.`in`)

    for(i in 1..4){

        print("\nDigite seu salário: ")
        var salario = reader.nextDouble()

        print("Número de filhos: ")
        var numeroFilhos = reader.nextInt()


        totalSalario += salario
        totalFilhos += numeroFilhos

        if(salario > maiorSalario){
            maiorSalario = salario
        }

        if (salario <= 100){
            totalPercentual = totalPercentual + 1
        }

    }
    mediaSalario = totalSalario/habitantes
    mediaFilhos = (totalFilhos/habitantes).toDouble()

    percentualSalario = (totalPercentual / habitantes ) * 100

    println("\nMédia de salário = " + mediaSalario + "\nMédia de número de filhos = " + mediaFilhos)
    println("\nMaior Salario = " + maiorSalario + "\nPercentual de pessoas que recebem até 100 reais = " + percentualSalario)
}