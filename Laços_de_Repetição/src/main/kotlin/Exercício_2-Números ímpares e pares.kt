fun main(){

    /*
    2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
    */

    var par = 0
    var impar = 0

    for( i in 1..10) {

        val rnds = (0..20).random()

        if (rnds % 2 == 0) {
            par ++

        } else {
            impar ++

        }

    }
    println("A qtd de números pares é: $par")
    println("A qtd de números ímpares é: $impar")
}

