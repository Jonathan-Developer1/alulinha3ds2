package com.example.functions

fun main() {
    val idadeFamilia = dadosPessoais(17, 47,50, 7)


}
fun dadosPessoais(idadeEU: Int, idade2: Int, idade3: Int, idade4: Int){
    val media = (idadeEU + idade2 + idade3 + idade4) / 4
    println("A média das idades é $media")
}
