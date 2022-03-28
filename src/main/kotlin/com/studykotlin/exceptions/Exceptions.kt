package com.studykotlin.exceptions

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {

    try {
        val porcentagem = percentage(110)
        println(porcentagem)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    println(lerIdade())
}

fun percentage(numero: Int): String {
    return if (numero in 1..100) {
        "$numero"
    } else {
        throw IllegalArgumentException("$numero deve estar entre 1 e 100")
    }
}

fun lerIdade(): Int? {

    val reader = FileReader(File("src/idade.txt"))
    val buffer = BufferedReader(reader);

    try {
        var numero = buffer.readLine();
        return Integer.parseInt(numero)
    } catch (e: java.lang.NumberFormatException) {
        return null;
    } finally {
        buffer.close();
    }
}