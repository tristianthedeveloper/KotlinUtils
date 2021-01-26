package com.tristian.ktutils

import java.util.*
import java.util.function.IntFunction
import java.util.function.ToIntFunction
import java.util.stream.StreamSupport.stream


/**
 * Pack an array of integers into a readable string.
 *
 * @see Int.and
 * @see Int.shl
 * @param bytes
 * @return the uncompressed string.
 */
fun pack(bytes: Array<Int>): String {
    var chars: CharArray = charArrayOf()
    var i = 0
    while (i < bytes.size) chars = chars.plus((((bytes[i++] and 0xff) shl 8) or bytes[i++] and 0xff).toChar())
    return String(chars)
}

/**
 *
 *  @see Int.ushr
 *  @see Int.and
 * Compress a string like "hello, world" into an integer array such as
 *  0, 104, 0, 101, 0, 108, 0, 108, 0, 111, 0, 44, 0, 32, 0, 119, 0, 111, 0, 114, 0, 108, 0, 100
 *  @return The compressed String, in Array form.
 */
fun unpack(values: String): Array<Int> {
    var bytes: Array<Int> = arrayOf()
    val len = values.length - 1
    for (i in 0..len) {
        val char = values[i]
        bytes = bytes.plus(char.toInt() ushr 8)
        bytes = bytes.plus(char.toInt() and 0xff)
    }
    return bytes
}

/**
 * Compress a series of boolean values into a String like '10110010'
 * @sample byteUtilitiesSample
 * @param values The values to pack.
 * @return A packed string.
 */
fun compressBools(values: List<Boolean>): String = StringBuilder().apply {
    values.stream().mapToInt {
        when (it) {
            true -> 1
            else -> 0
        }
    }.boxed().forEach { append(it) }
}.toString()


/**
 * Uncompress a series of 1s and 0s inside of a string into an array of booleans
 * @sample byteUtilitiesSample
 * @return The uncompressed booleans.
 */
fun uncompressString(values: String): List<Boolean> = arrayListOf<Boolean>().apply {
    values.forEach {
        add(when (it) {
            '1' -> true
            else -> false
        })
    }
}
