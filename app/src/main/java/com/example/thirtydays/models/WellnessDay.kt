package com.example.thirtydays.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class WellnessDay(
    val day: Int,
    @StringRes val title: Int,
    @StringRes val shortDescription: Int,
    @StringRes val fullDescription: Int,
    @DrawableRes val imageResId: Int
)