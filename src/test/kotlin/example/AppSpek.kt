package example

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertNotNull

class AppSpek : Spek({
    describe("App") {
        context("has greeting") {
            it("returns greeting") {
                val classUnderTest = App()
                assertNotNull(classUnderTest.greeting, "app should have a greeting")
            }
        }
    }

})