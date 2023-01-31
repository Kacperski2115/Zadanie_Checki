package com.example.check

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Submit=findViewById<Button>(R.id.SubmitButton)
        val check3=findViewById<CheckBox>(R.id.CheckCyfra)
        val check4=findViewById<CheckBox>(R.id.CheckZnakSpecjalny)
        val check5=findViewById<CheckBox>(R.id.CheckZgodny)
        val haslo=findViewById<EditText>(R.id.haslo1).text.toString()
        val haslo1=findViewById<EditText>(R.id.haslo2).text.toString()
        fun Funkcja1 (pass: CharSequence){
            val check1=findViewById<CheckBox>(R.id.CheckDuzaLitera)
            val duzalitera=Pattern.compile(".*[A-Z].*").matcher(pass).matches()
            check1.isChecked=duzalitera
        }
        fun Funkcja2 (pass: CharSequence){
            val check2=findViewById<CheckBox>(R.id.CheckMalaLitera)
            val malalitera=Pattern.compile(".*[a-z].*").matcher(pass).matches()
            check2.isChecked=malalitera
        }
        fun Funkcja3 (pass: CharSequence){
            val check3=findViewById<CheckBox>(R.id.CheckCyfra)
            val cyfra=Pattern.compile(".*[0-9].*").matcher(pass).matches()
            check3.isChecked=cyfra
        }
        fun Funkcja4 (pass: CharSequence){
            val check4=findViewById<CheckBox>(R.id.CheckZnakSpecjalny)
            val znakspecjalny=Pattern.compile(".*[@!#$%^&*()_+-={};:'<>,.?/\\\"].*").matcher(pass).matches()
            check4.isChecked=znakspecjalny
        }

    }
}