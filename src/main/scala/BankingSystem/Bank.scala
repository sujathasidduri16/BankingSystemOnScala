package BankingSystem
import scala.io.StdIn.{readInt,readLine}

class Bank extends AccountDetails {
  // Method to open an account
  def opening(): Unit = {

    // readLine() method is used to
    // take a string as input from user
    var new_name = readLine("Enter the name: ")
    name += new_name
    println("Enter the opening balance: ")
    var opening_balance = readInt()
    balance_current += opening_balance
    account_number += 1908
    println("Account added successfully")
  }

  // Method used to close an existing account
  def closing(): Unit = {
    println("Enter the account number: ")
    val acc_num6 = readInt()
    val index6 = account_number.indexOf(acc_num6)
    name -= name(index6)
    balance_current -= balance_current(index6)
    account_number -= account_number(index6)
    println("Account removed successfully")
  }

}
object BankMain extends App{
  var b1= new Bank
  b1.opening()
  var b2= new Bank
  b2.closing()

}

