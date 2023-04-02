fun main() {
    fun celsius(fTemp: Float): Float {
        return 5/9f * (fTemp - 32)
    }


    for (fTemp in 0..20) {
        val cTemp = celsius(fTemp.toFloat())
        println("Fahrenheit: $fTemp | Celsius: $cTemp")
    }
}
