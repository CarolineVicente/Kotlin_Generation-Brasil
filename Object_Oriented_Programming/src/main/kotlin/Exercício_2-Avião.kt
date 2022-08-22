fun main(){

    /*
    2) Crie uma classe avião e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto avião, defina as instancias deste
    objeto e apresente as informações deste objeto no console.
     */

    println("Digite o modelo do avião: ")
    var modelo = readln()

    println("Digite o ano de fabricação: ")
    var anoDeFabricacao = readln().toInt()

    println("Digite o número de série: ")
    var numeroDeSerie = readln()

    println("Digite o limite máximo de passageiros: ")
    var numeroDePassageiros = readln().toInt()

    println("Qual o destino do vôo?")
    var destino = readln()

    var aviao1 = Aviao(
        modelo,
        anoDeFabricacao,
        numeroDeSerie,
        numeroDePassageiros,
        destino
    )

    println("Dados do Avião: ")

    println()

    println("Nome do modelo: ${aviao1.modelo}")
    println("Ano de Fabricação: ${aviao1.anoDeFabricacao}")
    println("Número de série: ${aviao1.numeroDeSerie}")
    println("Número de passageiros: ${aviao1.numeroDePassageiros}")
    aviao1.numPassageirosAVoar(150)
    println("O destino do vôo é ${aviao1.destino}")
}