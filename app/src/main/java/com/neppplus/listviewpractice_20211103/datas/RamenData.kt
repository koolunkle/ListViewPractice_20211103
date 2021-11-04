package com.neppplus.listviewpractice_20211103.datas

import java.io.Serializable

class RamenData (
    val name: String,
    val birthYear: Int,
    val address: String) : Serializable {

//    함수로 라면의 기능을 만들자.

//    라면의 유효기간을 계산해서 알려주는 기능 - function

    fun getExpiry(  ) : Int {

        val Expiry = this.birthYear + 1

        return Expiry
    }

}