package com.example.amphibians.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AmphibioData (
    val name: String,
    val type: String,
    val description: String,
    @SerialName("image_src")
    val imageUrl: String
)
