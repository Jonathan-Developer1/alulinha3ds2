package com.example.lista1

fun main() {

    println("Digite o valor da base do triângulo")
    val base = readln().toFloat()
    println("Digite o valor da altura do triângulo")
    val altura = readln().toFloat()
    val area = base * altura / 2

    println("A área do triangulo é: " + area)

}
