package com.example.lovecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculateLove(view: View) {
        val fname : EditText = findViewById(R.id.Name1);
        val input1 = fname.text.toString();
        val pname : EditText = findViewById(R.id.Name2);
        val input2 = pname.text.toString();
        val intent = Intent(this, Calculator::class .java)
        val data : Bundle =  Bundle();
        data.putString(Calculator.FIRST_PERSON,input1)
        data.putString(Calculator.SECOND_PERSON,input2)
        intent.putExtras(data);
        startActivity(intent)
    }
}