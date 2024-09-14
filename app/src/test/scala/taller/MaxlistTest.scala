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
}