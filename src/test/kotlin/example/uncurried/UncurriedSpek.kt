package example.uncurried

import arrow.syntax.function.pipe
import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object UncurriedSpek : Spek({
    describe("Uncurried") {
        context("") {
            val input = listOf(3, 4, 5, 6, 7, 9, 12)
            val expectedOutput = listOf(4, 6, 12)
            it("returns") {
                val output = run { input pipe takeEvenCurried pipe takeGreaterThanThreeCurried }
               assertThat(output, equalTo(expectedOutput))
            }
        }
    }
})