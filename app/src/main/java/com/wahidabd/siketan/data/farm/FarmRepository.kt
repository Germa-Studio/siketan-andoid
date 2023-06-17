package com.wahidabd.siketan.data.farm

import com.wahidabd.library.data.BaseRepository
import com.wahidabd.library.data.Resource
import com.wahidabd.siketan.data.farm.model.farm.InfoTaniDataResponse
import com.wahidabd.siketan.data.farm.model.store.ProductDataResponse
import kotlinx.coroutines.flow.Flow


/**
 * Created by Wahid on 6/15/2023.
 * Github github.com/wahidabd.
 */


interface FarmRepository : BaseRepository {

    suspend fun getInfoTani(): Flow<Resource<InfoTaniDataResponse>>
    suspend fun getProduct(): Flow<Resource<ProductDataResponse>>

}