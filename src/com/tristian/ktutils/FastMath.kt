package com.tristian.ktutils

import java.lang.Double.doubleToLongBits
import java.lang.Double.longBitsToDouble

/**
 * Fast Math Utilities Class
 *
 */
class FastMath {


    /**
     * A bit hack that computes a rough estimation of a square root for the given number
     * Don't use this in places that need accuracy-- You'll regret it!
     *
     * @param d the input for the fastSqrt algorithm
     * @return a **rough** approximation of square root
     */
    fun fastSqrt(d: Double): Double {
        return longBitsToDouble((doubleToLongBits(d) - (1L shl 52) shr 1) + (1L shl 61))
    }

    /**
     * A fast implementation of Math.abs() that avoids branching
     * @param n the number to get the absolute value of
     * @return the absolute value
     */
    fun fastAbs(n: Int): Int {
        val mask = n shr (8 * 8 - 1)
        return ((n + mask) xor mask)
    }

    /**
     * A fast implementation of Math.abs() that avoids branching
     * @param n the number to get the absolute value of
     * @return the absolute value
     */
    fun fastAbs(n: Long): Long {
        val mask = n shr (8 * 8 - 1)
        return ((n + mask) xor mask)
    }

}
