package com.example.amphibians.ui.screens

import androidx.lifecycle.ViewModel
import com.example.amphibians.data.AmphibiansUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AmphibiansViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(AmphibiansUiState())
    val uiState: StateFlow<AmphibiansUiState> = _uiState.asStateFlow()
}