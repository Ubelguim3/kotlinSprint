package org.example.lesson1
const val MINUTESINHOUR = 60
const val SECONDSINMINUTE = 60

fun task5() {
    var seconds = 6480
    var minutes = seconds / SECONDSINMINUTE
    seconds = seconds % SECONDSINMINUTE
    val formattedSeconds = String.format("%02d",seconds)
    val hours = minutes / MINUTESINHOUR
    minutes = minutes % MINUTESINHOUR
    println("$hours:$minutes:$formattedSeconds")
}

fun main() {
task5()
}