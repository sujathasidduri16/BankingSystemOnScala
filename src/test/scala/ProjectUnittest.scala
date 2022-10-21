import org.scalatest.funsuite.AnyFunSuite
import BankingSystem.{AccountDetails,Bank,CurrentAccout,SavingsAccount}

class ProjectUnittest extends AnyFunSuite {
  var testCustomer = new AccountDetails
  test("testing Customer Details") {

      testCustomer.details()
      assert(testCustomer.details() === testCustomer.details())
    }
  var rateofInterest =new SavingsAccount
  test("Check the Customer rate of interest"){
    assert(rateofInterest.interest_amount===400)

  }

}

