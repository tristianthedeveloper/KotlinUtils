package com.tristian.ktutils

import java.util.*


/**
 * @see Array.indexOf
 * Test [Array.indexOf] extension function
 */
fun testArrayIndexOf() {
    val arr = arrayOf("test", "string numero dos", "string number three", "str4", "strwhat")
    Assertions(arr.indexOf("test"), verbose = true) isEqualTo 0
}


/**
 * @see unpack
 * @see pack
 * Test Byte Utility functions.
 * More specifically: [unpack], [pack]
 */
fun testByteUtilities() {
    val string = "hello, world"
    val numArray = unpack(string)
    Assertions(pack(numArray), verbose = true) isEqualTo "hello, world"
}


/**
 * Main Method
 * Runs all tests
 */
fun main() {
    testByteUtilities()
    testArrayIndexOf()
    byteUtilitiesSample()
}