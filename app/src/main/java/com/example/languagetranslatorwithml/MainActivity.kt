package com.example.languagetranslatorwithml

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var spinnerFrom: Spinner
    private lateinit var spinnerTo: Spinner
    private lateinit var textForTranslation: EditText
    private lateinit var textTranslated: TextView
    private lateinit var translatebtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        translatebtn = findViewById(R.id.translatebtn)
        textTranslated = findViewById(R.id.translatedText)
        textForTranslation = findViewById(R.id.textForTranslate)
        spinnerFrom = findViewById(R.id.translateFrom)
        spinnerTo = findViewById(R.id.translateTo)


    }
}