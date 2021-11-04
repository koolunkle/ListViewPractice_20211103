package com.neppplus.listviewpractice_20211103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_ramen_detail.*

class ViewRamenDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_ramen_detail)

        val name = intent.getStringExtra("name")
        txtName.text = name

        val address = intent.getStringExtra("address")
        txtAddress.text = address

        val birthYear = intent.getIntExtra("birthYear", 0)
        txtExpiry.text = birthYear.toString()


    }
}