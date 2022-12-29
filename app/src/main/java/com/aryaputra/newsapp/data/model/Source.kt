package com.aryaputra.newsapp.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
//class data
@Parcelize
data class Source(
    val id: String,
    val name: String
):Parcelable