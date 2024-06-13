package com.example.mykiosk

class Beer(idx: Int, mainMenu: String) : Food(idx, mainMenu) {
    override fun displayInfo() {
        super.displayInfo()
        println("${idx}. ${mainMenu}            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
    }
}