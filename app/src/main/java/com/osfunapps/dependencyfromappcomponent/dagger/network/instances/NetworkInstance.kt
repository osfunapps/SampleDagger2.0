package com.osfunapps.dependencyfromappcomponent.dagger.network.instances

import com.osapps.core.infrastructure.localrepository.LocalRepository
import javax.inject.Inject

/**
 * Created by osapps on 26/05/2018.
 */
class  NetworkInstance @Inject constructor(private val localRepository: LocalRepository){

    fun shoot(){
        print(localRepository)
    }
}