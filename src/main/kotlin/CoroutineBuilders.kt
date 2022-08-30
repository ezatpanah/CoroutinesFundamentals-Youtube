import kotlinx.coroutines.*
import org.testng.annotations.Test

/** runBlocking */
/*fun main() {
   runBlocking {
       delay(1000L)
       println("World!")
   }
   runBlocking {
       delay(1000L)
       println("World!")
   }
   runBlocking {
       delay(1000L)
       println("World!")
   }
   println("Hello,")
}*/

//TestCase
/*class MyTests {
    @Test
    fun `a test`() = runBlocking {
    }
}*/

/** launch */
/*
fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    Thread.sleep(2000L)
}
*/

/** async - async-await */
fun main() = runBlocking {
    val resultDeferred: Deferred<Int> = async {
        delay(1000L)
        86
    }
    // do Something...
    val result: Int = resultDeferred.await() // (1 sec)
    println(result)
    // or just
    println(resultDeferred.await())
}


