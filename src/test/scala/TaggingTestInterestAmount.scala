import org.scalatest.Tag
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.tagobjects.Slow
object Super extends Tag("scala.BankingSystem.SavingAccount.Super")
class TaggingTestInterestAmount extends AnyFlatSpec {
  "The Scala language" must "add correctly syntax" taggedAs (Slow) in {
    val interestAmount = (20000*2)/100
    assert(interestAmount===400)
  }
}
