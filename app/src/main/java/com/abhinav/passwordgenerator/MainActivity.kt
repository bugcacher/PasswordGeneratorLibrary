package com.abhinav.passwordgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var obj : PasswordGenerator = PasswordGenerator(12,
            includeUpperCaseLetters = true,
            includeLowerCaseLetters = true,
            includeSymbols = true,
            includeNumbers = false
        )
        Log.e("MainActivity","Password: " + obj.generatePassword())
    }
}
