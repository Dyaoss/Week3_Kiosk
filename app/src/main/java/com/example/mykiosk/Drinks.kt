package com.example.mykiosk

import android.util.EventLogTags.Description


fun displayDrinkMenu() {
    var selectDrink = 0

    println("[ Drinks MENU ]")
    val drinks = listOf(
        Lemonade("Shack-made Lemonade", 3.9, "매장에서 직접 만드는 상큼한 레모네이드"),
        IcedTea("Fresh Brewed Iced Tea", 3.4, "직접 유기농 홍차를 우려낸 아이스티"),
        Soda("Fountain Soda", 2.7, "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프"),
        RootBeer("Abita Root Beer", 4.4, "청량감 있는 독특한 미국식 무알콜 탄산음료"),
        Water("Bottled Water", 1.0, "지리산 암반대수층으로 만든 프리미엄 생수")
    )
    drinks.forEachIndexed { index, drinks -> drinks.display(index + 1) }
    println(" 0. 뒤로가기                 | 뒤로가기")

    selectDrink = readLine()!!.toInt()

}

open class Drinks(val name: String, val price: Double, val description: String) {
    open fun display(num: Int) {
        println("$num.$name  | W $price | $description ")
    }
}

class Lemonade(name: String, price: Double, description: String) :
    Drinks(name, price, description) {
}

class IcedTea(name: String, price: Double, description: String) :
    Drinks(name, price, description) {
}

class Soda(name: String, price: Double, description: String) :
    Drinks(name, price, description) {
}

class RootBeer(name: String, price: Double, description: String) :
    Drinks(name, price, description) {
}

class Water(name: String, price: Double, description: String) :
    Drinks(name, price, description) {
}

