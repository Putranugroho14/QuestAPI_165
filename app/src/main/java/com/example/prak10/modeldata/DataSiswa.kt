package com.example.prak10.modeldata

import com.example.prak10.modeldata.DetailSiswa
import kotlinx.serialization.Serializable
import kotlin.Int

@Serializable
data class DataSiswa (
    val id : Int,
    val nama: String,
    val alamat: String,
    val telpon: String
)

data class UIStateSiswa(
    val detailSiswa: DetailSiswa = DetailSiswa(),
    val isEntryValid: Boolean = false
)

data class DetailSiswa (
    val id : Int = 0,

)




