class Aviao(
    var modelo: String,
    var anoDeFabricacao: Int,
    var numeroDeSerie: String,
    var destino: String
) {

    var numeroDePassageiros = 0

    constructor(
        modelo: String,
        anoDeFabricacao: Int,
        numeroDeSerie: String,
        numeroDePassageiros: Int,
        destino: String
    ) : this(modelo, anoDeFabricacao, numeroDeSerie, destino) {
        this.numeroDePassageiros = numeroDePassageiros
    }
    fun numPassageirosAVoar(passageiros: Int) {

        numeroDePassageiros -= passageiros
        println("O número utilizados de assentos neste vôo é: $numeroDePassageiros")
    }

}