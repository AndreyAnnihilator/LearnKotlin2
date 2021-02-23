package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var text:String = "В <магазине> осталось 123 яблока, а может и <больше, кто знает>"
    private var tvText: TextView? = null
    private var tvText2: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText = findViewById(R.id.tvText)
        var subText:String = text.substringAfter('<')
        var subText2:String = subText.substringBefore('>')
        tvText?.setText(subText2)

        tvText2 = findViewById(R.id.tvText2)
        var subText3:String = text.substringAfterLast('<')
        var subText4:String = subText3.substringBeforeLast('>')
        tvText2?.setText(subText4)

        
    }

}

