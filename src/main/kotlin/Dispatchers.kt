import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/** Don’t specify the dispatcher */
/*fun main() = runBlocking<Unit> {
    launch {
        println("Current thread is: ${Thread.currentThread().name}")
    }
}*/

/** Default dispatcher */
/*fun main() = runBlocking<Unit> {
    launch(Dispatchers.Default) {
        println("Current thread is: ${Thread.currentThread().name}")
    }
}*/


/** IO dispatcher */
/*fun main() = runBlocking<Unit> {
    launch(Dispatchers.IO) {
        println("Current thread is: ${Thread.currentThread().name}")
    }
}*/

/** Unconfined dispatcher */
fun main() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("Current thread is: ${Thread.currentThread().name}")
    }
}