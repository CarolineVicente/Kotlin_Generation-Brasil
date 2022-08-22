fun main() {

     /*
     1) Crie uma classe cliente e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto cliente, defina as instancias deste
    objeto e apresente as informações deste objeto no console.
     */

    println("Digite o seu nome: ")
    var nome = readln()

    println("Qual a sua idade: ")
    var idade= readln().toInt()

    println("Qual o seu gênero? ")
    var sexo= readln()

    println("Digite o número do seu CPF: ")
    var cpf= readln()

    println("Digite o número do seu RG: ")
    var rg= readln()

    println("Qual o endereço de sua residência? ")
    var localidade= readln()

    println("Qual o seu e-mail? ")
    var email= readln()


    val cliente1 = Cliente(
        nome, idade,
        sexo, cpf,
        rg, localidade,
        email, true
    )

    println("Dados do Cliente: ")

    println()

    println("Nome: ${cliente1.nome}")
    println("Idade: ${cliente1.idade}")
    println("Sexo: ${cliente1.sexo}")
    println("CPF: ${cliente1.cpf}")
    println("RG: ${cliente1.rg}")
    println("Endereço: ${cliente1.localidade}")
    println("E-mail: ${cliente1.email}")

    cliente1.simCadastrarEmail()

}