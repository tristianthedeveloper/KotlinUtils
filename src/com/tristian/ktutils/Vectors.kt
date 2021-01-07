package com.tristian.ktutils

import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Vector Class
 *
 * @property x
 * @property y
 * @property z
 */
class Vec3i(var x: Int, var y: Int, var z: Int) {

    var length: Double =
            sqrt((this.x.pow(2) + this.y.pow(2) + this.z.pow(2)).toDouble())


     /**
     * Normalize the vector, dividing its values by its length.
     *
     * @return A normalized vector.
     */
    fun normalize(): Vec3i {
        this.x /= this.length.toInt()
        this.y /= this.length.toInt()
        this.z /= this.length.toInt()
        return this

    }

    /**
     * Minus
     *
     * @param other Vector to subtract with.
     * @return A new Vector, with values equal to this Vector's values - the given Vector's values.
     */
    operator fun minus(other: Vec3i): Vec3i {

        return Vec3i(this.x - other.x, this.y - other.y, this.z - other.z)
    }

   /**
     * Plus
     *
     * @param other
     * @return A new Vector, with values equal to this Vector's values + the given one's values.
     */
    operator fun plus(other: Vec3i): Vec3i {
        return Vec3i(this.x + other.x, this.y + other.y, this.z + other.z)
    }

    /**
     * Times
     *
     * @param amt Multiply Amount
     * @return A new vector, with each value multiplied by the given amount of times
     */
    operator fun times(amt: Int): Vec3i {
        return Vec3i(this.x * amt, this.y * amt, this.z * amt)
    }

    /**
     * Times assign
     *
     * @param amt Of times to multiply by.
     */
    operator fun timesAssign(amt: Int) {
        this.x *= amt
        this.y *= amt
        this.z *= amt
    }

    /**
     * Plus assign
     * Add the given Vector to this one, and assign this Vector that value.
     * @param other Vector to add to.
     */
    operator fun plusAssign(other: Vec3i) {
        this.x += other.x
        this.y += other.y
        this.z += other.z
    }

    /**
     * Minus assign
     * Subtracts the given vector from this vector.
     * @param other Vector to subtract from this one.
     */
    operator fun minusAssign(other: Vec3i) {
        this.x -= other.x
        this.y -= other.y
        this.z -= other.z
    }

    /**
     * Div
     *
     * @param other Vector to divide by.
     * @return This vector divided by the given other vector.
     */
    operator fun div(other: Vec3i): Vec3i {
        return Vec3i(this.x / other.x, this.y / other.y, this.z / other.z)
    }

    /**
     * Div assign
     * Divide the vector and assign a value to it.
     * @param other Vector to divide by.
     */
    operator fun divAssign(other: Vec3i) {
        this.x /= other.x
        this.y /= other.y
        this.z /= other.z
    }

    /**
     * Dot
     *
     * @param other
     * @return The dot product of the two vectors
     */
    fun dot(other: Vec3i): Int {

        return this.x * other.x + this.y * other.y + this.z * other.z
    }
}

/**
 * Vector Class.
 *
 * @property x
 * @property y
 * @property z
 */
class Vec3d(var x: Double, var y: Double, var z: Double) {


    var length: Double =
            sqrt(this.x.pow(2) + this.y.pow(2) + this.z.pow(2))


     /**
     * Normalize the vector, dividing its values by its length.
     *
     * @return A normalized vector.
     */
    fun normalize(): Vec3d {
        this.x /= this.length.toInt()
        this.y /= this.length.toInt()
        this.z /= this.length.toInt()
        return this

    }

    /**
     * Minus
     *
     * @param other Vector to subtract with.
     * @return A new Vector, with values equal to this Vector's values - the given Vector's values.
     */
    operator fun minus(other: Vec3d): Vec3d {

        return Vec3d(this.x - other.x, this.y - other.y, this.z - other.z)
    }

   /**
     * Plus
     *
     * @param other
     * @return A new Vector, with values equal to this Vector's values + the given one's values.
     */
    operator fun plus(other: Vec3d): Vec3d {
        return Vec3d(this.x + other.x, this.y + other.y, this.z + other.z)
    }

    /**
     * Times
     *
     * @param amt Multiply Amount
     * @return A new vector, with each value multiplied by the given amount of times
     */
    operator fun times(amt: Double): Vec3d {
        return Vec3d(this.x * amt, this.y * amt, this.z * amt)
    }

