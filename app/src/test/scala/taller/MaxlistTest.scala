package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MaxlistTest extends AnyFunSuite {
  val obj = new Maxlist()

  test("MaxIt test 1 - Lista con varios elementos") {
    assert(obj.maxIt(List(1, 4, 21, 16, 33, 2, 6, 13, 9)) == 33)
  }

  test("MaxIt test 2 - lista vacia")
  {
    intercept[IllegalArgumentException]
      {
        obj.maxIt(List())
      }
  }

  test("MaxIt test 3 - Lista con varios elementos 2")
  {
    assert(obj.maxIt(List(28, 11, 9, 5, 20, 15, 21, 12, 0, 1)) == 28)
  }

  test("MaxLin test 1 - Lista con varios elementos") {
    assert(obj.maxLin(List(1, 4, 21, 16, 33, 2, 6, 13, 9)) == 33)
  }

  test("MaxLin test 2 - Lista con varios elementos 2")
  {
    assert(obj.maxLin(List(28, 11, 9, 5, 20, 15, 21, 12, 0, 1)) == 28)
  }

}
