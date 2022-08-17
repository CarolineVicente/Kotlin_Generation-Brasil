fun main() {

    /*
    4- Uma empresa desenvolveu uma pesquisa para saber as características
    psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
    era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
    (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
    agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
    pessoas, calcule e mostre: (WHILE)
     o número de pessoas calmas;
     o número de mulheres nervosas;
     o número de homens agressivos;
     o número de outros calmos;
     o número de pessoas nervosas com mais de 40 anos;
     o número de pessoas calmas com menos de 18 anos.
    */

    var cont = 0
    var idade = 0
    var sexo = 0
    var opc = 0
    var calmas = 0
    var mNerv = 0
    var hAgre = 0
    var outCalm = 0
    var pNerv40 = 0
    var pCalma18 = 0

    while (cont < 3) {

        println("*** Pessoa: ${cont + 1} ***")

        println("Digite a sua idade: ")
        idade = readln().toInt()

        println("Orientação Sexual (1-feminino / 2-masculino / 3-Outros) :")
        sexo = readln().toInt()

        println("Você é (1 - Calmo(a)/ 2 - Nervoso(a) / 3 - Agressivo(a)) :")
        opc = readln().toInt()

        if (opc == 1) {
            calmas++
        }

        if (sexo == 1 && opc == 2) {
            mNerv++
        }

        if (sexo == 2 && opc == 3) {
            hAgre++
        }

        if (sexo == 3 && opc == 1) {
            outCalm++
        }

        if (idade > 40 && opc == 2) {
            pNerv40++
        }

        if (idade < 18 && opc == 1) {
            pCalma18++
        }

        cont++
    }

    println("O número de pessoas calmas é: $calmas")
    println("O número de mulheres nervosas é: $mNerv")
    println("O número de homens agressivos é: $hAgre")
    println("O número de outros calmos é: $outCalm")
    println("O número de pessoas nervosas com mais de 40 anos é de: $pNerv40")
    println("O número de pessoas calmas com menos de 18 anos é de: $pCalma18")

}