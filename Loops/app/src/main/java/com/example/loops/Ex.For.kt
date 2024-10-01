package com.example.loops

fun main() {
    print("Digite o número da tabuada: ")
    val numero = readln().toInt()

    for (i in 1..10){
        println("$numero x $i = " + numero * i)
    }
    println("Fim do Programa")
}