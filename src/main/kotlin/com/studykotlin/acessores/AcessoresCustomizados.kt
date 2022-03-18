package com.studykotlin.acessores

class AcessoresCustomizados(val altura: Int, val largura: Int) {

    val isQuadrado: Boolean
        /*get() {
            return altura == largura
        }*/
        get() = altura == largura;
}

fun main() {
    val acessores: AcessoresCustomizados = AcessoresCustomizados(20, 20)
    println(acessores.isQuadrado);
}