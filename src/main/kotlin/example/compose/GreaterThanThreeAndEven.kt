package example.compose

fun greaterThanThreeAndEven(list: List<Int>): List<Int> {
    return list.filter { it > 3  && it % 2 == 0 }
}

/*
    val greaterThanThree = { x: Int -> x > 3 }
    val even = { x:Int -> x % 2 == 0 }
    val greaterThanThreeAndEvenUsingCompose = greaterThanThree compose even
*/

