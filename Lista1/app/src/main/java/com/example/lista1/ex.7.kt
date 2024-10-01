package com.example.lista1

fun main() {

    print("Digite a velocidade do veículo: ")
    val velocidade = readln() .toFloat()
    print("Digite a distancia: ")
    val distancia = readln() .toFloat()
    val converter = velocidade / 3.6
    val tempo = distancia / velocidade
    println("A sua velocidade foi de: " + converter + " m/s ")
    println("O tempo demorado será: " + tempo + " Horas")



}
