package com.neppplus.listviewpractice_20211103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.listviewpractice_20211103.datas.RamenData
import kotlinx.android.synthetic.main.activity_view_ramen_detail.*

class ViewRamenDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_ramen_detail)

//        통째로 넘겨준 RamenData를 intent에서 받아오자.
//        Serializable을 받아오고있다. RamenData가 아님. => RamenData로 복원해야함.
        val RamenData = intent.getSerializableExtra("ramen") as RamenData


        txtName.text = RamenData.name
        txtExpiry.text = "${ RamenData.getExpiry( ) }년"
        txtAddress.text = RamenData.address


    }
}