package com.neppplus.listviewpractice_20211103.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.listviewpractice_20211103.R
import com.neppplus.listviewpractice_20211103.datas.RamenData

class RamenAdapter (
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RamenData> ) : ArrayAdapter<RamenData>( mContext, resId, mList ) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.ramen_list_item, null)
        }

//        tempRow가 비어있다면 => 채워줌.
//        tempRow가 비었을 가능성은? 없다
//        안전하게 사용가능한 row를 만들자.
        val row = tempRow!!

//        기본 모양으로 만들어진 row를 이용해서 -> 실제 데이터를 적용시키고 나서

//        목록으로 들어온 mList중 position에 맞는 라면데이터 추출
//        cf : ArrayList => 0번칸 ~ 갯수-1번칸 까지 존재함.
        val data = mList[ position ]

//        ramen_list_item에 적어둔 id로 => 코틀린에서 다루도록 처리.
        val txtName = row.findViewById<TextView>(R.id.txtName)
        val txtExpiry = row.findViewById<TextView>(R.id.txtExpiry)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddress)


        txtName.text = data.name
//        txtAge.text = data.birthYear.toString()
        txtAddress.text = data.address

//        라면데이터의 출시년도 > 유효기간으로 바꿔서 ( 유효기간 ) 으로 가공해서 출력.
//        val Expiry = data.birthYear + 1

//        라면데이터의 기능 활용 -> 유효기간 구해주는 기능.

        txtExpiry.text = "(${ data.getExpiry() }년)"


//        최종 결과로 나가자.
        return row

    }

}