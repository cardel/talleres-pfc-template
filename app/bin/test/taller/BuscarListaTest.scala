package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BuscarListaTest extends AnyFunSuite {
  val objBuscarLista = new BuscarLista()

  test("Encontrar 3 en List(1, 2, 3, 4, 5)") {
    assert(objBuscarLista.buscarElemento(List(1, 2, 3, 4, 5), 3))
  }

  test("No encontrar 6 en List(1, 2, 3, 4, 5)") {
    assert(!objBuscarLista.buscarElemento(List(1, 2, 3, 4, 5), 6))
  }

  test("No encontrar 3 en List()") {
    assert(!objBuscarLista.buscarElemento(List(), 3))
  }

  test("Encontrar 3 en List(3)") {
    assert(objBuscarLista.buscarElemento(List(3), 3))
  }

  test ("Encontrar 100 en List(100, 200, 300, 400, 500)") {
    assert(objBuscarLista.buscarElemento(List(100, 200, 300, 400, 500), 100))
  }
}
