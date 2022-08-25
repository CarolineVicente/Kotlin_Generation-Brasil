class Cliente(
    var nome: String,
    var idade: Int,
    var sexo: String,
    var cpf: String,
    var rg: String,
    var localidade: String,
    var email: String
) {

    var cadastroEmail = false

    constructor(
        nome: String,
        idade: Int,
        sexo: String,
        cpf: String,
        rg: String,
        localidade: String,
        email: String,
        cadastroEmail: Boolean
    ) : this(nome, idade, sexo, cpf, rg, localidade, email) {
        this.cadastroEmail = cadastroEmail
    }

    fun simCadastrarEmail(){

        println("Deseja receber nossas atualizações?")
        var cadastroEmail = readln().toBoolean()

        if (cadastroEmail){
            println("Sucesso! Agora você receberá todas nossas atualizações no seu e-mail")
        }else{
            println("Que pena. Você não receberá nossas atualizações por e-mail")
        }
    }
}