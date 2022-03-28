package com.studykotlin.collection

fun main() {

    var frutas1 = ArrayList<String>()
    frutas1.add("Maça")
    frutas1.add("Banana")
    frutas1.add("Morango")
    frutas1.add("Manga");
    println(frutas1)

    var frutas2 = arrayListOf("Maça, Banana, Morango, Manga")
    println(frutas2)

    println(HashSet::class.java)

    println(frutas2.last()) // deveria pegar o ultimo mas não acontece,

    val numeros = setOf(1, 14, 2)
    println(numeros);
    // println(numeros.max()); //deveria pegar o maio ?

}