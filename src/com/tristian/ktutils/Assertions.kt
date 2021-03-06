package com.tristian.ktutils

import java.lang.AssertionError

/**
 * Simple assertions class to test against values and targets.
 * @param T Type
 * @property target The target to assert towards.
 * @property verbose Whether or not to *println* the result of the tests.
 */
class Assertions<T>(private val target: T, val verbose: Boolean = false) {


    /**
     *
     * @param other value to test against
     * @see target
     * @see verbose
     * @see AssertionError
     * Checks the current target against the parameter given.
     * If the value inside the parameter is NOT equal to the target
     * given inside the constructor, throw AssertionError
     */
    infix fun isEqualTo(other: T) {
        if (other != target)
            throw AssertionError()
        if (verbose)
            println("TEST: $target isEqualTo $other PASSED")
    }

    /**
     *
     * @param other value to test against
     * @see target
     * @see verbose
     * @see AssertionError
     * Checks the current target against the parameter given.
     * If the value inside the parameter IS equal to the target
     * given inside the constructor, throw AssertionError
     */
    infix fun isDifferent(other: T) {
        if (other == target)
            throw AssertionError()
        if (verbose)
            println("TEST: $target isDifferent $other PASSED")
    }
}
