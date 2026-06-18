package com.betrybe.aula01

fun main(){
    print("Digite o primeiro número inteiro: ")
    val num1: Int = readLine()!!.toInt()
    print("Digite o segundo número inteiro: ")
    val num2: Int = readLine()!!.toInt()
    print("Digite o terceiro número inteiro: ")
    val num3: Int = readLine()!!.toInt()

    var result = ("O resultado é ${calcularMedia(num1, num2, num3)}")
    println(result)
}
//
//fun calcularMedia(a: Int, b: Int, c: Int): Int {
//    return (a + b + c)/3
//}

fun calcularMedia(a: Int, b: Int, c: Int) = (a + b + c)/3