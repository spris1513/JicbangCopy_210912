package com.neppplus.jicbangcopy_210912.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.jicbangcopy_210912.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mlist: ArrayList<RoomData>) : ArrayAdapter<RoomData>(mContext,resId,mlist) {



}