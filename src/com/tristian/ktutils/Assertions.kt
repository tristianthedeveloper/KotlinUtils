package com.tristian.ktutils

import java.lang.AssertionError

class Assertions<T>(val target: T) {

    infix fun isEqualTo(other: T) {
        if (other != target)
            throw AssertionError()
    }
    infix fun isDifferent(other: T) {
        if (other == target)
            throw AssertionError()
    }
}