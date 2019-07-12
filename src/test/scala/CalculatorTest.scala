import app.Calculator
import org.scalatest.FunSpec

class CalculatorTest extends FunSpec {
  describe("Calculator") {
    describe("add method") {
      it("should return Int") {
        val calculator = new Calculator()
        val sum = calculator.add(0, 0)
        assert(sum.isInstanceOf[Int])
      }
      it("should receive Int") {
        val calculator = new Calculator()
        assertTypeError("val sum = calculator.add(0.5, 0)")
      }
      it("should receive any number of args") {
        val calculator = new Calculator()
        val sum = calculator.add(1, 2, 3, 4)
        assert(sum.isInstanceOf[Int])
      }
    }
  }
}