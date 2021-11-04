package com.neppplus.listviewpractice_20211103

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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

//             리스트뷰의 각 줄이 눌린 이벤트 처리
        ramenListView.setOnItemClickListener { adapterView, view, position, l ->

//            position : 몇번 줄이 눌렸는가? 알려주는 역할.
            Log.d("리스트뷰클릭", "${position}번 줄 클릭됨")

//            눌린 위치에 맞는 라면 데이터 변수에 저장.
            val clickedRamen = mRamenList[position]

//            ex. 눌린 라면의 이름을 토스트로 출력
//            Toast.makeText(this, "${clickedRamen.name} 클릭됨", Toast.LENGTH_SHORT).show()

//            상세 보기 화면으로 이동

            val myIntent = Intent( this, ViewRamenDetailActivity::class.java )
            myIntent.putExtra("name", clickedRamen.name)
            myIntent.putExtra("birthYear", clickedRamen.birthYear)
            myIntent.putExtra("address", clickedRamen.address)
            startActivity(myIntent)


        }

        ramenListView.setOnItemLongClickListener { adapterView, view, position, l ->

            val longClickedRamen = mRamenList[position]

//            Toast.makeText(this, "${longClickedRamen.name} 길게 눌림", Toast.LENGTH_SHORT).show()

//            길게 눌린 라면을 목록에서 제거 -> 리스트뷰에서도 빠지게 해보자. (삭제 기능)
            mRamenList.remove(longClickedRamen)

//            리스트뷰 -> 어댑터에게 새로고침 시키자. (인지시키자)
            mRamenAdapter.notifyDataSetChanged()


//            Boolean (true / false)을 결과로 지정해줘야함.
            return@setOnItemLongClickListener true
        }


    }
}