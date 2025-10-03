package com.example.thirtydays.repositories

import com.example.thirtydays.models.WellnessDay
import com.example.thirtydays.R

class WellnessRepository {
    fun getWellnessDays(): List<WellnessDay> = listOf(
        WellnessDay(
            day = 1,
            title = R.string.spend_15_minutes_outdoors,
            shortDescription = R.string.take_time_to_connect_with_nature,
            fullDescription = R.string.fullDesc1,
            imageResId = R.drawable.outdoors
        ),
        WellnessDay(
            day = 2,
            title = R.string.listen_to_a_new_podcast_or_audiobook,
            shortDescription = R.string.expand_your_knowledge,
            fullDescription = R.string.fullDesc2,
            imageResId = R.drawable.podcast
        ),
        WellnessDay(
            day = 3,
            title = R.string.practice_10_minutes_of_meditation,
            shortDescription = R.string.clear_your_mind,
            fullDescription = R.string.fullDesc3,
            imageResId = R.drawable.meditation
        ),
        WellnessDay(
            day = 4,
            title = R.string.drink_8_glasses_of_water,
            shortDescription = R.string.stay_hydrated,
            fullDescription = R.string.fullDesc4,
            imageResId = R.drawable.water
        ),
        WellnessDay(
            day = 5,
            title = R.string.try_a_new_healthy_recipe,
            shortDescription = R.string.explore_nutritious_cooking,
            fullDescription = R.string.fullDesc5,
            imageResId = R.drawable.cooking
        )
        // ... continúa con los demás días
    )
}