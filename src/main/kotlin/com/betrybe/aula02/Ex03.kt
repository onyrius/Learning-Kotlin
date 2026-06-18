package com.betrybe.aula02

fun main(){
    print("Digite um número qualquer: ")
    var num1 = readln()
    descobreTipoNumero(num1)
    print("Digite outro número qualquer: ")
    var num2 = readln()
    descobreTipoNumero(num2)
    print("O número maior é: ${descobreNumeroMaior(num1, num2)}")

}

// Exercício de descoberta de tipo de número
fun descobreTipoNumero( num: String) {
    val entradaTratada = num.replace(",", ".")
    val eInteiro = entradaTratada.toIntOrNull()
    val eDouble = entradaTratada.toDoubleOrNull()

    if (eInteiro != null) {
        println("É um número inteiro: $eInteiro")
        return
    }
    if (eDouble != null ) {
        println("É um Double: $eDouble")
        return
    }
    println("Não é um número válido: $num")

}

fun descobreNumeroMaior( a: String, b: String): Double? {
    val num1 = a.replace(",", ".").toDouble()
    val num2 = b.replace(",", ".").toDouble()

    if (num1 < num2) {
        return num2
    } else if (num1 > num2) {
        return num1
    } else {
        print("Número inválido!")
    }
    return null
}