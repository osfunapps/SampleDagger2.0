package com.osfunapps.dependencyfromappcomponent.dagger.network

import android.support.v7.app.AppCompatActivity
import com.osapps.core.coreComponent
import com.osapps.core.di.CoreComponent
import com.osfunapps.dependencyfromappcomponent.App
import com.osfunapps.dependencyfromappcomponent.dagger.main.AppComponent
import com.osfunapps.dependencyfromappcomponent.dagger.network.instances.NetworkInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication

// a dependent components. Holds barely anything
@NetworkScope
@Component(dependencies = [CoreComponent::class],
        modules = [AndroidSupportInjectionModule::class, NetworkModule::class] )


interface NetworkComponent : AndroidInjector<DaggerApplication> {

    //a generic builder
    override fun inject(instance: DaggerApplication)

    fun networkInstance(): NetworkInstance

    @Component.Builder
    interface Builder{

        //components
        fun coreComponent(coreComponent: CoreComponent): Builder
        fun build(): NetworkComponent
    }
}