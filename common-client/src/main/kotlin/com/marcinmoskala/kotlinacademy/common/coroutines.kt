package com.marcinmoskala.kotlinacademy.common

expect fun launchUI(block: suspend () -> Unit): Cancellable

expect suspend fun delay(time: Long)