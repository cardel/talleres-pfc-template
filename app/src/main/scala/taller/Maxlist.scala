package taller

import scala.annotation.tailrec

class Maxlist
{
  def maxIt(l: List[Int]): Int =
  {
    if (l.isEmpty) throw new IllegalArgumentException("Lista Vacia")
    else
    {
      @tailrec
      def maxItAux(l: List[Int], max: Int): Int =
      {
        l match {
          case Nil => max
          case head::tail => maxItAux(tail, math.max(head, max))
        }
      }
      maxItAux(l.tail, l.head)

    }

  }
}
