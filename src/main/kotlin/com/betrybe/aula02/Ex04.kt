package com.betrybe.aula02

fun main(){
    print("Digite a primeira nota: ")
    val nota1 = readln().replace(",", ".").toDouble()
    print("Digite a segunda nota: ")
    val nota2 = readln().replace(",", ".").toDouble()
    print("Digite a terceira nota: ")
    val nota3 = readln().replace(",", ".").toDouble()

    val notaMedia = calculaMediaNota(nota1, nota2, nota3)

    if (notaMedia == 0.0 || notaMedia <= 3.0 ) {
        println("Sua média é: $notaMedia")
        println("REPROVADO")
        return
    }
    if (notaMedia == 3.0 || notaMedia <= 7.0 ) {
        println("Sua média é: $notaMedia")
        println("EXAME")
        return
    }
    if (notaMedia == 7.0 || notaMedia <= 10.0 ) {
        println("Sua média é: $notaMedia")
        println("APROVADO")
        return
    }

}

fun calculaMediaNota( a: Double, b: Double, c: Double) : Double {
    val result = "%.2f".format(((a + b + c) / 3)).replace(",", ".").toDouble()

    return result
}

