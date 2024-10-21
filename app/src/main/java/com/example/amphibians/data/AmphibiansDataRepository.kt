package com.example.amphibians.data

import com.example.amphibians.model.AmphibioData
import com.example.amphibians.network.AmphibiansApiService

interface AmphibiansDataRepository {
    suspend fun getAmphibiansData(): List<AmphibioData>
}

class NetworkAmphibiansDataRepository(
    private val amphibiansApiService: AmphibiansApiService
) : AmphibiansDataRepository {
    override suspend fun getAmphibiansData(): List<AmphibioData> = amphibiansApiService.getAmphibians()
}