package com.tristian.ktutils
// extension utilities


fun String.times(times: Int): String {
    var newThis = this
    repeat(times) { newThis += this }
    return newThis
}

infix fun String.substringMatches (r: Regex) : List<String> {
    return r.findAll(this)
            .map { it.value }
            .toList()
}

fun Int.pow(amt: Int): Int {
    var new: Int = this
    repeat(amt) { new *= this }
    return new
}
