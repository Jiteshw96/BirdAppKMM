package org.example

import android.app.Application
import appModule
import di.getViewModelByPlatform
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BaseApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BaseApp)
            androidLogger()
            modules(appModule + getViewModelByPlatform())
        }
    }
}

