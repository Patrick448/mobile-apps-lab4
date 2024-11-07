package com.example.lab4

class ClothingProduct(
    override var name: String,
    override var price: Double,
    override var description: String,
    override var status: ProductStatus,
    var size: String,
    override var amount: Int,
    override var id: String

): Product()
{

    constructor(name: String, price: Double, description: String,size: String, amount: Int, id: String) : this(name, price, description, ProductStatus.AVAILABLE, size, amount, id)

}