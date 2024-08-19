object Interest_Calculator extends App {
  val calculateInterest = (deposit: Double) => deposit match {
    case x if x <= 20000 => x * 0.02
    case x if x <= 200000 => x * 0.04
    case x if x <= 2000000 => x * 0.035
    case x if x > 2000000 => x * 0.065
  }

  var validDeposit = false
  var deposit: Double = 0.0

  while (!validDeposit) {
    println("Enter a deposit amount:")
    try {
      deposit = scala.io.StdIn.readDouble()
       if (deposit < 0) {
        println("Invalid input. Please enter a positive number.")
      } else {
        validDeposit = true
      }
    } catch {
      case _: NumberFormatException =>
        println("Invalid input. Please enter a valid number.")
    }
  }

  val interest = calculateInterest(deposit)
  println(s"Interest for deposit $deposit is $interest")
}
