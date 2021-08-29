package example.arrow.option

import arrow.core.*
import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object OptionSpek: Spek({
    describe("Somestring") {

        context("input length is one") {
            val someString = getSomeString("")
            it("returns none") {
                assertThat(someString, equalTo(Option.empty()))
            }
        }
        context("input length is greater then one") {
            val someString = getSomeString("iammorethenone")
            it("returns none") {
                assertThat(someString, equalTo(Option.just("Success")))
            }
        }

        context("use") {
            getSomeString("sre").fold({ println("I am a length one")}, { println("I am more then lenght one")})
        }
    }
})