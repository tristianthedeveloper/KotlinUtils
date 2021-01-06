package com.tristian.ktutils

import java.util.*


/**
########## TESTS ################
 */

/**
 * Test Array#indexOf extension function
 * @see Array.indexOf
 */
fun testArrayIndexOf() {
    var arr = arrayOf("test", "string numero dos", "string number three", "str4", "strwhat")
    Assertions(arr.indexOf("test"), verbose = true) isEqualTo 0
}


/**
 * Test byte utilities class
 * @see ByteUtilities
 * @see ByteUtilities.pack
 */
fun testByteUtilities() {
    val string = "hello, world"
    val numArray = ByteUtilities.unpack(string)
    Assertions(ByteUtilities.pack(numArray), verbose = true) isEqualTo "hello, world"
}


fun main() {
    testArrayIndexOf()
    testByteUtilities()
}