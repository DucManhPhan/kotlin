
fun main(args: Array<String>) {
    val maxInt: Int = max(42, 99)
    val maxLong: Long = max(123456789L, 999999999L)
    val maxByte: Byte = max((-128).toByte(), (127).toByte())
    val maxString: String = max("Beta", "Alpha")

    println("The max Int = $maxInt")
    println("The max Long = $maxLong")
    println("The max Byte = $maxByte")
    println("The max String = $maxString")
}

fun <T: Comparable<T>> max(param1: T, param2: T) : T {
    val results = param1.compareTo(param2)
    return if (results > 0) param1 else param2
}