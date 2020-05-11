package com.example.hw2_sopt

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        login_ok.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            intent.putExtra("id",r_et_id.text.toString())
            intent.putExtra("pw",r_et_pw.text.toString())
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}