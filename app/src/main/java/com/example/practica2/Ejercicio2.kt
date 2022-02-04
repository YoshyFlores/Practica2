package com.example.practica2
//Ejercicio 3

fun main()
{
    var caso1: Array<Int> = arrayOf(1,2,5,9)
    var caso2: Array<Int> = arrayOf(1,2,5,9)
    var caso3: Array<Int> = arrayOf(1,2,5,9,15,50,100,50)
    //searchData(caso1, 1) //0
    var res1= searchData(caso1, 1)
    var res2= searchData(caso2, 9)
    var res3= searchData(caso3, 100)

    println(res1)
    println("searchData(caso1, n=1) Test passed ${res1==0}")
    println("searchData(caso2, n=2) Test passed ${res2==3}")
    println("searchData(caso3, n=100) Test passed ${res3==6}")
}

fun searchData(collection:Array<Int>, number: Int): Int {
    //for (item in collection){
    // println(item)
    var pos = 0
   // collection.forEachIndexed({p,i-> if(i==number) return p})
    //foreachIndexed
    //(1,2,5,9)
    //p=0; i=1
    //p=1; i=2
    //p=2; i=5
    for (i in collection) {
        if (i == number) {

            return pos
        }
        pos += 1
    }
    return -1
}