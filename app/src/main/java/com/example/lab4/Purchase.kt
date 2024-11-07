package com.example.lab4

data class Purchase (

    var product: Product,
    var quantity: Int,
    var date : String,
    var user: User,
    var amount: Int
)