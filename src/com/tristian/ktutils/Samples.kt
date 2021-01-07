package com.tristian.ktutils

import java.util.LinkedHashMap


/**
 *  @see pack
 *  @see unpack
 *
 *  Simple userdata example using the [pack] and [unpack] methods
 *
 */
fun byteUtilitiesSample() {


    var userData = linkedMapOf(
            "banned" to false,
            "isRunning" to true,
            "isDead" to false,
            "isAdmin" to true
    )

    fun saveData(): String {
        return compressBools(userData.values.toList())
    }
    println("user compressed data : ${saveData()}")

    fun loadData(): LinkedHashMap<String, Any> {
        val saveSetKeys = arrayOf("banned", "isRunning", "isDead", "isAdmin")
        val uncompressedSave = linkedMapOf<String, Any>()
        val compressedSave = saveData()
        for ((i, value) in uncompressString(compressedSave).withIndex()) {
            uncompressedSave[saveSetKeys[i]] = value
        }
        return uncompressedSave
    }
    println("Uncompressed Data : ${loadData()}")
}