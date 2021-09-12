package com.neppplus.jicbangcopy_210912

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jicbangcopy_210912.datas.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class activity_view_room_detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val room = intent.getSerializableExtra("roomData") as RoomData

        priceTxt.text = room.gerFormattedPrice()
        descriptionTxt.text = room.description
        adressTxt.text = room.address
        floorTxt.text = room.getFormatedFloor()


    }
}