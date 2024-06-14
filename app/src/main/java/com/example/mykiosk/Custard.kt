package com.example.mykiosk

import java.time.temporal.ChronoUnit


fun displayCustardMenu() {
    var selectCustard = 0

    println("[ Forzen Custard MENU ]")
    var shake = Shake().display()
    var week = Week().display()
    var redBean = RedBean().display()
    var floats = Floats().display()
    println(" 0. 뒤로가기              | 뒤로가기")
    selectCustard = readLine()!!.toInt()

    when (selectCustard) {
        1 -> println("${Shake().name}가 선택되었습니다. ")
        2 -> println("${Week().name}가 선택되었습니다. ")
        3 -> println("${RedBean().name}가 선택되었습니다. ")
        4 -> println("${Floats().name}가 선택되었습니다. ")
        0 -> {
            main()
        }
    }
}

open class Custard() {
    open fun display() {
        println("")
    }
}

class Shake() : Custard() {
    val name = "Shakes"
    val price = 5.9
    override fun display() {
        println(" 1. ${name}              | W ${price} | 바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리")
    }
}

class Week() : Custard() {
    val name = "Shake of the Week"
    val price = 6.5
    override fun display() {
        println(" 2. ${name}   | W ${price} | 특별한 커스터드 플레이버")
    }
}

class RedBean() : Custard() {
    val name = "Red Bean Shake"
    val price = 6.5
    override fun display() {
        println(" 3. ${name}      | W ${price} | 신선한 커스터드와 함께 우유와 레드빈이 블렌딩된 시즈널 쉐이크")
    }
}

class Floats() : Custard() {
    val name = "Floats"
    val price = 5.9
    override fun display() {
        println(" 4. ${name}              | W ${price} | 루트 비어, 퍼플 카우, 크림시클")
    }
}


