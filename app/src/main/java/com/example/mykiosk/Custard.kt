package com.example.mykiosk

import java.time.temporal.ChronoUnit


fun displayCustardMenu() {
    var selectCustard = 0

    println("[ Forzen Custard MENU ]")
    val custards = listOf(
        Shake("Shakes", 5.9, "바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리"),
        Week("Shake of the Week", 6.5, "특별한 커스터드 플레이버"),
        RedBean("Red Bean Shake", 6.5, "신선한 커스터드와 함께 우유와 레드빈이 블렌딩된 시즈널 쉐이크"),
        Floats("Float", 5.9, "루트 비어, 퍼플 카우, 크림시클")
    )
    custards.forEachIndexed { index, custard -> custard.display(index + 1) }

    println(" 0. 뒤로가기              | 뒤로가기")
    selectCustard = readLine()!!.toInt()

    if (selectCustard in 1..custards.size) {
        println("${custards[selectCustard - 1].name}이(가) 선택되었습니다.")
    }
}

open class Custard(val name: String, val price: Double, val description: String) {
    open fun display(num: Int) {
        println("$num.$name  | W $price | $description")
    }
}

class Shake(name: String, price: Double, description: String) : Custard(name, price, description) {
}

class Week(name: String, price: Double, description: String) : Custard(name, price, description) {
}

class RedBean(name: String, price: Double, description: String) :
    Custard(name, price, description) {
}

class Floats(name: String, price: Double, description: String) : Custard(name, price, description) {
}



