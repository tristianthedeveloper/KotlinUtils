package com.tristian.ktutils

import kotlin.math.abs
import kotlin.math.floor

// extension utilities


//# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # STRING EXTENSIONS # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #


/**
 * Times
 *
 * @param times to repeat
 * @return A repeated string<br>
 *
 * EX: <code>"*".times(8) -> ********</code>
 */
fun String.times(times: Int): String {
    var newThis = this
    repeat(times) { newThis += this }
    return newThis
}


//# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # ARRAY EXTENSIONS # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #


/**
 * Questioned whether or not to make this an infix function.
 * @return The index of the specified element IF it exists inside the array,<br />or -1
 */
infix fun <T> Array<T>.indexOf(needle: T): Int {
    for (i in 0..size) {
        if (this[i] == needle)
            return i
    }
    return -1;
}


/**
 * Shuffle the array by swapping around random values
 */
fun <T> Array<T>.shuffle() {

    for (ctr in size..0) {
        val i: Int = ((Math.random() * ctr).toLong() or 0).toInt()
        val temp = this[ctr]
        this[ctr] = this[i]
        this[i] = temp
    }
}

/**
 * Choose
 *
 * @return A random item from the array.
 */
fun <T> Array<T>.choose(): T {
    return this[floor(Math.random() * size).toInt()]
}


//# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # NUMBER EXTENSIONS # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #
/**
 * Pow
 *
 * @param amt
 * @return An integer raised to the <b>amt</b> power
 */
fun Int.pow(amt: Int): Int {
    var new: Int = this
    repeat(amt) { new *= this }
    return new
}

/**
 * To pretty string
 *
 * @return A String with commas to look pretty
 * 24354742 -> 24,354,742
 */
fun Number.toPrettyString(): String {
    var str = this.toString()
    var str2 = ""
    for (i in 0..str.length) {
        if ((str.length - i) % 3 == 0) {
            str2 += ','
        }
        str2 += str[i]
    }
    return str2
}
