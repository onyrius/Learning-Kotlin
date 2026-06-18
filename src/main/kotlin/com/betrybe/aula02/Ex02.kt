package com.betrybe.aula02

fun main(){
    println("Qual a altura de cada degrau? Informe, por favor: ")
    var degrau = readLine()!!.replace(",", ".").toDouble()
    println("Qual a altura que você gostaria de alcançar? Informe, por favor: ")
    var altura = readLine()!!.replace(",", ".").toDouble()
    print("O número de degraus a subir é ${calculaDegraus(degrau, altura)}")

}

fun calculaDegraus(alturaDegrau: Double, alturaAlcancar: Double): Int {
    var numeroDegrau = (alturaAlcancar/alturaDegrau)
    return numeroDegrau.toInt()
}
