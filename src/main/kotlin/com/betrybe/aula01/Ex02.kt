package com.betrybe.aula01

fun main(){
    print("Digite o seu nome: ")
    var nome = readln()
    print("Olá, ${nome}! Digite o seu salário: ")
    var salario = readln().toDouble()

    println("Obrigado, $nome, seu salário é: ${salario}!")
    println("Sua deduçao de imposto é: ${calculaDeducaoImposto(salario)}")
    println("Sua gratificacao é ${calculaGratificacao(salario)}")
    print("Seu salário a receber é ${calculaSalrioAreceber(salario)}")

}

//fun calcularSalarioAreceber(salario: Double): Double {
//    var deducaoDeImposto: Double = salario - (salario * 0.7)
//    println("Sua deduçao de imposto é: $deducaoDeImposto")
//    var gratificacao: Double =  salario * 0.5
//    println("Sua gratificacao é $gratificacao")
//    return deducaoDeImposto + gratificacao
//}

fun calculaGratificacao( salario: Double) =  salario * 0.5
fun calculaDeducaoImposto(salario: Double) = salario * 0.7
fun calculaSalrioAreceber(salario: Double) = salario - calculaDeducaoImposto(salario) + calculaGratificacao(salario)