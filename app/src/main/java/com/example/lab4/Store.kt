package com.example.lab4

class Store {
    var userList = mutableListOf<User>()
    var productList = mutableListOf<Product>()

    fun addUser(user: User){
        userList.add(user)
    }

    fun removeUser(user: User){
        userList.remove(user)
    }

    fun addProduct(product: Product){
        productList.add(product)
    }

    fun removeProduct(product: Product){
        productList.remove(product)
    }

    fun findProductById(id: String): Product? {
        for(product in productList){
            if(product.id == id){
                return product
            }
        }
        return null
    }

    fun returnProduct(purchase: Purchase, amount:Int): Boolean {
        if (amount <= 0){
            throw IllegalArgumentException("Amount must be greater than 0")
        }

        val product = purchase.product
        val user = purchase.user
        val foundProduct = findProductById(product.id)
        var success = false

        if(foundProduct == null){
            println("Product ${product.name} is not in the list")

        }else{
            val prevAmount = product.amount

            try{
                foundProduct.changeAmount(amount)
                user.returnProduct(purchase, amount)
                println("$amount units of Product: ${product.name} were returned by ${user.name}")
                success = true

            }catch(e: Exception){
                foundProduct.amount = prevAmount
                println("Cannot return product ${product.name}")
            }finally {

            }


        }

        return success
    }

    fun buyProduct(user: User, product: Product, amount:Int): Purchase? {
        if (amount <= 0){
            throw IllegalArgumentException("Amount must be greater than 0")
        }

        val foundProduct = findProductById(product.id)
        var purchase : Purchase? = null

        if(foundProduct == null || foundProduct.status == ProductStatus.OUT_OF_STOCK){
            println("Product ${product.name} is not available")

        }else{
            try{
                findProductById(product.id)?.changeAmount(-amount)
                purchase = user.buyProduct(product)
                println("$amount units of Product: ${product.name} were bought by ${user.name}")


            }catch(e: Exception){
                println("Product ${product.name} does not have enough units available to fulfill the order")
            }
        }

        return purchase

    }

}