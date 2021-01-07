package com.tristian.ktutils

import java.lang.Double.doubleToLongBits
import java.lang.Double.longBitsToDouble
import java.lang.Long.max
import java.math.BigInteger
import kotlin.math.pow


/**
 * A bit hack that computes a rough estimation of a square root for the given number.
 * Don't use this in places that need accuracy-- You'll regret it!
 * @param d the input for the fastSqrt algorithm
 * @return a **rough** approximation of square root
 */
fun fastSqrt(d: Double): Double {
    return longBitsToDouble((doubleToLongBits(d) - (1L shl 52) shr 1) + (1L shl 61))
}

/**
 * A fast implementation of Math.abs() that avoids branching.
 * @param n The number to get the absolute value of.
 * @return The absolute value of the given number.
 */
fun fastAbs(n: Int): Int {
    val mask = n shr (8 * 8 - 1)
    return ((n + mask) xor mask)
}

/**
 * A fast implementation of Math.abs() that avoids branching.
 * @param n The number to get the absolute value of.
 * @return The absolute value of the given number.
 */
fun fastAbs(n: Long): Long {
    val mask = n shr (8 * 8 - 1)
    return ((n + mask) xor mask)
}

/**
 * Karatsuba Multiplication Algorithm.
 * @param n First Number
 * @param other Second Number
 * @return The product of the two numbers.
 *
 * Algorithm Steps:
 * 1. Compute starting set  (a*c)
 * 2. Compute set after starting set may it be ending set (b*d)
 * 3. Compute starting set with ending sets
 * 4. Subtract values of step 3 from step2 from step1
 * 5. Pad up (Add) 4 zeros to the number obtained from Step1, step2 value unchanged, and pad up two zeros to vale obtained from step4.
 */
fun karatsubaMultiply(n: Long, other: Long): Long {


    fun numLength(num: Long): Long {
        var temp = num // cant reassign parameters because kotlin hates orphans
        var no: Long = 0
        while (0 < temp) {
            no++
            temp /= 10
        }
        return no
    }

    val numLengthN = numLength(n)
    val numLengthOther = numLength(other)
    val max = max(numLengthN, numLengthOther)

    val small = 1 shl 4
    if (max < small)
        return n * other

    val maxTen = 10.pow(max.toInt()).toLong()

    val b = n / maxTen
    val a = n - (b * maxTen)
    val d = other / maxTen
    val c = other - (d * maxTen)

    val z0 = karatsubaMultiply(a, c)
    val z1 = karatsubaMultiply(a + b, c + d)
    val z2 = karatsubaMultiply(b, d)
    return z0 + ((z1 - z0 - z2) * maxTen) + z2 * 10.pow(2 * max.toInt())
}
