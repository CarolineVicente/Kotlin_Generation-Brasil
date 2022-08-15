import java.util.Scanner

fun main(){
    var reader = Scanner(System.`in`)


    println("Escolha uma opção\n"+
            "1- Exibir tabela\n" +
            "2- Ir direto ao programa\n" +
            "Resposta: ")
    var escolha = reader.nextInt()

    when(escolha){
        1  -> {
            println("Infantil A = 5 a 7 anos\n" +
                    "Infantil B = 8 a 11 anos\n" +
                    "Juvenil A = 12 a 13 anos\n" +
                    "Juvenil B = 14 a 17 anos\n" +
                    "Adultos = Maiores de 18 anos")

        }
        2 -> {
            println("Digite a idade do nadador: ")
            var idade = reader.nextInt()

            if(idade >= 5 && idade <= 7){
                println("Infantil A: " + idade + " anos")
            }
            if(idade >= 8 && idade <= 11){
                println("Infantil B: " + idade + " anos")
            }
            if(idade >= 12 && idade <= 13){
                println("Juvenil A: " + idade + " anos")
            }
            if(idade >= 14 && idade <= 17){
                println("Juvenil B: " + idade + " anos")
            }
            if(idade >= 18){
                println("Adulto: " + idade + " anos")
            }
        }
    }
}
