package com.neppplus.listviewpractice_20211103.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.listviewpractice_20211103.datas.RamenData

class RamenAdapter (
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RamenData> ) : ArrayAdapter<RamenData>(  ) {
}