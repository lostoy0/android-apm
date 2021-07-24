package com.lostoy.android.monitor.realtime

interface RealtimeDataObserver<T> {

    fun onDataObserved(event: String, params: T)
}
