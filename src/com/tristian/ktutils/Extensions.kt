package com.tristian.ktutils

import kotlin.math.floor


// extension utilities


//# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # STRING EXTENSIONS # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #


/**
 *
 * @param times to repeat
 * @return A repeated string, consisting of the string this action was performed on,
 * but repeated [times] amount of times
 * EX: "*".times(8) -> ********
 */
fun String.times(times: Int): String {
    var newThis = this
    repeat(times) { newThis += this }
    return newThis
}


//# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # ARRAY EXTENSIONS # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #


/**
 * @return The index of the specified element if it exists inside the array, else returns -1
 */
infix fun <T> Array<T>.indexOf(needle: T): Int {
    for (i in 0..size) {
        if (this[i] == needle)
            return i
    }
    return -1;
}


/**
 * @see Math.random
 * Shuffle an array by swapping around random values at each index.
 *
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
 * @see Math.random
 * @see Array.size
 * @see floor
 * @return A random item from the array this function was called on.
 */
fun <T> Array<T>.choose(): T {
    return this[floor(Math.random() * size).toInt()]
}


//# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # NUMBER EXTENSIONS # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #
/**
 * @param amt
 * @return An integer raised to the *amt* power
 */
fun Int.pow(amt: Int): Int {
    var new: Int = this
    repeat(amt) { new *= this }
    return new
}

/**
 * @return A String with commas to look pretty
 *
 * EX: # 24354742 -> 24,354,742
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
