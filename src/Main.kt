fun main() {
    print("Enter customer name: ")
    val customerName = readln()

    print("Enter customer mobile: ")
    val customerMobile = readln()

    val products = ArrayList<Array<String>>()

    while (true) {
        print("Enter product name:  ")
        val productName = readln()
        if (productName.equals("")) {
            break;
        }
        print("Enter price for $productName: ")
        val price = readln().toInt()

        print("Enter quantity for $productName: ")
        val quantity = readln().toInt()

        products.add(arrayOf(productName, price.toString(), quantity.toString()))
    }
    var totalAmount = 0.0
    println("\nCart Details (Sorted by Price in Descending Order):")
    for (product in products) {
        val productName = product[0]
        val price = product[1].toDouble()
        val quantity = product[2].toInt()
        val totalPrice = price * quantity
        totalAmount += totalPrice
    }

    var discount = 0.0
    when {
        totalAmount >= 5000 -> discount = 30.0
        totalAmount >= 2000 -> discount = 20.0
        totalAmount >= 1000 -> discount = 10.0
        totalAmount >= 500 -> discount = 2.0
    }
}