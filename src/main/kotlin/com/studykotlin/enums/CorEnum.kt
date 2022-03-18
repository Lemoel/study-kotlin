package com.studykotlin.enums

enum class CorEnum(var vermelho: Int, var verde: Int, val azul: Int) {

    VERMELHO(255, 0, 0),
    LARANJA(255, 165, 0),
    AMARELO(255, 255, 0),
    VERDE(0, 255, 0),
    AZUL(0, 0, 255);

    fun rgb() = ((vermelho * 256 + verde) * 256 + azul)

}

fun main(){
    val rgb = CorEnum.VERMELHO.rgb()
    println(rgb);
}