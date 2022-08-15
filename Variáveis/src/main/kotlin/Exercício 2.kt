import kotlin.math.pow

fun main(){

    /*
    2 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele.
     */

    print("Digite um valor para o diâmetro de um círculo: ")
    var diametro = readln().toDouble()

    var raio = diametro / 2

    var area = 3.14 * raio.pow(2)

    var perimetro = 2 *  3.14 * raio

    println("O valor da área do cículo é de ${"%.2f".format(area)}cm")
    println("O valor do perímetro do cículo é de ${"%.2f".format(perimetro)} cm")
}