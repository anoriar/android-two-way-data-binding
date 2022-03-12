package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityGreetingBinding

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        val greetingBinding: ActivityGreetingBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_greeting)

        
        greetingBinding.greeting = Greeting("test@mail.ru", "Hello")

    }
}