package com.lostoy.android.monitor.sample

import android.os.Bundle
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import com.lostoy.android.monitor.Config
import com.lostoy.android.monitor.Monitor
import com.lostoy.android.monitor.Switches

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Monitor.init(Config(switches = Switches(true)))
        Monitor.monitor(
            "onCreate", mapOf(
                "pageName" to MainActivity::javaClass.name,
                "timestamp" to SystemClock.elapsedRealtime().toString()
            )
        )
        Monitor.addExtraParams(
            mapOf(
                "timestamp" to SystemClock.elapsedRealtime().toString(),
                "userId" to "88888888"
            )
        )
    }
}
