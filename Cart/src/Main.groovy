static void main(String[] args) {

    // Add at least 3 items to the itemPrices map.
    // The keys should be strings, and the values should be floating-point numbers.

    def itemPrices = [
            "ring" : 25.00,
            "necklace" : 40.00,
            "bracelet" : 20.00
    ]

    // Add at least 3 items to the shoppingCart list.
    // Each item should be a map with two key-value pairs:

    def shoppingCart = [
            ["itemName" : "ring", "itemQuantity" : 4],
            ["itemName": "necklace", "itemQuantity" : 3],
            ["itemName" : "bracelet", "itemQuantity" : 6]
    ]

    // Fill in this code block to calculate the total price of an item
    // based on its name and quantity, using the itemPrices map
    def calculatePrice = { itemName, itemQuantity ->
        def price = itemPrices[itemName]
        return price * itemQuantity
    }

    // Fill in the each loop to iterate through the shoppingCart list
    // and call the calculatePrice closure for each item. Add each
    // item's total price to a running total to calculate the total
    // price of the cart.

    def totalPrice = 0.0

   shoppingCart.each { item ->
       def itemName = item.itemName
       def itemQuantity = item.itemQuantity
       def itemTotalPrice = calculatePrice(itemName, itemQuantity)
       totalPrice += itemTotalPrice
   }

    println("The total price of the shopping cart is: $totalPrice")

}

