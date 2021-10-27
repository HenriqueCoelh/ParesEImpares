// 2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares.

fun main(args: Array<String>) {

    var num = 0
    var cont1 = 0
    var cont2 = 0

    for ( i in 1..10){
        print("Digite um número: ")
        num = readLine()!!.toInt()

        if (num %2 == 0){
            cont1++
        } else{
            cont2++
        }
    }

    println("A quantidade de números pares que você digitou é: $cont1 ")
    println("A quantidade de números ímpares que você digitou é: $cont2 ")





}