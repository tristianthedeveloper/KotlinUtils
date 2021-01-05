package com.tristian.ktutils

import kotlin.math.pow
import kotlin.math.sqrt

class Vec3i(var x: Int, var y: Int, var z: Int) {

    var length: Double =
            sqrt((this.x.pow(2) + this.y.pow(2) + this.z.pow(2)).toDouble())


    /**
     * Takes all of this vectors components and divides them by the magnitude
     * @return The new vector
     */
    fun normalize() : Vec3i {
        this.x /= this.length.toInt()
        this.y /= this.length.toInt()
        this.z /= this.length.toInt()
        return this

    }

    operator fun minus(other: Vec3i) : Vec3i {

        return Vec3i(this.x - other.x, this.y - other.y, this.z - other.z)
    }

    operator fun plus(other: Vec3i) : Vec3i {
         return Vec3i(this.x + other.x, this.y + other.y, this.z + other.z)
    }

    operator fun times(amt: Int) : Vec3i {
        return Vec3i(this.x * amt, this.y * amt, this.z * amt)
    }

    operator fun timesAssign(amt: Int)  {
        this.x *= amt
        this.y *= amt
        this.z *= amt
    }

    operator fun plusAssign(other: Vec3i) {
        this.x += other.x
        this.y += other.y
        this.z += other.z
    }

    operator fun minusAssign(other: Vec3i) {
        this.x -= other.x
        this.y -= other.y
        this.z -= other.z
    }

    operator fun div(other: Vec3i) : Vec3i {
        return Vec3i(this.x / other.x, this.y / other.y, this.z / other.z)
    }

    operator fun divAssign(other: Vec3i) {
        this.x /= other.x
        this.y /= other.y
        this.z /= other.z
    }

    fun dot(other: Vec3i) : Int {

        return this.x * other.x + this.y * other.y + this.z * other.z
    }
}
class Vec3d(var x: Double, var y: Double, var z: Double) {


    var length: Double =
            sqrt(this.x.pow(2) + this.y.pow(2) + this.z.pow(2))


    /**
     * Takes all of this vectors components and divides them by the magnitude
     * @return The new vector
     */
    fun normalize() : Vec3d {
        this.x /= this.length.toInt()
        this.y /= this.length.toInt()
        this.z /= this.length.toInt()
        return this

    }

    operator fun minus(other: Vec3d) : Vec3d {

        return Vec3d(this.x - other.x, this.y - other.y, this.z - other.z)
    }

    operator fun plus(other: Vec3d) : Vec3d {
        return Vec3d(this.x + other.x, this.y + other.y, this.z + other.z)
    }

    operator fun times(amt: Double) : Vec3d {
        return Vec3d(this.x * amt, this.y * amt, this.z * amt)
    }

    operator fun timesAssign(amt: Double)  {
        this.x *= amt
        this.y *= amt
        this.z *= amt
    }

    operator fun plusAssign(other: Vec3d) {
        this.x += other.x
        this.y += other.y
        this.z += other.z
    }

    operator fun minusAssign(other: Vec3d) {
        this.x -= other.x
        this.y -= other.y
        this.z -= other.z
    }

    operator fun div(other: Vec3d) : Vec3d {
        return Vec3d(this.x / other.x, this.y / other.y, this.z / other.z)
    }

    operator fun divAssign(other: Vec3d) {
        this.x /= other.x
        this.y /= other.y
        this.z /= other.z
    }

    fun dot(other: Vec3d) : Double {

        return this.x * other.x + this.y * other.y + this.z * other.z
    }
}
class Vec3f(var x: Float, var y: Float, var z: Float) {


    var length: Float =
            sqrt(this.x.pow(2) + this.y.pow(2) + this.z.pow(2)).toFloat()


    /**
     * Takes all of this vectors components and divides them by the magnitude
     * @return The new vector
     */
    fun normalize() : Vec3f {
        this.x /= this.length.toInt()
        this.y /= this.length.toInt()
        this.z /= this.length.toInt()
        return this

    }

    operator fun minus(other: Vec3f) : Vec3f {

        return Vec3f(this.x - other.x, this.y - other.y, this.z - other.z)
    }

    operator fun plus(other: Vec3f) : Vec3f {
        return Vec3f(this.x + other.x, this.y + other.y, this.z + other.z)
    }

    operator fun times(amt: Float) : Vec3f {
        return Vec3f(this.x * amt, this.y * amt, this.z * amt)
    }

    operator fun timesAssign(amt: Float)  {
        this.x *= amt
        this.y *= amt
        this.z *= amt
    }

    operator fun plusAssign(other: Vec3f) {
        this.x += other.x
        this.y += other.y
        this.z += other.z
    }

    operator fun minusAssign(other: Vec3f) {
        this.x -= other.x
        this.y -= other.y
        this.z -= other.z
    }

    operator fun div(other: Vec3f) : Vec3f {
        return Vec3f(this.x / other.x, this.y / other.y, this.z / other.z)
    }

    operator fun divAssign(other: Vec3f) {
        this.x /= other.x
        this.y /= other.y
        this.z /= other.z
    }

    fun dot(other: Vec3f) : Float {

        return this.x * other.x + this.y * other.y + this.z * other.z
    }
}
