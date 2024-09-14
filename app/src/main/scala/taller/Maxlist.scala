package taller

import scala.annotation.tailrec

class Maxlist
{
  def maxLin(l: List[Int]): Int =
  {
    if (l.isEmpty) throw new IllegalArgumentException("Lista vacia")
    else if (l.tail.isEmpty) l.head
    else
    {
      math.max(l.head, maxLin(l.tail))
    }
  }


  def maxIt(l: List[Int]): Int =
  {
    if (l.isEmpty) throw new IllegalArgumentException("Lista vacia") //NO puedo poner un none por que es una lista y no un entero
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