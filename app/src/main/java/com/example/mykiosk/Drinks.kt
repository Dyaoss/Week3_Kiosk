package com.example.mykiosk

class Drinks(idx: Int, mainMenu: String) : Food(idx, mainMenu) {
    override fun displayInfo() {
        super.displayInfo()
        println("${idx}. ${mainMenu}          | 매장에서 직접 만드는 음료")
    }
}