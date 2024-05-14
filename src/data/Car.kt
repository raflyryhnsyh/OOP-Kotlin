package data

class Car(paramBrand: String, paramName: String, paramYear: Int) {

    // initializer block
    init {
        println("Car $paramBrand dibuat")
    }

    // secondary constructor 1
    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2020) {
        println("Secondary Constructor 1")
    }

    // secondary constructor 2
    constructor(paramBrand: String) : this(paramBrand, "") {
        println("Secondary Constructor 2")
    }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear
}