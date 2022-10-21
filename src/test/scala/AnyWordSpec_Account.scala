import org.scalatest.wordspec.AnyWordSpec

import scala.collection.mutable.ListBuffer
import BankingSystem.{AccountDetails}
class AnyWordSpec_Account extends AnyWordSpec {
 def buffer=new AccountDetails
 "Testing"should{
   "be easy"in{
      assert(buffer.name.isEmpty)
     buffer.name += "Chitti"
    }
"be fun"in{
  assert(buffer.name.isEmpty)
}
  }
}
