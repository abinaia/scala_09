import scala.io.StdIn
@main def main(): Unit = {
  var validInput = false
  var integer: Int = 0

  while (!validInput) {
    print("Enter an integer: ")
    try {
      integer = StdIn.readInt()
      validInput = true
    } catch {
      case _: NumberFormatException =>
        println("Invalid input. Please enter a valid integer.")
    }
  }

  integer match {
    case n if n <= 0 => println("Negative/Zero input")
    case n if n % 2 == 0 => println("Even number is given")
    case _ => println("Odd number is given")
  }
}
