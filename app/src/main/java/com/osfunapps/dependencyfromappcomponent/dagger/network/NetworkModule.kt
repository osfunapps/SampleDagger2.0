package com.osfunapps.dependencyfromappcomponent.dagger.network

import com.osapps.core.infrastructure.localrepository.LocalRepository
import com.osfunapps.dependencyfromappcomponent.dagger.network.instances.NetworkInstance
import dagger.Module
import dagger.Provides

/**
 * Created by osapps on 26/05/2018.
 */


@Module
class NetworkModule {

    @Provides
    @NetworkScope
    fun provideNetworkInstance(localRepository: LocalRepository): NetworkInstance {
        return NetworkInstance(localRepository)
    }

}