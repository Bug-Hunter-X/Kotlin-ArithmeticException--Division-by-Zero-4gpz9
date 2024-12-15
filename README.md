# Kotlin ArithmeticException: Division by Zero

This repository demonstrates a common error in Kotlin: the `ArithmeticException` that arises from division by zero.

The `bug.kt` file contains a function `calculate` that performs division without checking for a zero denominator. The `main` function calls `calculate` with a zero denominator, resulting in an `ArithmeticException`.

The `bugSolution.kt` file provides a corrected version of the `calculate` function, which includes a check for a zero denominator, preventing the exception.