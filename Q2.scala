import scala.io.StdIn

@main def main(): Unit = {
    print("Enter an integer: ")
    var integer: Int = StdIn.readInt()
    integer match {
      case n if n <= 0 => println("Negative/Zero input")
      case n if n % 2 == 0 => println("Even number is given")
      case _ => println("Odd number is given")
    }
}