package com.example.mykiosk

open class Food(idx: Int, mainMenu: String) { // 메인메뉴를 디스플레이할 클래스
    var mainMenu: String = ""
    var idx: Int = 0

    init {
        this.mainMenu = mainMenu
        this.idx = idx
    }

    open fun displayInfo() {
    }
}