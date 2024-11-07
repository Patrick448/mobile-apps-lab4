package com.example.lab4

abstract class User:Buyer {
    abstract var name: String
    abstract var email: String
    abstract var password: String
    open var purchaseList: MutableList<Purchase> = mutableListOf<Purchase>()

    override fun buyProduct(product: Product): Purchase {
        val purchase = Purchase(product, 1, "2021-09-01", this, 1)
        purchaseList.add(purchase)
        return purchase
    }

    override fun returnProduct(purchase: Purchase, int: Int): Boolean {
        purchaseList.remove(purchase)
        return true
    }

}