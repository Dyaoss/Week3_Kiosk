package com.example.mykiosk

fun main() {
    var visitor = showMainMenu()
}

fun showMainMenu() {
    var burger = Burger(1, "Burgers")

    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
    println("")
    println("[ SHAKESHACK MENU ]")
    burger.displayInfo()


    var selectNum = readLine()!!.toInt()

}

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

class Burger(idx: Int, mainMenu: String) : Food(idx, mainMenu){
    override fun displayInfo() {
        super.displayInfo()
        println("${idx}. ${mainMenu}         | 앵거스 비프 통살을 다져만든 버거")
    }
}

class Custard(idx: Int, mainMenu: String) : Food(idx, mainMenu){
    override fun displayInfo() {
        super.displayInfo()
        println("${idx}. ${mainMenu}  | 매장에서 신선하게 만드는 아이스크림")
    }
}

class Drinks(idx: Int, mainMenu: String) : Food(idx, mainMenu){
    override fun displayInfo() {
        super.displayInfo()
        println("${idx}. ${mainMenu}          | 매장에서 직접 만드는 음료")
    }
}

class Beer(idx: Int, mainMenu: String) : Food(idx, mainMenu){
    override fun displayInfo() {
        super.displayInfo()
        println("${idx}. ${mainMenu}            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
    }
}