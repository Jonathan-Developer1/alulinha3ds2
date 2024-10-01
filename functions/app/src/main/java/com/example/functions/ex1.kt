package com.example.functions

fun main() {
 println("A média dos três números é: " + media())
}

fun media ():Float {
    val num1 = 10.0f
    val num2 = 10.0f
    val num3 = 10.0f
    val media = (num1 + num2 + num3) / 3

    return media
}
