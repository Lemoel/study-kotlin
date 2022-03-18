package com.studykotlin

import com.studykotlin.enums.CorEnum

fun obterMnemonica(corEnum: CorEnum) =

    when (corEnum) {
        CorEnum.VERMELHO -> "Ver"
        CorEnum.AMARELO -> "Alguém"
        CorEnum.VERDE -> "Viver"
        CorEnum.AZUL -> "Além é"
        CorEnum.LARANJA -> "Legal"
    }

fun obterTemperatura(corEnum: CorEnum): String {
    return when(corEnum) {
        CorEnum.VERMELHO, CorEnum.LARANJA, CorEnum.AMARELO -> "Quente"
        CorEnum.AZUL -> "Neutro"
        CorEnum.VERDE -> "Freio"
    }
}

fun main() {
    val mnemonica = obterMnemonica(CorEnum.LARANJA)
    println(mnemonica);

    var temperatura = obterTemperatura(CorEnum.VERDE)
    println(temperatura);
}