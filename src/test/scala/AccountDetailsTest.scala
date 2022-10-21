package scala
import scala.collection.immutable.List._
import org.scalatest.funsuite.AnyFunSuite

import java.util._
import BankingSystem.{AccountDetails}

class AccountDetailsTest extends AnyFunSuite {
  var testObj = new AccountDetails()

  test("Account Number Test") {
    assert(testObj.account_number !== 7689)
  }


  test("Account holder name ") {
    assert(testObj.name !== "Dhruv")
  }

  test("Bank Balance") {
    assert(testObj.balance_current !== 10000)

  }
  test("Check Phone Number") {
    assert(testObj.balance_current !== 9998273493L)
  }
  test("Check SortCode") {
    assert(testObj.sort_code === 223344)
  }
}