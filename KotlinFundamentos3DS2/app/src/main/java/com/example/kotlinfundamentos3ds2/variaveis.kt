package com.example.kotlinfundamentos3ds2

fun main(){

    print("Digite um numero inteiro: ")
    val numeroInteiro = readln().toInt()

    print("Digite um numero Real: ")
    val numeroReal1 = readln().toFloat()

    print("Digite um numero Real : ")
    val numeroReal2 = readln()

    print("Digite uma Palavra: ")
    val palavra = readln()

    print("Digite uma letra: ")
    val letra = readln()

    print("Digite um valor boleano: ")
    val booleano = readln().toBoolean()


    println("você digitou: $numeroInteiro")
    println("Você digitou $numeroReal1")
    println("Você digitou $numeroReal2")
    println("Você digitou $palavra")
    println("Você digitou $letra")
    println("Você digitou $booleano")
}