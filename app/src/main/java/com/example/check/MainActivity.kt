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
        fun Wymagania (pass: String,pass2: String){

            val check1=findViewById<CheckBox>(R.id.CheckDuzaLitera)
            check1.isChecked = Pattern.compile(".*[A-Z].*").matcher(pass).matches() ||
                    Pattern.compile(".*[A-Z].*").matcher(pass2).matches()

            val check2=findViewById<CheckBox>(R.id.CheckMalaLitera)
            check2.isChecked = Pattern.compile(".*[a-z].*").matcher(pass).matches() ||
                    Pattern.compile(".*[a-z].*").matcher(pass2).matches()

            val check3=findViewById<CheckBox>(R.id.CheckCyfra)
            check3.isChecked = Pattern.compile(".*\\d.*").matcher(pass).matches() ||
                    Pattern.compile(".*\\d.*").matcher(pass2).matches()

            val check4=findViewById<CheckBox>(R.id.CheckZnakSpecjalny)
            check4.isChecked = Pattern.compile(".*[~!@#\$%^&*()_+{}\\\\[\\\\]:;,.<>/?-].*").matcher(pass).matches() ||
                    Pattern.compile(".*[~!@#\$%^&*()_+{}\\\\[\\\\]:;,.<>/?-].*").matcher(pass2).matches()

            val check5=findViewById<CheckBox>(R.id.CheckZgodny)
            check5.isChecked = pass == pass2
        }
        val Submit=findViewById<Button>(R.id.SubmitButton)
        val haslo=findViewById<EditText>(R.id.haslo1)
        val haslo1=findViewById<EditText>(R.id.haslo2)
        Submit.setOnClickListener {
            Wymagania(haslo.text.toString(), haslo1.text.toString())
        }

    }
}