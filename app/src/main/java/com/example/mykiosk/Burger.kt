package com.example.mykiosk


fun displayBurgerMenu() {
    var selectBurger = 0

    println("[ Burgers MENU ]")
    var shack = Shack().display()
    var smoke = Smoke().display()
    var shroom = Shroom().display()
    var cheese = Cheese().display()
    var ham = Ham().display()
    println(" 0. 뒤로가기          | 뒤로가기")
    selectBurger = readLine()!!.toInt()
    when (selectBurger) {
        1 -> println("${Shack().name}가 선택되었습니다. ")
        2 -> println("${Smoke().name}가 선택되었습니다. ")
        3 -> println("${Shroom().name}가 선택되었습니다. ")
        4 -> println("${Cheese().name}가 선택되었습니다. ")
        5 -> println("${Ham().name}가 선택되었습니다. ")
        0 -> {
            main()
        }
    }
}

open class Burger() {
    open fun display() {
        println("")
    }
}

class Shack() : Burger() {
    val name = "ShackBurger"
    val price = 6.9
    override fun display() {
        println(" 1. ${name}     | W ${price} | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
    }
}

class Smoke() : Burger() {
    val name = "SmokeShack"
    val price = 8.9
    override fun display() {
        println(" 2. ${name}      | W ${price} | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
    }
}

class Shroom() : Burger() {
    val name = "Shroom Burger"
    val price = 9.4
    override fun display() {
        println(" 3. ${name}   | W ${price} | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
    }
}

class Cheese() : Burger() {
    val name = "CheeseBurger"
    val price = 6.9
    override fun display() {
        println(" 4. ${name}    | W ${price} | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
    }
}

class Ham() : Burger() {
    val name = "HamBurger"
    val price = 5.4
    override fun display() {
        println(" 5. ${name}       | W ${price} | 비프패티를 기반으로 야채가 들어간 기본버거")
    }
}
