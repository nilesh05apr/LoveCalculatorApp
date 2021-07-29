package com.example.lovecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Calculator : AppCompatActivity() {
    companion object{
        const val FIRST_PERSON = "name1";
        const val SECOND_PERSON = "name2";
    }
    fun percentageCalculator(a : String?, b : String?): Float {
        var sum = 0;
        var totalSum = 0;
        if (a != null) {
            for(i in a) {
                sum += i.toInt()
                totalSum += i.toInt()
            }
        }
        if (b != null) {
            for (i in b) {
                sum -= i.toInt()
                totalSum += i.toInt()
            }
        }
        var temp = (sum.toFloat()/totalSum.toFloat())*100
        var ans= 0F;
        if(temp < 0) {ans = -1*temp} else{ans = temp}
        if (ans > 0 && ans <= 10)  { ans *= 10}
        else {ans %= 100F}
        return ans
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        val firstPerson = intent.getStringExtra(FIRST_PERSON);
        val secondPerson = intent.getStringExtra(SECOND_PERSON);
        val loveMessage :TextView = findViewById(R.id.message);
        val percent = percentageCalculator(firstPerson,secondPerson)
        loveMessage.text = "$firstPerson\n Loves \n$secondPerson \n${percent.toString()} %"
    }
}