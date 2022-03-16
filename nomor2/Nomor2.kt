package nomor2

fun main(args: Array<String>)
{
    val pangkat= { x: Int, y: Int-> Math.pow(x.toDouble(), y.toDouble())}
    println(" 4 pangkat 3 ${pangkat(4, 3)}")
}