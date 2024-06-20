package com.example.mykiosk


fun displayBurgerMenu() {
    var selectBurger = 0

    println("[ Burgers MENU ]")
    val burgers = listOf(
        Shack("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
        Smoke("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
        Shroom("Shroom Burger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"),
        Cheese("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
        Ham("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")

    )
    burgers.forEachIndexed { index, burger -> burger.display(index + 1) } // 람다 컬렉션 확장함수쪽을 공부ㄴ

    println(" 0. 뒤로가기          | 뒤로가기")
    selectBurger = readLine()!!.toInt()

    if(selectBurger in 1..burgers.size){
        println("${burgers[selectBurger-1].name}이(가) 선택되었습니다.")
    }
}

open class Burger(val name: String, val price: Double, val description: String) {
    open fun display(number: Int) {
        println("$number.$name   | W $price | $description")
    }
}

class Shack(name: String, price: Double, description: String) : Burger(name, price, description) {
}

class Smoke(name: String, price: Double, description: String) : Burger(name, price, description) {
}

class Shroom(name: String, price: Double, description: String) : Burger(name, price, description) {
}

class Cheese(name: String, price: Double, description: String) : Burger(name, price, description) {
}

class Ham(name: String, price: Double, description: String) : Burger(name, price, description) {
}