object SquareRoot {
  
  def squareRoot(n: BigDecimal): Stream[BigDecimal] =
  {
    def squareRoot(guess: BigDecimal, n: BigDecimal): Stream[BigDecimal] = {
      Stream.cons(guess, squareRoot(0.5 * (guess + n / guess), n))
    }
  squareRoot(1, n)
  }
  
  
  def main(args: Array[String]) {
  val n: Int = 36    
  println(squareRoot(n))
  
  val iterations = 10
  println(squareRoot(n)(iterations - 1))
  
  println(squareRoot(n).take(iterations).toList)
  
 }
}