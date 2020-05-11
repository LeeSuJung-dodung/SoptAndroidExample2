package com.example.hw2_sopt

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            if(et_id.text.isNullOrBlank()||et_pw.text.isNullOrBlank()) {
                Toast.makeText(this, "아이디와 비밀번호를 확인하세요", Toast.LENGTH_SHORT).show()
            }
            else
            {
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        tv_register.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivityForResult(intent,1000)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                1000 -> {
                    val text1= data!!.getStringExtra("id")
                    val text2 = data!!.getStringExtra("pw")
                    et_id.setText(text1)
                    et_pw.setText(text2)
                }
            }
        }
    }
}