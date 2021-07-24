package com.lostoy.android.monitor.data

data class HttpData(
    val url: String,
    val method: String,
    val duration: Long,
    val code: Int,
    val msg: String,
)
