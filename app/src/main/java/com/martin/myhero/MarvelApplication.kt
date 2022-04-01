package com.martin.myhero

import android.app.Application
import com.martin.myhero.di.businessModule
import com.martin.myhero.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MarvelApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MarvelApplication)
            modules(listOf(networkModule, businessModule))
        }
    }
}