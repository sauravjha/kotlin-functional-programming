package example.compose

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import example.compose.takeEven
import example.compose.takeEvensGreaterThenThree
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object ComposeSpek: Spek({
    describe("Compose") {
        context("takeEvensGreaterThenThree") {
            it("return the expected value") {
                val input = listOf(3, 4, 5, 6, 7, 9, 12)
                val expectedOutput = listOf(4, 6, 12)
                assertThat( takeEvensGreaterThenThree(input), equalTo(expectedOutput))
            }
        }

        context("takeEvens") {
            it("return the expected value") {
                val input = listOf(3, 4, 5, 6, 7, 9, 12)
                val expectedOutput = listOf(4, 6, 12)
                assertThat( takeEven(input), equalTo(expectedOutput))
            }
        }
    }
})