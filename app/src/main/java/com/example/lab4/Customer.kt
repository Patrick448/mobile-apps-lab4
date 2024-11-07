package com.example.lab4

class Customer(
    override var name: String,
    override var email: String,
    override var password: String,

) : User(

) {

    override var purchaseList: MutableList<Purchase> = mutableListOf<Purchase>()

}