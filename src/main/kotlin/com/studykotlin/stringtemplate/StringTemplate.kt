package com.studykotlin

fun main() {
    val nome = "Lemoel"

    //String template com string
    println("Hello: $nome");
    println("Hello: \$nome");

    //String template com expressao
    println("A soma é ${soma(1, 2)}")

}

fun soma(a: Int, b: Int): Int {
    return a + b
}