package com.lostoy.android.monitor

class Config(
    val switches: Switches? = null,
)

class Switches(
    val enable: Boolean = false,
    val http: HttpConfig? = null,
    val httpDiagnosis: HttpDiagnosis? = null
)

class HttpConfig(val enable: Boolean = false)

class HttpDiagnosis(val enable: Boolean = false)