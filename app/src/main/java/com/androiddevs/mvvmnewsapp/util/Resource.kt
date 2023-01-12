package com.androiddevs.mvvmnewsapp.util

sealed class Resource<T>(  //as a wrapper class for generic type T which is network response (in our case NewsResponse)
    val data: T? = null,
    val message: String? = null
){
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T> : Resource<T>()
}
