package com.betrybe.aula03

fun main () {

    val a1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val a2 = arrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)

    println(alternateArrays(a1, a2))
}

fun alternateArrays( array1: Array<Int>, array2: Array<Int>) : MutableList<Int> {

    val result = mutableListOf<Int>()

    for (index1 in array1.indices) {
        result.add(array1[index1])
        for (index2 in array2.indices) {
        if (index1 == index2) {
            result.add(array2[index2])
        }
    }}
    return result
}