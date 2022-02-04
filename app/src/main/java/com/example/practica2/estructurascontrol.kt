package com.example.practica2

fun main() {
    var res1: String = obtenerDiaSemana(1)
    var res2: String = obtenerDiaSemana(2)
    var res3: String = obtenerDiaSemana(3)
    println("Test 1 dia=1 res=Lunes : test passed=${res1 == "Lunes"}")
    println("Test 2 dia=2 res=Martes : test passed=${res2 == "Martes"}")
    println("Test 3 dia=3 res=Cualquier dia menos Lunes y Martes : test passed=${res3 == "Cualquier dia menos Lunes y Martes"}")
    var number: Int = 4
    val answer = if (number == 1) {
        "lunes"
    } else if (number == 2) {
        "Martes"
    } else {
        "Cualquier dia menos Lunes y Martes"
    }
    println(answer)

    /*val x = -70
    if (x > 0) {
        "El número es mayor a 0"
    } else if (x == 0) {
        "El numero es igual a 0"
    } else {
        "El numero es diferente"
    }
    Toast.makeText(this, "$mensaje", Toast.LENGTH_LONG).show()
}*/
}

fun obtenerDiaSemana(dia:Int):String{
if(dia==1){
    return "Lunes"
    }else if(dia==2) {
    return "Martes"
}else {
    return "Cualquier dia menos lunes y martes"
}
}
