package com.lostoy.android.monitor

import android.util.Log

object Monitor {

    const val TAG = "Monitor"

    fun init(config: Config) {
        Log.d(TAG, "Monitor init")
    }

    fun monitor(event: String, params: Map<String, String>) {
        Log.d(
            TAG,
            "monitor event: $event params: ${
                params.entries.joinToString { it.key + ":" + it.value }
            }"
        )
    }

    fun addExtraParams(params: Map<String, String>) {
        Log.d(TAG, "addExtraParams ${params.entries.joinToString { it.key + it.value }}")
    }

    fun removeExtraParams(paramKeys: List<String>) {
        Log.d(TAG, "removeExtraParams ${paramKeys.joinToString()}")
    }
}
