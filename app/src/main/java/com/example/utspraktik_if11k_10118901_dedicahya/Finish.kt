package com.example.utspraktik_if11k_10118901_dedicahya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

//Nama : Dedi Cahya
//Kelas : IF11K
//NIM : 10118901
//Tanggal Pengerjaan : 05 Juni 2021
class Finish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_finish)
        btnOk.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}