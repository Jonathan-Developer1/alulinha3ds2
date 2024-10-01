package com.example.functions

fun main() {
    println("Seu novo salário é: " + aumento())
}


fun aumento():Double {
    val salario = 2000
    val novoSalario = salario + salario * 0.36
    return novoSalario
}