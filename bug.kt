```kotlin
fun calculate(a: Int, b: Int): Int {
    return a / b // Potential ArithmeticException
}

fun main() {
    val result = calculate(10, 0) 
    println(result) // This will throw an ArithmeticException
}
```