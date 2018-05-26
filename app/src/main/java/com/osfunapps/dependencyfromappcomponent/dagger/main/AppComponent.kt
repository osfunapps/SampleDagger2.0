package com.osfunapps.dependencyfromappcomponent.dagger.main

import android.net.Network
import android.support.v7.app.AppCompatActivity
import com.osapps.core.di.AppModule
import com.osapps.core.di.CoreComponent
import com.osapps.core.di.StorageModule
import com.osapps.core.infrastructure.localrepository.LocalRepository
import com.osfunapps.dependencyfromappcomponent.App
import com.osfunapps.dependencyfromappcomponent.dagger.main.scopes.AppScope
import com.osfunapps.dependencyfromappcomponent.dagger.network.NetworkComponent
import com.osfunapps.dependencyfromappcomponent.main.view.OsAppsActivity
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@AppScope
@Component(dependencies = [CoreComponent::class],
        modules = [AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<App> {


    fun inject(mainActivity: OsAppsActivity)
    override fun inject(app: App)

    //components
    fun networkComponent(networkComponent: NetworkComponent)


    @Component.Builder
    interface Builder{
        fun coreComponent(coreComponent: CoreComponent): Builder
        fun build(): AppComponent
    }
    //supplied components
    //fun networkComp(networkComponent: NetworkComponent)
}