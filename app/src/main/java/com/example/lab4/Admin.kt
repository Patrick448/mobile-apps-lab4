package com.example.lab4

class Admin(
    override var name: String,
    override var email: String,
    override var password: String,
    override var purchaseList: MutableList<Purchase>
) : User() {


}