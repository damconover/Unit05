import kotlin.math.sqrt

fun main() {
   
    fun isNumberDivisible(number: Int, divisor: Int): Boolean {
        return number % divisor == 0
    }

   
    fun isPrime(number: Int): Boolean {
        // Numbers less than 0 are not prime
        if (number < 0) {
            return false
        }

        
        for (i in 2..sqrt(number.toDouble()).toInt()) {
            if (isNumberDivisible(number, i)) {
                return false
            }
        }

        return true
    }
    // Test cases
    isPrime(6) // false
    isPrime(13) // true
    isPrime(8893) // true
