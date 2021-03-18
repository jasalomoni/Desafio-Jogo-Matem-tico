package com.one.digitalinnovation.jogomatematico

fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    val minusculas = "a b c d e f g h i j k l m n o p q r s t u v x y w z"

    for (i in 1..N) {
        //escreva sua solução aqui
        val codigo = readLine()!!.toString()
        var num1 = codigo.substring(0,1)
        var letra = codigo.substring(1,2)
        var num2 = codigo.substring(2,3)

        if (num1 == num2) {
            println(num1.toInt() * num2.toInt())
        } else {
            if(minusculas.contains(letra)) {
                println(num1.toInt() + num2.toInt())
            } else {
                println(num2.toInt() - num1.toInt())
            }
        }
    }
}