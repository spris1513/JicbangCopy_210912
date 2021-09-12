package com.neppplus.jicbangcopy_210912

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jicbangcopy_210912.datas.RoomData

class activity_view_room_detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val room = intent.getSerializableExtra("roomData") as RoomData


    }
}