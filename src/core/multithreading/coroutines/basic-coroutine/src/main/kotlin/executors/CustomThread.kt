package executors
class CustomThread : Thread("executors.CustomThread") {
    override fun run() {
        super.run()

        println(Thread.currentThread().name)
        println("executors.CustomThread.run()")
    }
}