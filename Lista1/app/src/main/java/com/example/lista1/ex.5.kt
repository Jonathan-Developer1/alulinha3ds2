package com.example.lista1

fun main() {

    println("Digite a altura da caixa d'água")
    val altura = readln().toFloat()
    println("Digite a largura da caixa d'água")
    val largura = readln().toFloat()
    println("Digite a profundidade da caixa d'água")
    val profundidade = readln().toFloat()
    val volume = altura * largura * profundidade
    println ("O volume da caixa d'água é: " + volume)
}
