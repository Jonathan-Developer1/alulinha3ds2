package com.example.lista1

fun main() {

    println("Digite a nota da primeira prova")
    val prova1 = readln().toInt()
    println("Digite a nota da segunda prova")
    val prova2 = readln().toInt()
    println("Digite a nota da terceira prova")
    val prova3 =  readln().toInt()

    val peso1 = prova1 * 2
    val peso2 = prova2 * 3
    val peso3 = prova3 * 5

    val media = (peso1 + peso2 + peso3) / 3
    println("Sua media é: " + media)

}
