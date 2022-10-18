package com.example.composition.data

import com.example.composition.domain.entity.GameSettings
import com.example.composition.domain.entity.Level
import com.example.composition.domain.entity.Question
import com.example.composition.domain.repository.GameRepository
import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random

object GameRepositoryImpl:GameRepository {

    private const val MIN_SUM_VALUE = 2
    private const val MIN_ANSWER_VALUE = 1

    override fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question {
        val sum = Random.nextInt(MIN_SUM_VALUE,maxSumValue+1)  //Общая сумма в круге
        val visibleNumber = Random.nextInt(MIN_ANSWER_VALUE,sum) //видимое число в квадратике
        val options = HashSet<Int>()
        val rightAnswer = sum - visibleNumber  //Правильный ответ
        options.add(rightAnswer)
        val from /* From - Низкая граница */ = max(rightAnswer - countOfOptions , MIN_ANSWER_VALUE)
        // from - Мин. зн. сгенерированных вариантов ответа
        val to /* to - Высокая  граница */ = min(maxSumValue,rightAnswer+countOfOptions)
        // to - Макс. зн. сгенерированных вариантов ответа
        while (options.size<countOfOptions){
            options.add(Random.nextInt(from,to))
        }
        return Question(sum,visibleNumber,options.toList())

    }

    override fun getGameSettings(level: Level): GameSettings {
        return when(level){
            Level.TEST -> {
                GameSettings(
                    10,
                    3,
                    50,
                    8
                )
            }
            Level.EASY -> {
                GameSettings(
                    10,
                    10,
                    70,
                    60
                )
            }
            Level.NORMAL -> {
                GameSettings(
                    20,
                    20,
                    80,
                    40
                )
            }
            Level.HARD -> {
                GameSettings(
                    30,
                    30,
                    90,
                    40
                )
            }
        }
    }
}