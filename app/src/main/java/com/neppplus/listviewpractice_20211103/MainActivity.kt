package com.neppplus.listviewpractice_20211103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.listviewpractice_20211103.adapters.RamenAdapter
import com.neppplus.listviewpractice_20211103.datas.RamenData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRamenList = ArrayList<RamenData>()
    lateinit var mRamenAdapter : RamenAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRamenList.add( RamenData( "신라면", 1988, "농심" )  )
        mRamenList.add( RamenData("진라면", 1998, "오뚜기") )
        mRamenList.add( RamenData("왕뚜껑", 1996, "팔도") )
        mRamenList.add( RamenData("스낵면", 1983, "오뚜기") )
        mRamenList.add( RamenData("튀김우동", 1996, "농심") )
        mRamenList.add( RamenData("참깨라면", 1993, "오뚜기") )
        mRamenList.add( RamenData("팔도비빔면", 1977, "팔도") )
        mRamenList.add( RamenData("진비빔면", 1992, "오뚜기") )

        mRamenAdapter = RamenAdapter(this, R.layout.ramen_list_item, mRamenList)
        ramenListView.adapter = mRamenAdapter

    }
}