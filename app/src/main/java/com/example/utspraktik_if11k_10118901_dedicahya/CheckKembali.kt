package com.example.utspraktik_if11k_10118901_dedicahya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_check_kembali.*


//Nama : Dedi Cahya
//Kelas : IF11K
//NIM : 10118901
//Tanggal Pengerjaan : 05 Juni 2021
class CheckKembali : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_check_kembali)
        if (intent.extras != null) {

            val bio = intent.extras!!.getStringArray("bio")
            tvnik.setText(bio?.get(1).toString())
            tvnama.setText(bio?.get(0).toString())
            tvjk.setText(bio?.get(4).toString())
            tvtanggal.setText(bio?.get(2).toString())
            tvstatus.setText(bio?.get(3).toString())

        }

        btnUbah.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnSimpan.setOnClickListener {
            val intent = Intent(this, Finish::class.java)
            startActivity(intent)
        }
    }
}