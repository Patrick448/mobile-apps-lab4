package com.example.lab4


    fun main(){
        var store = Store()
        val product1 = ClothingProduct("Shirt", 100.0, "Blue", "M", 10, "0")
        val product2 = ClothingProduct("Pants", 200.0, "Black", "L", 5, "1")
        val product3 = ClothingProduct("Shoes", 150.0, "White", "42", 0, "2")
        val product4 = LibraryProduct("Book", 50.0, "Interesting", "Author", 100, 10, "3")
        val product5 = LibraryProduct("Magazine", 20.0, "Interesting", "Author", 50, 5, "4")
        val product6 = FoodProduct("Apple", 5.0, "Red", 0.5, 10, "5")
        val product7 = FoodProduct("Banana", 3.0, "Yellow", 0.3, 0, "6")

        store.addProduct(product1)
        store.addProduct(product2)
        store.addProduct(product3)
        store.addProduct(product4)
        store.addProduct(product5)
        store.addProduct(product6)
        store.addProduct(product7)

        val customer1 = Customer("John", "xx", "123")
        val customer2 = Customer("Alice", "yy", "456")
        val customer3 = Customer("Bob", "zz", "789")

        store.addUser(customer1)
        store.addUser(customer2)
        store.addUser(customer3)


        printProductList(store)
        printUserPurchaseList(customer1)

        val purchase1 = store.buyProduct(customer1, product1, 2)!!

        printProductList(store)
        printUserPurchaseList(customer1)

        store.returnProduct(purchase1, 1)

        printProductList(store)
        printUserPurchaseList(customer1)
}

fun printUserPurchaseList(user: User){
    print("\n\nPurchases of ${user.name}: \n")
    for(purchase in user.purchaseList){
        print("${purchase.product.name} - ${purchase.amount} units\n")
    }
}

fun printProductList(store: Store){
    print("\n\nProducts in the store: \n")
    for(product in store.productList){
        print("${product.name} - ${product.amount} units\n")
    }
}