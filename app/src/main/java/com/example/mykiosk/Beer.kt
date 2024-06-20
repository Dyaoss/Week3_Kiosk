package com.example.mykiosk

import java.time.temporal.ChronoUnit


fun displayBeerMenu() {
    var selectBeer = 0

    println("[ Beer MENU ]")
    val beers = listOf(
        Ale("ShackMeister Ale", 9.8, "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일맥주"),
        Magpie("Magpie Brewing Co.", 6.8, "Pale Ale Draft, Porter Draft, Wheat Draft"),
        Hand("The Hand and Malt", 6.8, "IPA Can, Mocha Stout Can")
    )
    beers.forEachIndexed { index, beer -> beer.display(index + 1) }

    println(" 0. 뒤로가기             | 뒤로가기")
    selectBeer = readLine()!!.toInt()

    if (selectBeer in 0..beers.size - 1) {
        println("${beers[selectBeer].name}이 선택되었습니다.")
    }
}

open class Beer(val name: String, val price: Double, val description: String) {
    open fun display(num: Int) {
        println("$num.$name | W $price | $description")
    }
}

class Ale(name: String, price: Double, description: String) : Beer(name, price, description) {
}

class Magpie(name: String, price: Double, description: String) : Beer(name, price, description) {
}

class Hand(name: String, price: Double, description: String) : Beer(name, price, description) {
}



