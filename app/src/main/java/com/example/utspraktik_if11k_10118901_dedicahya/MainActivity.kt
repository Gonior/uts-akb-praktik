package com.example.utspraktik_if11k_10118901_dedicahya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import com.example.utspraktik_if11k_10118901_dedicahya.R.drawable
import com.example.utspraktik_if11k_10118901_dedicahya.R.drawable.rounded_button_ok
import kotlinx.android.synthetic.main.activity_check_kembali.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

//Nama : Dedi Cahya
//Kelas : IF11K
//NIM : 10118901
//Tanggal Pengerjaan : 05 Juni 2021
class MainActivity : AppCompatActivity() {
    private var nama = ""
    private var nik = ""
    private var tgl = ""
    private var jk = "Laki -laki"
    private var status = "OrangTua"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_main)

        btn_next.setOnClickListener {
            nama = etnama.text.toString()
            nik = etnik.text.toString()
            tgl = ettgl.text.toString()
            val intent = Intent(this, CheckKembali::class.java)
            intent.putExtra("bio", arrayOf(nama, nik, tgl, status, jk))
            startActivity(intent)
        }


    }

    fun onRadioButtonJKClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radio_laki ->
                    if (checked) {
                        jk = "Laki -laki"
                    }
                R.id.radio_perempuan ->
                    if (checked) {
                        jk = "Perempuan"
                    }
            }
        }
    }
    fun onRadioButtonStClicked(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked
            when (view.getId()) {
                R.id.radio_ortu ->
                    if (checked) {
                        status = "Orangtua"
                    }
                R.id.radio_pasutri ->
                    if (checked) {
                        status = "Suami istri"
                    }
                R.id.radio_anak ->
                    if (checked) {
                        status = "anak"
                    }
                R.id.radio_kerabat ->
                    if (checked) {
                        status = "Kerabat Lainnya"
                    }
            }

        }
    }
}