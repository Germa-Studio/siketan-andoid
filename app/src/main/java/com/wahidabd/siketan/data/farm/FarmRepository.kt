package com.wahidabd.siketan.data.farm

import com.wahidabd.library.data.BaseRepository
import com.wahidabd.library.data.Resource
import com.wahidabd.siketan.data.farm.model.farm.request.ProductRequest
import com.wahidabd.siketan.data.farm.model.farm.response.EventTaniResponse
import com.wahidabd.siketan.data.farm.model.farm.response.InfoTaniDataResponse
import com.wahidabd.siketan.data.farm.model.farm.response.InfoTaniResponse
import com.wahidabd.siketan.data.farm.model.journal.JournalAddRequest
import com.wahidabd.siketan.data.farm.model.store.ProductDataResponse
import com.wahidabd.siketan.data.farm.model.store.response.ProductAddResponse
import kotlinx.coroutines.flow.Flow


/**
 * Created by Wahid on 6/15/2023.
 * Github github.com/wahidabd.
 */


interface FarmRepository : BaseRepository {

    suspend fun getInfoTani(): Flow<Resource<InfoTaniDataResponse<InfoTaniResponse>>>
    suspend fun getEvent(): Flow<Resource<InfoTaniDataResponse<EventTaniResponse>>>
    suspend fun getProduct(): Flow<Resource<ProductDataResponse>>
    suspend fun addProduct(data: ProductRequest): Flow<Resource<ProductAddResponse>>
    suspend fun addJournal(data: JournalAddRequest): Flow<Resource<ProductAddResponse>>
}