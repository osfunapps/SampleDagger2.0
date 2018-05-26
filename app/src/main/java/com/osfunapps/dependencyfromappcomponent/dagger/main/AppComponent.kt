package com.osfunapps.dependencyfromappcomponent.dagger.main

import android.net.Network
import android.support.v7.app.AppCompatActivity
import com.osapps.core.di.AppModule
import com.osapps.core.di.StorageModule
import com.osapps.core.infrastructure.localrepository.LocalRepository
import com.osfunapps.dependencyfromappcomponent.App
import com.osfunapps.dependencyfromappcomponent.dagger.network.NetworkComponent
import com.osfunapps.dependencyfromappcomponent.main.view.OsAppsActivity
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, StorageModule::class])
interface AppComponent : AndroidInjector<App> {


    fun inject(mainActivity: OsAppsActivity)
    override fun inject(app: App)
    /**
     * explicitly declare okHttp
     **/
    val userRepository: LocalRepository

    fun networkComponent(networkComponent: NetworkComponent)

    //supplied components
    //fun networkComp(networkComponent: NetworkComponent)
}