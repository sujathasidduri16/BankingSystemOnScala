import org.scalatest.freespec.AnyFreeSpec

import scala.collection.mutable.ListBuffer

class UerLoginPageTest extends AnyFreeSpec{
  "A ListBuffer" - {
    "When empty" - {
      " should have size 0" in {
        assert(ListBuffer.empty.size === 0)
      }
    }
  }
  "should produce NoSuchElementException when ead is invoked in"-{
    assertThrows[NoSuchElementException]{
      ListBuffer.empty.head
     }
    }
  }
