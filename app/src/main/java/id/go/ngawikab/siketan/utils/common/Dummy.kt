package id.go.ngawikab.siketan.utils.common

import id.go.ngawikab.siketan.data.farm.model.farm.response.ChartDataResponse
import id.go.ngawikab.siketan.data.farm.model.farm.response.ChartResponse
import id.go.ngawikab.siketan.domain.farm.model.response.ChartDataModel
import id.go.ngawikab.siketan.domain.farm.model.response.ChartModel
import id.go.ngawikab.siketan.utils.ChartKomuditasQuery
import id.go.ngawikab.siketan.utils.ChartTypeQuery


/**
 * Created by Wahid on 10/9/2023.
 * Github github.com/wahidabd.
 */


object Dummy {
    fun generateChartDummy(): ChartResponse {
        val list = ArrayList<ChartDataResponse>()
        list.add(
            ChartDataResponse(
                komoditas = "Mangga",
                count = 20,
                kategori = "Musiman",
                jenis = "Buah",
                periodeMusimTanam = "Tanaman Musiman"
            )
        )

        list.add(
            ChartDataResponse(
                komoditas = "Mangga",
                count = 20,
                kategori = "Musiman",
                jenis = "Buah",
                periodeMusimTanam = "Tanaman Musiman"
            )
        )

        list.add(
            ChartDataResponse(
                komoditas = "Mangga",
                count = 20,
                kategori = "Musiman",
                jenis = "Buah",
                periodeMusimTanam = "Tanaman Musiman"
            )
        )

        list.add(
            ChartDataResponse(
                komoditas = "Wortel",
                count = 20,
                kategori = "Musiman",
                jenis = "Buah",
                periodeMusimTanam = "Tanaman Musiman"
            )
        )

        list.add(
            ChartDataResponse(
                komoditas = "Mangga",
                count = 20,
                kategori = "Musiman",
                jenis = "Buah",
                periodeMusimTanam = "Tanaman Musiman"
            )
        )
        return ChartResponse(list)
    }
}