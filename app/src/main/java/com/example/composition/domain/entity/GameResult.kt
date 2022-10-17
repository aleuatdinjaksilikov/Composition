package com.example.composition.domain.entity

data class GameResult (
    val winner:Boolean,
    val countOfRightAnswers:Int, //КОЛ-ВО ПРАВИЛЬНЫХ ОТВЕТОВ
    val countOfQuestion: Int,  //Общее кол-во вопросов на которое ответил пользователь
    val gameSettings: GameSettings //Настройка игры
        )