package com.example.studentportal

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Portal(
    var portalText: String,
    var portalURL: String
) :Parcelable
