package com.tristian.ktutils

import java.lang.AssertionError

class Assertions<T>(val target: T, val verbose : Boolean = false) {

    infix fun isEqualTo(other: T) {
        if (other != target)
            throw AssertionError()
        if (verbose)
            println("TEST: $target isEqualTo $other PASSED")
    }
    infix fun isDifferent(other: T) {
        if (other == target)
            throw AssertionError()
        if (verbose)
            println("TEST: $target isDifferent $other PASSED")
    }
}
