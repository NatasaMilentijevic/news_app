package com.androiddevs.mvvmnewsapp.helper

import java.text.SimpleDateFormat
import java.util.*

val Date.MMDDYYYY: String
    get() = SimpleDateFormat("dd.MM.yyyy.", Locale.ENGLISH)
        .format(this).toString()


val Date.Month: String
    get() = SimpleDateFormat("MMM", Locale.ENGLISH)
        .format(this).toString()