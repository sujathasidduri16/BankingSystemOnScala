package BankingSystem
import scala.collection.mutable.ListBuffer
import scala.io.StdIn.{readInt}
  class AccountDetails {


    // Creating four ListBuffer which stores
  // the initial details of customer
  var name = new ListBuffer[String]()
  name += ("Sujatha", "Suma", "Dhruv","Sravan","Sravanthi","Prasad")
  var balance_current = new ListBuffer[Double]()
  balance_current += (20000, 30000, 40000,50000,60000,70000)
  var account_number = new ListBuffer[Int]()
  account_number += (1234, 5678, 9101,4567,3427,8769)
  var phone_number = new ListBuffer[Long]()
  phone_number += (9998273493L, 5569392838L, 6651299039L,965748674L,8946373845L,6587363635l)
  var sort_code= 223344
    //This method is used return the details of particular user
    def get_account(index:Int):Any={

      return println("Account Number :"-> account_number(index),
        "Name:" -> name(index),
        "Balance Current :" -> balance_current(index),
        "Phone Number:" ->phone_number(index),
        "sort_code:" -> sort_code)
    }
    // details() method is used to show
    // the details of all customer
      def details(): Unit = {
    println("Details of customer is\nNames of customer: " + name +
      "\nBalance list" + "is respectively: " + balance_current +
      "\nAccount number is respectively: " + account_number +
      "\nPhone number" + "is respectively: " + phone_number+
    "\nsort_code:"+sort_code)
  }

  // Used to add money to a particular account
  def credit(): Unit = {
    var credit_amount: Int = 0
    println("Enter the account number you want to credit in: ")

    // readInt is used to take integer
    // value as input from user
    val acc_num1 = readInt()

    // indexOf() method returns the index
    // of particular element
    val index1 = account_number.indexOf(acc_num1)
    println("Enter the amount you want to credit: ")
    credit_amount = readInt()
    balance_current(index1) += credit_amount
    println("Amount added successfully\nNew Balance is: " +
      balance_current(index1))
  }

  // Used to withdraw money from an account
  def debit(): Unit = {
    var debit_amount: Int = 0
    println("Enter the account number " +
      "you want to withdraw from: ")
    val acc_num2 = readInt()
    val index2 = account_number.indexOf(acc_num2)
    println("Enter the amount you want to withdraw: ")

    debit_amount = readInt()
    balance_current(index2) -= debit_amount
    println("Money withdrawn successfully\n" +
      "Remaining balance is: " +
      balance_current(index2))
  }

}
object AccountDetailsMain extends App{
 // var d1=new AccountDetails
 // d1.get_account()
  var d2=new AccountDetails
  d2.details()
  var c=new AccountDetails
  c.credit()
  var d3=new AccountDetails
  d3.details()
}
