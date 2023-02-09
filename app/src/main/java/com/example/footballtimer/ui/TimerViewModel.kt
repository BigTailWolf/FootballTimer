package com.example.footballtimer.ui

import androidx.lifecycle.ViewModel
import com.example.footballtimer.data.TimerUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class TimerViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(TimerUiState())
    val uiState: StateFlow<TimerUiState> = _uiState.asStateFlow()

    fun onCount() {
        _uiState.update { currentState ->
            currentState.copy(playClockRunning = true)
        }
    }

    fun onSnap() {
        _uiState.update { currentState ->
            currentState.copy(playClockRunning = false)
        }
    }

    fun onReset() {
        _uiState.update { currentState ->
            currentState.copy(
                playClockRunning = false,
                gameClockRunning = false,
                currentPlayClock = 40000L,
            )
        }
    }
}