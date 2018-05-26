package com.osfunapps.dependencyfromappcomponent.dagger.network

import com.osapps.core.di.CoreComponent
import com.osfunapps.dependencyfromappcomponent.App
import com.osfunapps.dependencyfromappcomponent.dagger.network.instances.NetworkInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

// a dependent components. Holds barely anything
@NetworkScope
@Component(dependencies = [CoreComponent::class],
        modules = [AndroidSupportInjectionModule::class, NetworkModule::class] )


interface NetworkComponent : AndroidInjector<App> {

    //a generic builder

    fun networkInstance(): NetworkInstance

    @Component.Builder
    interface Builder{

        //components
        fun coreComponent(coreComponent: CoreComponent): Builder
        fun build(): NetworkComponent
    }
}