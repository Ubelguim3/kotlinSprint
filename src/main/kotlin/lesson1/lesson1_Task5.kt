package org.example.lesson1

fun task5() {
    var seconds = 6480
    var minutes = seconds / 60
    seconds = seconds % 60
    val hours = minutes / 60
    minutes = minutes % 60
    println("$hours:$minutes:$seconds")
}