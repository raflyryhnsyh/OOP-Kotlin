package data

class Address {

    // harus ada default value, jika langsung secondary constructor
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    // secondary constructor 1
    constructor(paramStreet: String, paramCity: String) {
        street = paramStreet
        city = paramCity
    }

    // secondary constructor 2
    constructor(paramStreet: String, paramCity: String, paramCountry: String)
            : this(paramStreet, paramCity) {
        country = paramCountry
    }
}