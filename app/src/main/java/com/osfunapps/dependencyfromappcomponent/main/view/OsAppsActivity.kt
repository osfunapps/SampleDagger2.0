package com.osfunapps.dependencyfromappcomponent.main.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.osapps.core.coreComponent
import com.osfunapps.dependencyfromappcomponent.appComponent
import com.osfunapps.dependencyfromappcomponent.dagger.network.DaggerNetworkComponent
import com.osfunapps.dependencyfromappcomponent.dagger.network.instances.NetworkInstance
import javax.inject.Inject


class OsAppsActivity : AppCompatActivity() {


    @Inject
    lateinit var networkInstance: NetworkInstance

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DI()
    }

    private fun DI() {

        val networkComponent = DaggerNetworkComponent.builder().coreComponent(coreComponent).build()

        appComponent.networkComponent(networkComponent)
        appComponent.inject(this)
    }

}
