package com.androiddevs.mvvmnewsapp.helper

import java.text.SimpleDateFormat
import java.util.*

object Utils {
    fun fromDateFormat(dateString: String, fromFormat: String): Date {
        return SimpleDateFormat(fromFormat, Locale.ENGLISH).apply {
            timeZone = TimeZone.getTimeZone("GMT")
            isLenient = false
        }.parse(dateString)!!
    }
}

