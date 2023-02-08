package com.example.footballtimer.data
import com.example.footballtimer.R

object DataSource {
  val sectionTimeOptions = listOf(
    Pair(R.string.fifteen_minutes, 15000),
    Pair(R.string.ten_minutes, 10000),
    Pair(R.string.five_minutes, 5000),
  )

  val stoppageTimeOptions = listOf(
    Pair(R.string.five_minutes, 5000),
    Pair(R.string.two_minutes, 2000),
  )
}