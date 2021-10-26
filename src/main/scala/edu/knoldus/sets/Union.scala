package edu.knoldus.sets

class Union {
  def getUnion(a: Set[Int], b: Set[Int]): Set[Int] = {
    a.toList.sorted.flatMap {
      case a => Some(a) ++ b
      case _ => None
    }.toSet
  }
}
