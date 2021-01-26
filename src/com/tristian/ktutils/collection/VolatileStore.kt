package com.tristian.ktutils.collection

import java.lang.IllegalStateException


/**
 *
 * A volatile storage class, used to hold a volatile value with
 * an optional aggressive thread-locking state.
 *
 * This class is <em>not</em> Synchronized.
 * @see Volatile
 * @see Thread
 * @see Thread.currentThread
 * @author Internet Paul aka Tristian
 * @constructor Create a new VolatileStore object with a value and an optional aggression status.
 */
class VolatileStore<T>(
        @Volatile
        private var value: T,
        private val aggressive: Boolean = false,
) {

    private var lockingThread: Thread? = null // stop bullying me kotlin

    /**
     * @see Thread
     * @see Thread.currentThread
     * Lock this object, only allowing the [value] of this object to be changed by the current
     * [Thread] that this method was called on.
     */
    fun lock() {
        if (lockingThread == null && aggressive) {
            this.lockingThread = Thread.currentThread()
        }
    }

    /**
     *
     * @see Thread
     * @see Thread.currentThread
     * @throws IllegalStateException
     * Unlock this object, allowing the [value] of the object to be changed by any [Thread]
     */
    fun unlock() {
        if (lockingThread != null && lockingThread != Thread.currentThread()
                && aggressive) {
            throw IllegalStateException("Attempting to unlock from different thread.")
        } else {
            lockingThread = null
        }
    }


    /**
     * Get value of this object
     * @throws IllegalStateException if [aggressive] == true and [lockingThread] != null and method is
     * called from a seperate [Thread] than that of the one that locked it.
     * @return This object's value.
     */
    fun getValue(): T {
        threadLockAggressionCheck("Attempting to get value from seperate Thread.")
        return value
    }

    /**
     * Set value of this object.
     * @throws IllegalStateException if [aggressive] == true and [lockingThread] != null and method is
     * called from a seperate [Thread] than that of the one that locked it.
     * @param value The value to set this object's value to.
     */
    fun setValue(value: T) {
        threadLockAggressionCheck("Attempting to set value from seperate Thread.")
        this.value = value
    }

    private fun threadLockAggressionCheck(message: String) {
        if (aggressive) {
            if (lockingThread != null && lockingThread != Thread.currentThread()) {
                throw IllegalStateException(message)
            }
        }
    }
}
