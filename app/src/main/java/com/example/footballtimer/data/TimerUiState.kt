package com.example.footballtimer.data

data class TimerUiState (
    val currentGameClock: Long = 0,
    val currentPlayClock: Long = 0,

    val gameClockRunning: Boolean = false,
    val playClockRunning: Boolean = false,
)