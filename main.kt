import kotlin.math.sqrt

fun main() {
    val figure = readLine()!!.toString()
    when (figure) {
        "triangle" -> {val a = readLine()!!.toDouble()
                      val b = readLine()!!.toDouble()
                      val c = readLine()!!.toDouble()
                      val s: Double =  (a + b + c)/2
                      println(sqrt(s * (s - a) * (s - b) * (s - c)).toDouble()) }
        "rectangle" -> {val a = readLine()!!.toDouble()
                       val b = readLine()!!.toDouble()
                       println(a * b) }
        "circle" -> {val r = readLine()!!.toDouble()
                    println(3.14 * r * r) }
    }
}

