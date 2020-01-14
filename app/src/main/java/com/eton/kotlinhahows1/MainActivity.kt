package com.eton.kotlinhahows1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_intent.setOnClickListener {
            val data: Uri = Uri.parse("im://paradise_soft/chatroom?chatId=44&title=c7测试&chatP=15932")
            val intent = Intent(Intent.ACTION_VIEW, data)
            intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK
            val intentUri = intent.toUri(Intent.URI_INTENT_SCHEME)
            Log.d("intentUri", intentUri)
            startActivity(intent)

        }
    }
}
