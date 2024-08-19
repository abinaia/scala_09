object Interest_Calculator extends App {
  val calculateInterest = (deposit: Double) => deposit match {
    case x if x <= 20000 => x * 0.02
    case x if x <= 200000 => x * 0.04
    case x if x <= 2000000 => x * 0.035
    case x if x > 2000000 => x * 0.065
  }

  println("Enter a deposit amount:")
  val deposit = scala.io.StdIn.readDouble()
  val interest = calculateInterest(deposit)
  println(s"Interest for deposit $deposit is $interest")
}
