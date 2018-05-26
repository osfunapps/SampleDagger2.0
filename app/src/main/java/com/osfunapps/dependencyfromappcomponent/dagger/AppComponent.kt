package com.osfunapps.dependencyfromappcomponent.dagger

import com.osapps.core.di.CoreComponent
import com.osfunapps.dependencyfromappcomponent.App
import com.osfunapps.dependencyfromappcomponent.dagger.builder.ActivityBuilder
import com.osfunapps.dependencyfromappcomponent.dagger.main.scopes.AppScope
import com.osfunapps.dependencyfromappcomponent.dagger.network.NetworkComponent
import com.osfunapps.dependencyfromappcomponent.osappsactivity.view.OsAppsActivity
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@AppScope
@Component(dependencies = [CoreComponent::class],
        modules = [AndroidSupportInjectionModule::class, ActivityBuilder::class])
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