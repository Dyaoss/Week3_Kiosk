package com.example.mykiosk


fun displayDrinkMenu() {
    var selectDrink = 0

    println("[ Drinks MENU ]")
    var lemonade = Lemonade().display()
    var icedTea = IcedTea().display()
    var soda = Soda().display()
    var rootBeer = RootBeer().display()
    var water = Water().display()
    println(" 0. 뒤로가기                 | 뒤로가기")
    selectDrink = readLine()!!.toInt()

    when (selectDrink) {
        1 -> println("${Lemonade().name}가 선택되었습니다. ")
        2 -> println("${IcedTea().name}가 선택되었습니다. ")
        3 -> println("${Soda().name}가 선택되었습니다. ")
        4 -> println("${RootBeer().name}가 선택되었습니다. ")
        5 -> println("${Water().name}가 선택되었습니다. ")
        0 -> {
            main()
        }
    }
}

open class Drinks() {
    open fun display() {
        println("")
    }
}

class Lemonade() : Drinks() {
    val name = "Shack-made Lemonade"
    val price = 3.9
    override fun display() {
        println(" 1. ${name}    | W ${price} | 매장에서 직접 만드는 상큼한 레모네이드")
    }
}

class IcedTea() : Drinks() {
    val name = "Fresh Brewed Iced Tea"
    val price = 3.4
    override fun display() {
        println(" 2. ${name}  | W ${price} | 직접 유기농 홍차를 우려낸 아이스티")
    }
}

class Soda() : Drinks() {
    val name = "Fountain Soda"
    val price = 2.7
    override fun display() {
        println(" 3. ${name}          | W ${price} | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프")
    }
}

class RootBeer() : Drinks() {
    val name = "Abita Root Beer"
    val price = 4.4
    override fun display() {
        println(" 4. ${name}        | W ${price} | 청량감 있는 독특한 미국식 무알콜 탄산음료")
    }
}

class Water() : Drinks() {
    val name = "Bottled Water"
    val price = 1.0
    override fun display() {
        println(" 5. ${name}          | W ${price} | 지리산 암반대수층으로 만든 프리미엄 생수")
    }
}
