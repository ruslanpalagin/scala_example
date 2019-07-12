import app.Calculator

object Main {
  def main(args: Array[String]): Unit = {
    val calculator = new Calculator()
    val result = calculator.add(1, 2)
    println("Hello, Scala developer3")
    println(result)
  }
}