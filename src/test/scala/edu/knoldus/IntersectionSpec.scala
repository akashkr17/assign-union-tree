package edu.knoldus
import edu.knoldus.sets.Intersection
import org.scalatest.funsuite.AnyFunSuite
class IntersectionSpec extends AnyFunSuite  {

  val intersection = new Intersection()
  val xs = Set(1,2,3,4,5,6)
  val ys  = Set(2,6,7)
  test("Function should find intersection of given sets") {
    assert(intersection.getIntersection(xs,ys) == (xs & ys) )
  }

}
