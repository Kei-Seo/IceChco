package com.example.icechco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Login_resultActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User("컴퓨터공학과","모션","30~40명",
            "웹 및 모바일 애플리케이션을 개발하는 동아리!"),
        User("컴퓨터공학과","어드민","20~30명",
            "리눅스 기반으로 오픈소스를 공부하는 동아리."),
        User("중앙동아리","트레콤","10~20명",
        "밴드동아리 신입 멤버를 구합니다."),
        User("중앙동아리","앵글스","40~50명",
        "같이 사진 찍으러 출사가요!"),
        User("컴퓨터공학과","프로브","30~40명",
        "웹 프로그래밍 및 웹 기술에 대해 공부하는 동아리"),
        User("컴퓨터공학과","그로우","30~40명",
        "Game, RObot, Wearable"),
        User("중앙동아리","선율","20~30명",
        "피아노 동아리인 선율에서 동아리원을 모집합니다."),
        User("중앙동아리","플레임즈","20~30명",
            "밴드동아리 플레임즈에서 멤버를 모집합니다."),
        User("컴퓨터공학과","아르고스","30~40명","해킹 전문 동아리")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Adapter = ListAdapter(this, UserList)
        list_view.adapter = Adapter

    }

}