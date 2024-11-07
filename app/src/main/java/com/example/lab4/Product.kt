package com.example.lab4

abstract class Product {
    abstract var id: String
    abstract var name: String
    abstract var price: Double
    abstract var description: String
    abstract var status: ProductStatus
    open var amount: Int = 0
       
        set(value) {
            field = value
            updateStatus()
        }

    init{
        if (amount < 0) {
            throw IllegalArgumentException("Amount cannot be negative")
        }else{
            updateStatus()
        }

    }
    


    fun changeAmount(amount: Int) {
        val newAmount = this.amount + amount

        if (newAmount < 0) {
            throw IllegalArgumentException("Not enough products for purchase")
        } else {
            this.amount = newAmount
            updateStatus()
        }

    }

    fun updateStatus() {
        if (this.amount == 0) {
            this.status = ProductStatus.OUT_OF_STOCK
        } else {
            this.status = ProductStatus.AVAILABLE
        }
    }
}