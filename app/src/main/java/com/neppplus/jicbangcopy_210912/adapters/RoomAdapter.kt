package com.neppplus.jicbangcopy_210912.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.neppplus.jicbangcopy_210912.R
import com.neppplus.jicbangcopy_210912.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mlist: ArrayList<RoomData>) : ArrayAdapter<RoomData>(mContext,resId,mlist) {


    val mInflater = LayoutInflater.from(mContext)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow==null){
            tempRow = mInflater.inflate(R.layout.roon_list_item,null)
        }

        val row = tempRow!!

        return row
    }

}