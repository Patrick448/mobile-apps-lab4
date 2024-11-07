package com.example.lab4

interface Buyer {

    fun buyProduct(product: Product): Purchase
    fun returnProduct(purchase: Purchase, amount: Int): Boolean
}