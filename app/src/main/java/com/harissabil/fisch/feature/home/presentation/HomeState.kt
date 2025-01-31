package com.harissabil.fisch.feature.home.presentation

import com.harissabil.fisch.core.firebase.firestore.domain.model.Logbook
import com.harissabil.fisch.feature.home.domain.model.Weather

data class HomeState(
    val isLoading: Boolean = false,
)

data class WeatherState(
    val isLoading: Boolean = false,
    val weather: Weather? = null,
    val lat: Double? = null,
    val lon: Double? = null,
)

data class LogbooksState(
    val isLoading: Boolean = false,
    val logbooks: List<Logbook?>? = emptyList(),
)
