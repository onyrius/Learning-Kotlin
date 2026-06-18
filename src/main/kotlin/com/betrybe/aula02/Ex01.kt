package com.betrybe.aula02

fun main() {

    print("Insira seu salário atual: ")
//    salario = readLine()!!.replace(",", ".").toDouble()
    val salario = readlnOrNull()?.replace(",", ".")?.toDoubleOrNull() ?: 0.0

    println("Seu salário atual é $salario")
    println("Seu salário atualizado é ${atualizaSalario(salario)}")

}

fun atualizaSalario(salarioAtual: Double) = "%.2f".format(salarioAtual + (salarioAtual * 0.25))
