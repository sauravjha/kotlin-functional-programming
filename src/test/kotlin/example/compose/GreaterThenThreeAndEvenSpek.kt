package example.compose

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import example.compose.greaterThanThreeAndEven
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

class GreaterThenThreeAndEvenSpek: Spek({

    describe("GreaterThenThreeAndEven") {
        context("greaterThanThreeAndEven") {
            val input = listOf(
                3, 4, 5, 6, 7, 9, 12
            )

            val expectedOutput = listOf(
                4, 6, 12
            )

            it("returns expected list") {
                assertThat(greaterThanThreeAndEven(input), equalTo(expectedOutput))
            }
        }
    }

})