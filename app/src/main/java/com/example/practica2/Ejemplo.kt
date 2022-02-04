package com.example.practica2
fun main() {
    val number = 1
    if (number == 7) {
        println("Domingo.")
    } else {
        println("Cualquier día menos domingo")
    }

    val numer = 2
    if (number == 1) {
        println("Lunes")
    } else if (number > 2) {
        println("Martes")
    } else {
        println("Cualquier día menos lunes y martes")
    }
}