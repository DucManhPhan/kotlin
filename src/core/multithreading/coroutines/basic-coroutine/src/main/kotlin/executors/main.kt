package executors

import java.util.concurrent.Executors

val executor = Executors.newSingleThreadExecutor()
val multiThreadExecutor = Executors.newFixedThreadPool(3)

fun main(args: Array<String>) {
    println(Thread.currentThread().name)
//    executors.CustomThread().start()
//    Thread(executors.CustomRunnable()).start()

//    executors.getExecutor.submit(executors.CustomRunnable())
    for (i in 0..10) {
        multiThreadExecutor.submit(CustomRunnable())
    }
}