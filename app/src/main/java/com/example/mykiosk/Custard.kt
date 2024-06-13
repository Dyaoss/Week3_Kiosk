package com.example.mykiosk

class Custard(idx: Int, mainMenu: String) : Food(idx, mainMenu) {
    override fun displayInfo() {
        super.displayInfo()
        println("${idx}. ${mainMenu}  | 매장에서 신선하게 만드는 아이스크림")
    }
}