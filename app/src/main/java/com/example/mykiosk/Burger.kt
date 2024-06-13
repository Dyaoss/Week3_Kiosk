package com.example.mykiosk

open class Burger(idx: Int, mainMenu: String) : Food(idx, mainMenu) {
    open override fun displayInfo() {
        super.displayInfo()
        println("${idx}. ${mainMenu}         | 앵거스 비프 통살을 다져만든 버거")
    }
}