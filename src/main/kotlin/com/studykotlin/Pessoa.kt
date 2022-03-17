package com.studykotlin

class Pessoa(
    val nome: String,
    val idade: Int
);

fun main() {
    val pessoa: Pessoa = Pessoa("Lemoel", 42);
    val pessoa2: Pessoa = Pessoa("Lemoel", 42);
}