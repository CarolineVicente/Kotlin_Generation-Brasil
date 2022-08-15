fun main(){

    var soma: Int = 0
    for(i in 0..500){

        if(i % 2 != 0 && i % 3 == 0){

            println(i)
            soma = soma + i

        }
    }
    print(soma)
}