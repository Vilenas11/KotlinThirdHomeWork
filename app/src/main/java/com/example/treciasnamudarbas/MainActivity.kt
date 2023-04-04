package com.example.treciasnamudarbas

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var task01TextView: TextView
    lateinit var task02TextView: TextView
    lateinit var task03TextView: TextView
    lateinit var clickMeButton: Button
    val tag = "TestTag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_exercise_control_flow_01)

        task01TextView= findViewById(R.id.task01TextView)
        task02TextView = findViewById(R.id.task02TextView)
        task03TextView = findViewById(R.id.task03TextView)
        clickMeButton = findViewById(R.id.clickMeButton)
        clickMeButton.setOnClickListener{
            doFirstTask()
            doSecondTask()
            doThirdTask()
        }
    }
    fun doFirstTask(){

        var currentDay = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
        when(currentDay){
                1 -> task01TextView.text = "Today is Sunday"
                2 -> task01TextView.text = "Today is Monday"
                3 -> task01TextView.text = "Today is Tuesday"
                4 -> task01TextView.text = "Today is Wednesday"
                5 -> task01TextView.text = "Today is Thursday"
                6 -> task01TextView.text = "Today is Friday"
                7 -> task01TextView.text = "Today is Saturday"
        }
    }
    fun doSecondTask(){
        var randomInteger1 = (1..10).random()
        when (randomInteger1) {
            0 -> task02TextView.text = "$randomInteger1 \nUnknown day of week"
            1 -> task02TextView.text = "Random value is $randomInteger1 \nMonday"
            2 -> task02TextView.text = "Random value is $randomInteger1 \nTuesday"
            3 -> task02TextView.text = "Random value is $randomInteger1 \nWednesday"
            4 -> task02TextView.text = "Random value is $randomInteger1 \nThursday"
            5 -> task02TextView.text = "Random value is $randomInteger1 \nFriday"
            6 -> task02TextView.text = "Random value is $randomInteger1 \nSaturday"
            7 -> task02TextView.text = "Random value is $randomInteger1 \nSunday"
            in 8..10 -> task02TextView.text = "$randomInteger1 \nUnknown day of week"
        }
    }
    fun doThirdTask(){
        var randomInteger2 = (1..10).random()
        when (randomInteger2) {
            0 -> task03TextView.text = "Random value is $randomInteger2 \n" +
                    "Unknown day of the week"
            in 1..5 -> task03TextView.text = "Random value is $randomInteger2 \n" +
                    "Today is working day"
            6, 7 -> task03TextView.text = "Random value is $randomInteger2 \n" +
                    "Today is weekend"
            in 8..10 -> task03TextView.text = "Random value is $randomInteger2 \n" +
                    "Unknown day of the week"
        }
    }
}