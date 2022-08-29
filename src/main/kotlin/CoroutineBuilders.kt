import kotlinx.coroutines.*
import org.testng.annotations.Test

/** runBlocking */
/*fun main() = runBlocking {

}

class MyTests {
    @Test
    fun `a test`() = runBlocking {
    }
}*/

/** launch */
/*
fun main() = runBlocking {
    println("Main starts: ${Thread.currentThread().name}")

    launch {
        println("doSomethings starts: ${Thread.currentThread().name}")
        delay(1000)
        println("doSomethings finished: ${Thread.currentThread().name}")
    }

    println("Main ends: ${Thread.currentThread().name}")
}
*/

/** async */
/*fun main() {
    GlobalScope.async {
        doSomething()
    }
}

fun doSomething() {

}*/

/** async-await */
val a = 10
val b = 20
fun main() {
    println("Gone to calculate the sum of a and b")

    GlobalScope.launch {
        val result = async {
            calculateSum()
        }
        println("Sum of a & b is: ${result.await()}")
    }
    println("Carry on with some other task while the coroutine is waiting for a result...")
    runBlocking {
        delay(3000L) // keeping jvm alive till calculateSum is finished
    }
}
suspend fun calculateSum(): Int {
    delay(2000L) // simulate long running task
    return a + b
}

