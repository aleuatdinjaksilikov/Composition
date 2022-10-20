package com.example.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameResult (
    val winner:Boolean,
    val countOfRightAnswers:Int, //КОЛ-ВО ПРАВИЛЬНЫХ ОТВЕТОВ
    val countOfQuestion: Int,  //Общее кол-во вопросов на которое ответил пользователь
    val gameSettings: GameSettings //Настройка игры
        ):Parcelable