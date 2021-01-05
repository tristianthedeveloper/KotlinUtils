package com.tristian.ktutils

import java.util.*


class ByteUtilities {

    companion object {

        fun pack(bytes: Array<Int>): String {
            var chars: CharArray = charArrayOf()
            var i = 0
            while (i < bytes.size) chars = chars.plus((((bytes[i++] and 0xff) shl 8) or bytes[i++] and 0xff).toChar())
            return String(chars)
        }

        /**
         * Compress a string like "hello, world" into an integer array such as
         *  0, 104, 0, 101, 0, 108, 0, 108, 0, 111, 0, 44, 0, 32, 0, 119, 0, 111, 0, 114, 0, 108, 0, 100
         */
        fun unpack(values: String): Array<Int> {
            var bytes: Array<Int> = arrayOf()
            val len = values.length - 1
            println(len)
            for (i in 0..len) {
                val char = values[i]
                println(char)
                bytes = bytes.plus(char.toInt() ushr 8)
                bytes = bytes.plus(char.toInt() and 0xff)
            }
            return bytes
        }


    }

}
