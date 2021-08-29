package example.compose

import arrow.syntax.function.compose
import arrow.syntax.function.partially1

val filter: ((Int) -> Boolean, List<Int>) -> List<Int> = {f, list -> list.filter { f(it) } }
val takeEven = filter.partially1 { it % 2 == 0 }
val takeGreaterThanThree = filter.partially1 { it > 3 }

val takeEvensGreaterThenThree = takeGreaterThanThree compose takeEven
