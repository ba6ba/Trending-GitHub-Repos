package com.ba6ba.sadapaycasestudy.home.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HomeItemUiData(
    val title: String,
    val description: String,
    val stars: String,
    val watches: String,
    val authorImage: String,
    val authorName: String,
    val languageName: String,
    val metadata: Metadata
) : Parcelable {

    @Parcelize
    data class Metadata(
        val id: Int,
        val repoUrl: String
    ) : Parcelable
}