package com.nepplus.librarypractice_20220221

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }


    fun setupEvents(){

        // 버튼 이외의, TextView, ImageView, LinearLayout 등등도  setOnClickListener로 이벤트 처리 가능함
        imgProfile.setOnClickListener {
            // 사진을 크게보는 액티비티로 이동
            val myIntent =  Intent(this, ViewPhotoActivity::class.java)
            startActivity(myIntent)
        }


        btnCall.setOnClickListener {

            //
            val myUri = Uri.parse("tel:010-1234-5678")
            val myIntent =  Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)
        }
    }

    fun setValues(){

    }
}