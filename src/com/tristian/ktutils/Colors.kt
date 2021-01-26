package com.tristian.ktutils

fun rgbToHex(red: Int = 0, green: Int = 0, blue: Int = 0): String {

    return "#${(red.shl(16) or green shl 8 or blue).toString(16)}"

}

fun hexToRgb(hex: String): Array<Int> {
    val nHex = hex.replace(Regex("^$#?([0-9a-f]{6})$"), "$1").toInt(16)
    return arrayOf(
            nHex shr 16 and 0xff,
            nHex shr 8 and 0xff,
            nHex and 0xff
    )
}