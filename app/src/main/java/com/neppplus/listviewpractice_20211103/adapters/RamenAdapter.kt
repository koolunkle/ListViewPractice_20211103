package com.neppplus.listviewpractice_20211103.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
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

        return row

    }

}