    /**
     * Times assign
     *
     * @param amt Of times to multiply by.
     */
    operator fun timesAssign(amt: Double) {
        this.x *= amt
        this.y *= amt
        this.z *= amt
    }

    /**
     * Plus assign
     * Add the given Vector to this one, and assign this Vector that value.
     * @param other Vector to add to.
     */
    operator fun plusAssign(other: Vec3d) {
        this.x += other.x
        this.y += other.y
        this.z += other.z
    }

    /**
     * Minus assign
     * Subtracts the given vector from this vector.
     * @param other Vector to subtract from this one.
     */
    operator fun minusAssign(other: Vec3d) {
        this.x -= other.x
        this.y -= other.y
        this.z -= other.z
    }

    /**
     * Div
     *
     * @param other Vector to divide by.
     * @return This vector divided by the given other vector.
     */
    operator fun div(other: Vec3d): Vec3d {
        return Vec3d(this.x / other.x, this.y / other.y, this.z / other.z)
    }

    /**
     * Div assign
     * Divide the vector and assign a value to it.
     * @param other Vector to divide by.
     */
    operator fun divAssign(other: Vec3d) {
        this.x /= other.x
        this.y /= other.y
        this.z /= other.z
    }

    /**
     * Dot
     *
     * @param other
     * @return The dot product of the two vectors
     */
    fun dot(other: Vec3d): Double {

        return this.x * other.x + this.y * other.y + this.z * other.z
    }
}

/**
 * Vector Class.
 *
 * @property x
 * @property y
 * @property z
 */
class Vec3f(var x: Float, var y: Float, var z: Float) {


    var length: Float =
            sqrt(this.x.pow(2) + this.y.pow(2) + this.z.pow(2)).toFloat()


    /**
     * Normalize the vector, dividing its values by its length.
     *
     * @return A normalized vector.
     */
    fun normalize(): Vec3f {
        this.x /= this.length.toInt()
        this.y /= this.length.toInt()
        this.z /= this.length.toInt()
        return this

    }

    /**
     * Minus
     *
     * @param other Vector to subtract with.
     * @return A new Vector, with values equal to this Vector's values - the given Vector's values.
     */
    operator fun minus(other: Vec3f): Vec3f {

        return Vec3f(this.x - other.x, this.y - other.y, this.z - other.z)
    }

    /**
     * Plus
     *
     * @param other Vector to add.
     * @return A new Vector, with values equal to this Vector's values + the given one's values.
     */
    operator fun plus(other: Vec3f): Vec3f {
        return Vec3f(this.x + other.x, this.y + other.y, this.z + other.z)
    }

    /**
     * Times
     *
     * @param amt Multiply Amount
     * @return A new vector, with each value multiplied by the given amount of times
     */
    operator fun times(amt: Float): Vec3f {
        return Vec3f(this.x * amt, this.y * amt, this.z * amt)
    }

    /**
     * Times assign
     *
     * @param amt Of times to multiply by.
     */
    operator fun timesAssign(amt: Float) {
        this.x *= amt
        this.y *= amt
        this.z *= amt
    }

    /**
     * Plus assign
     * Add the given Vector to this one, and assign this Vector that value.
     * @param other Vector to add to.
     */
    operator fun plusAssign(other: Vec3f) {
        this.x += other.x
        this.y += other.y
        this.z += other.z
    }

    /**
     * Minus assign
     * Subtracts the given vector from this vector.
     * @param other Vector to subtract from this one.
     */
    operator fun minusAssign(other: Vec3f) {
        this.x -= other.x
        this.y -= other.y
        this.z -= other.z
    }

    /**
     * Div
     *
     * @param other Vector to divide by.
     * @return This vector divided by the given other vector.
     */
    operator fun div(other: Vec3f): Vec3f {
        return Vec3f(this.x / other.x, this.y / other.y, this.z / other.z)
    }

    /**
     * Div assign
     * Divide the vector and assign a value to it.
     * @param other Vector to divide by.
     */
    operator fun divAssign(other: Vec3f) {
        this.x /= other.x
        this.y /= other.y
        this.z /= other.z
    }

    /**
     * Dot
     *
     * @param other
     * @return The dot product of the two vectors
     */
    fun dot(other: Vec3f): Float {

        return this.x * other.x + this.y * other.y + this.z * other.z
    }
}
