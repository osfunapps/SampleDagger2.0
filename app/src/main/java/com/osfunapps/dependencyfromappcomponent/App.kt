package com.osfunapps.dependencyfromappcomponent

import android.app.Application
import com.osapps.core.coreComponent
import com.osapps.core.initCoreDI
import com.osfunapps.dependencyfromappcomponent.dagger.AppComponent
import com.osfunapps.dependencyfromappcomponent.dagger.DaggerAppComponent


/**
 * Created by osapps on 26/05/2018.
 */

lateinit var appComponent: AppComponent

class App : Application() {


    override fun onCreate() {
        super.onCreate()
        initCoreDI(this)

        appComponent = DaggerAppComponent.builder().coreComponent(coreComponent).build()

        appComponent.inject(this)

    }



}

