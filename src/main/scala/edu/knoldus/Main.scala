package edu.knoldus

import edu.knoldus.sets.{Intersection, Union}

object Main extends App {

  val xs = Set(1, 2, 3, 4, 5, 6)
  val ys = Set(2, 6, 7)

  val union = new Union()
  val intersection = new Intersection()

  println(union.getUnion(xs, ys))
  println(intersection.getIntersection(xs, ys))

}
