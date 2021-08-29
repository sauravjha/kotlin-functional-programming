package example.arrow.option

import arrow.core.Option

fun getSomeString(someString: String): Option<String> {
    return when(someString.length> 1) {
        true -> Option.just("Success")
        else -> Option.empty()
    }
}