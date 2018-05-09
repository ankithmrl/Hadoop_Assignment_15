object Assignment2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	def gcd(a: Int,b: Int): Int = { if(b ==0) a else gcd(b, a%b) }
                                                  //> gcd: (a: Int, b: Int)Int
	val gcdIs = gcd(56, 126)                  //> gcdIs  : Int = 14
	
	
	
	def fibFrom(a: Int, b: Int): Stream[Int] = a #:: fibFrom(b, a + b)
                                                  //> fibFrom: (a: Int, b: Int)Stream[Int]
	val fibs = fibFrom(1, 1).take(10)         //> fibs  : scala.collection.immutable.Stream[Int] = Stream(1, ?)
	val finalSeries = fibs.toList             //> finalSeries  : List[Int] = List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
	println(finalSeries)                      //> List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
}