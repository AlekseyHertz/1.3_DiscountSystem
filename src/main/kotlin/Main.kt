fun main () {
    val countPurchase = 200 // количество позиций по чеку
    val price = 100 //цена единицы
    var purchase = countPurchase * price

    val discount = when {
        (purchase > 10_001) -> (purchase) * 5 / 100
        (purchase > 1_001) -> 100
        else -> 0
    }
    var total = (countPurchase * price) - discount

    println ("Total price $total")
}