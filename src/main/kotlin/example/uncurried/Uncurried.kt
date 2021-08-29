package example.uncurried

import arrow.syntax.function.curried
import arrow.syntax.function.pipe

val uncurried = { f:(Int) -> Boolean, list: List<Int> -> list.filter{ f(it)} }

val filter2 = uncurried.curried()

val takeEvenCurried = filter2 { it % 2 == 0 }
val takeGreaterThanThreeCurried = filter2 { it > 3 }

//val takEvensGreaterThanThreeCurried = { it pipe takeEvenCurried pipe takeGreaterThanThreeCurried }
//


