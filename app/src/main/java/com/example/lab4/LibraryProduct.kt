package com.example.lab4

class LibraryProduct(
    override var name: String,
    override var price: Double,
    override var description: String,
    override var status: ProductStatus,
    var author: String,
    var pages: Int,
    override var id: String,
    override var amount: Int

): Product()
{
    constructor(name: String, price: Double, description: String, author: String, pages: Int, amount: Int, id: String) : this(name, price, description, ProductStatus.AVAILABLE, author, pages, id, amount)
}