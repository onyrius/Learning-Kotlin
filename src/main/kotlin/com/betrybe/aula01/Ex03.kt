package com.betrybe.aula01

import kotlin.math.pow


fun main() {
    print("Digite o seu peso: ")
    var peso = readLine()!!.replace(",", ".").toDouble()
    print("Digite o sua altura: ")
    var altura = readLine()!!.replace(",", ".").toDouble()
    print("Seu IMC é: ${calculaIMC(altura, peso)}")
}
// .....

fun calculaIMC(altura: Double, peso: Double) = "%.2f".format(peso / (altura * altura))