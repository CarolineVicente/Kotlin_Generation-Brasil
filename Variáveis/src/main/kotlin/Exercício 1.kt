fun main(){

    /*
    1 - O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.
     */

    print("Digite a sua idade: ")
    val idade = readln().toInt()

    print("Em qual ano estamos? ")
    var ano = readln().toInt()

    println("Você já fez aniversário esse ano? Responda: Sim ou Não " )
    var resp = readln()!!

    if(resp == "sim" || resp =="Sim"){
        print("Seu ano de nascimento é em ${ano - idade}")
    }
    else if(resp == "não" || resp =="Não")  {
        print("Seu ano de nascimento é em ${(ano - 1) - idade}")
    }
    else{
        println("Responda: Sim ou Não")
    }
}