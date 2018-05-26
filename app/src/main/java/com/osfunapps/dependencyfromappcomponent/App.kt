package com.osfunapps.dependencyfromappcomponent

import android.app.Application
import com.osapps.core.coreComponent
import com.osapps.core.di.AppModule
import com.osapps.core.infrastructure.localrepository.LocalRepository
import com.osapps.core.initCoreDI
import com.osfunapps.dependencyfromappcomponent.dagger.main.AppComponent
import com.osfunapps.dependencyfromappcomponent.dagger.main.DaggerAppComponent
import com.osfunapps.dependencyfromappcomponent.dagger.network.DaggerNetworkComponent
import javax.inject.Inject


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

