package com.example.kursacho

open class Event<out T> (val content: T){
    var hasBeenHandled = false
    fun getContentOrNull(): T?{
        return if(hasBeenHandled) null
        else {
            hasBeenHandled = true
            content
        }
    }
}