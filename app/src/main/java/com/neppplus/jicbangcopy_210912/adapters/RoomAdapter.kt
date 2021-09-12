package com.neppplus.jicbangcopy_210912.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.jicbangcopy_210912.R
import com.neppplus.jicbangcopy_210912.datas.RoomData
import org.w3c.dom.Text

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

        val Data = mlist[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val adressAndFloorTxt = row.findViewById<TextView>(R.id.adressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

        descriptionTxt.text = Data.description



        return row
    }

}