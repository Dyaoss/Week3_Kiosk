package com.example.mykiosk

fun main() {
    var visitor = showMainMenu()
}

fun showMainMenu() {
    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
    println("[ SHAKESHACK MENU ]")
    println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
    println("2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림")
    println("3. Drinks          | 매장에서 직접 만드는 음료")
    println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
    println("0. 종료             | 프로그램 종료")
    print("-> ")
    var selectNum = readLine()!!.toInt()

    when (selectNum) {
        1 -> displayBurgerMenu()
        2 -> displayCustardMenu()
        3 -> displayDrinkMenu()
        4 -> displayBeerMenu()
        0 -> println("프로그램을 종료합니다.")
        else -> {
            println("다시 입력해주세요.")
            main()
        }
    }
}




