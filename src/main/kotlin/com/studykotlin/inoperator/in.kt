package com.studykotlin.inoperator

fun main() {
    println(isLetter('9'))
    println(isNotDigit('7'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

