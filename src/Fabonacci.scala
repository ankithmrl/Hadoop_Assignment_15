import scala.annotation.tailrec;

object Fabonacci {
  val fibs:Stream[Int] = 0 #:: 1 #:: (fibs zip fibs.tail).map{ t => t._1 + t._2 }

  def main(args: Array[String]) {
    val n: Int = 9    
    println(fibs(n))
   }
}