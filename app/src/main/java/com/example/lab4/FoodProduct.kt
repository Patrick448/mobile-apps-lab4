package com.example.lab4

import com.example.lab4.ClothingProduct

class FoodProduct(
    override var name: String,
    override var price: Double,
    override var description: String,
    override var status: ProductStatus,
    var weight: Double,
    override var id: String,
    override var amount: Int

): Product()
{
    constructor(name: String, price: Double, description: String, weight: Double, amount: Int, id: String) : this(name, price, description, ProductStatus.AVAILABLE, weight, id, amount)
}