package edu.knoldus.sets

class Intersection {
  def getIntersection(a: Set[Int], b: Set[Int]): Set[Int] = {
    a.toList.sorted.flatMap {
      case a if (b.contains(a)) => Some(a)
      case _                    => None
    }.toSet
  }
}
