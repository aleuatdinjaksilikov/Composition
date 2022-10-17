package com.example.composition.domain.entity

data class Question(
    val sum:Int,             //Зн. суммы которое отобр. в кружке
    val visibleNumber :Int, //Видимое число которое отобр. в левом квадратике
    val options:List<Int>   //Варианты ответов
)
