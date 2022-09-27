package com.example.testprojectfortestgithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Изменения task_1")
        println("Сделал чтобы подгружался список сообщений как то по другому")
    }
}