package com.neppplus.jicbangcopy_210912

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.neppplus.jicbangcopy_210912.adapters.RoomAdapter
import com.neppplus.jicbangcopy_210912.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList=ArrayList<RoomData>()
    lateinit var mAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(  RoomData(8000,"서울시 동대문구", 5, "1번째 방입니다.")  )
        mRoomList.add(  RoomData(10000,"서울시 성동구", 1, "2번째 방입니다.")  )
        mRoomList.add(  RoomData(100000,"서울시 성동구", 30, "3번째 방입니다.")  )
        mRoomList.add(  RoomData(9000,"서울시 광진구", 2, "4번째 방입니다.")  )
        mRoomList.add(  RoomData(50000,"서울시 강남구", -1, "5번째 방입니다.")  )
        mRoomList.add(  RoomData(32000,"서울시 은평구", 9, "6번째 방입니다.")  )
        mRoomList.add(  RoomData(67120,"서울시 도봉구", 3, "7번째 방입니다.")  )
        mRoomList.add(  RoomData(34199,"서울시 노원구", 16, "8번째 방입니다.")  )
        mRoomList.add(  RoomData(28547,"서울시 양천구", 10, "9번째 방입니다.")  )
        mRoomList.add(  RoomData(36749,"서울시 동대문구", 8, "10번째 방입니다.")  )
        mRoomList.add(  RoomData(78942,"서울시 서대문구", 25, "11번째 방입니다.")  )
        mRoomList.add(  RoomData(19875,"서울시 강북구", 1, "12번째 방입니다.")  )
        mRoomList.add(  RoomData(150151,"서울시 송파구", 30, "13번째 방입니다.")  )
        mRoomList.add(  RoomData(354787,"서울시 잠실구", 48, "14번째 방입니다.")  )
        mRoomList.add(  RoomData(480000,"서울시 반포구", 60, "15번째 방입니다.")  )

        mAdapter = RoomAdapter(this,R.layout.roon_list_item, mRoomList)
        roomListView.adapter =mAdapter


        }

    }
