package com.example.mykiosk

fun main() {
    var visitor = showMainMenu()
}

fun showMainMenu() {
    var burger = Burger(1, "Burgers")
    var custard = Custard(2, "Frozen Custard")
    var drinks = Drinks(3, "Drinks")
    var beer = Beer(4, "Beer")

    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
    println("")
    println("[ SHAKESHACK MENU ]")
    burger.displayInfo()
    custard.displayInfo()
    drinks.displayInfo()
    beer.displayInfo()
    println("0. 종료             | 프로그램 종료")
    print("-> ")
    var selectNum = readLine()!!.toInt()

}




