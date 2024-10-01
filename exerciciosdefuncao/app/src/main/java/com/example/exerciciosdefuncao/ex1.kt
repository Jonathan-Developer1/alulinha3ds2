package com.example.exerciciosdefuncao

fun main() {
    println("Qual é o seu nome: ")
    println("Qual sua idade: ")
   informacoes(readln(), readln().toInt())
    //println(informacoes())
}

fun informacoes (nome: String, idade :Int):String{

    val nome1 = "Seu nome é: $nome"

    println(nome1)

    if (idade >= 18){
        println("Você é maior de idade")
    }else{
        println("Você é menor de idade")
    }
    return nome1
}