package com.example.mykiosk

import java.time.temporal.ChronoUnit


fun displayBeerMenu() {
    var selectBeer = 0

    println("[ Beer MENU ]")
    var ale = Ale().display()
    var magpie = Magpie().display()
    var hand = Hand().display()
    println(" 0. 뒤로가기             | 뒤로가기")
    selectBeer = readLine()!!.toInt()

    when (selectBeer) {
        1 -> println("${Ale().name}가 선택되었습니다. ")
        2 -> println("${Magpie().name}가 선택되었습니다. ")
        3 -> println("${Hand().name}가 선택되었습니다. ")
        0 -> {
            main()
        }
    }
}

open class Beer() {
    open fun display() {
        println("")
    }
}

class Ale() : Beer() {
    val name = "ShackMeister Ale"
    val price = 9.8
    override fun display() {
        println(" 1. ${name}   | W ${price} | 쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일맥주")
    }
}

class Magpie() : Beer() {
    val name = "Magpie Brewing Co."
    val price = 6.8
    override fun display() {
        println(" 2. ${name} | W ${price} | Pale Ale Draft, Porter Draft, Wheat Draft")
    }
}

class Hand() : Beer() {
    val name = "The Hand and Malt"
    val price = 6.8
    override fun display() {
        println(" 3. ${name}  | W ${price} | IPA Can, Mocha Stout Can")
    }
}



