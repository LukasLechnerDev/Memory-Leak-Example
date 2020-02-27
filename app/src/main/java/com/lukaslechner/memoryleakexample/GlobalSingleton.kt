package com.lukaslechner.memoryleakexample

object GlobalSingleton {
    val listeners = mutableListOf<GlobalSingletonListener>()
}

interface GlobalSingletonListener {
    fun onEvent()
}