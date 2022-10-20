package com.example.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameSettings (
    val maxSumValue:Int, //Макс. возможное зн. суммы
    val minCountOfRightAnswers:Int, //Мин. кол-во правильных ответов для победы
    val minPercentOfRightAnswers:Int, //Мин. процент правильных ответов
    val gameTimeInSeconds:Int //Время игры в секундах
        ):Parcelable