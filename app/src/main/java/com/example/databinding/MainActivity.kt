package com.example.databinding

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityMainBinding: ActivityMainBinding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        activityMainBinding.book = Book("Hamlet", "Shakespeare")
        activityMainBinding.mainButtonHandler = ActivityButtonHandler(context = this)
    }

    class ActivityButtonHandler(private val context: Context) {
        fun onHelloBtnClicked() {
            val intent = Intent(context, GreetingActivity::class.java)
            startActivity(context, intent, null)
        }
    }
}