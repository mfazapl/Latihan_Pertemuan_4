package nomor1

import kotlin.math.sqrt

fun hitung(a: Int, b: Int, c: Int, d: Int): Double {
    return sqrt((a - b).toDouble() + (c - d).toDouble())
}

fun main (args: Array<String>)
{
  val obj = hitung (9,5,4,1)
    println(" Total $obj")

}