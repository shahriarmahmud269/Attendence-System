package com.example.shahr.attendence

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.sec_add_pop_up.*
import java.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        add_sec_btn.setOnClickListener({

            val sec_dialog = AlertDialog.Builder(this)
            val sec_dialog_view =  layoutInflater.inflate(R.layout.sec_add_pop_up, null)





            sec_dialog.setView(sec_dialog_view).show()

            Toast.makeText(this,"hi", Toast.LENGTH_LONG).show()

    })

    }
}
