package edu.knoldus

import edu.knoldus.sets.Union
import org.scalatest.funsuite.AnyFunSuite

class UnionSpec extends AnyFunSuite {
  val union = new Union()

  val xs = Set(1,2,3,4,5,6)
  val ys  = Set(2,6,7)


  test("Function should find union of given sets") {
    assert(union.getUnion(xs,ys) == (xs | ys) )
  }

}
