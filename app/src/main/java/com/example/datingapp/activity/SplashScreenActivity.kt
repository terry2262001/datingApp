package com.example.datingapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.datingapp.Greeting
import com.example.datingapp.MainActivity
import com.example.datingapp.R
import com.example.datingapp.auth.LoginActivity
import com.example.datingapp.ui.theme.DatingAppTheme
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({

                  val user = FirebaseAuth.getInstance().currentUser
                    if(user == null){
                        startActivity(Intent(this,LoginActivity::class.java))
                    }else{
                        startActivity(Intent(this,MainActivity::class.java))
                    }
        },2000)
    }
}