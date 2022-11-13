package com.example.myrecyclerview2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class tour(
    val name: String,
    val description: String,
    val photo:Int
) : Parcelable
