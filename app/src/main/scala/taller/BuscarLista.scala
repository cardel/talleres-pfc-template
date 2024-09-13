package taller

class BuscarLista() {
  def buscarElemento(lista: List[Int], elemento: Int): Boolean = {
  lista match {
    case Nil => false
    case x :: xs => if (x == elemento) true else buscarElemento(xs, elemento)
   }
  }

  def minLin(l: List[Int]): Int = {
    0
  }

  def maxLin(l: List[Int]): Int = {
    require(!l.isEmpty, "La lista no puede estar vacia")
    require(l.forall(_ >= 0), "La lista no puede contener números negativos")
    @tailrec
    def maxLi_nAux ( lista: List[Int] , max: Int ): Int = {

      if(lista.isEmpty) max
      else if (lista.head > max) maxLi_nAux(lista.tail, lista.head)
      else maxLi_nAux(lista.tail, max)
      
    }
    maxLi_nAux(l.tail, l.head)
  }
}
