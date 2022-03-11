package com.studykotlin;

fun main() {
 println(max1(10, 18));
}

//Corpo de bloco
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//Corpo de expressão - com tipo de retorno boas práticas
fun max1(a: Int, b: Int): Int = if(a > b) a else b

//Corpo de expressão - sem tipo de retorno
fun max2(a: Int, b: Int) = if(a > b) a else b