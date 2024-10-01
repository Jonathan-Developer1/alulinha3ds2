package com.example.condicionais

fun main() {
    println("Digite um número")
    val numero = readln().toInt()
    if (numero % 2 == 0 ){
        println("Seu numero é par")
    } else{
        println("Seu numero é impar")
    }
}

