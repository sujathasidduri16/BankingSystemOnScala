package BankingSystem
import scala.io.StdIn.readInt

object Banking_System {
  def main(args: Array[String]): Unit=

  {

    // Object of all classes
    val obj0 =new UserLoginPage()
    val obj1 = new AccountDetails()
    val obj2 = new SavingsAccount()
    val obj3 = new CurrentAccout()
    val obj4 = new Bank()
val log_user= obj0.login()
    println(log_user)
    println("Enter 1 for account details, " +
      "2 for SavingsAccount, " +
      "3 for CurrentAccount and " +
      "4 for closing or opening account")

    val choice = readInt()
    if (choice == 1) {
      obj1.details()
    }

    if (choice == 2) {
      println("Enter 1 for checking the interest " +
        "amount and 2 if you want to see the " +
        "details of any particular account: ")
     println("0.Login user \n"+
       "\n1.account details\n"+
       "\n2.Saving Account \n"+
       "\n3.CurrentAccount \n"+
       "\n4.Closing or Oping Account \n"+
       "\n5.To see details of particular Customer")

       val choice1 = readInt()
      if (choice1 == 1) {
      obj2.interest_amount()
      }
      else if (choice == 2) {
        obj2.details()
      }
    }

    if (choice == 3) {
      /* var a = new mythread()
      a.start()
      var b = new mythread()
      b.start()
      if (Thread.currentThread().isDaemon) {
        println("credit")
      } else {
        println("debit")
      }

      */
      println("Enter 1 for credit and 2 for debit: ")
      val choice2 = readInt()
      /*
      if (choice2 == 1) {
        obj3.credit()
      }
      if (choice2 == 2) {
        obj3.debit()
      }*/
      val choice: Int = readInt()
      //Here used case, to call the different objects and methods
      choice match {

        case 0 => val log_index: Int = obj0.login()
          //val account = obj3.show_account_details()
          val account = obj1.get_account(log_index)
          println(account)
        case 1 => obj1.get_account(log_user) //calling account details
        case 2 => obj2.interest_amount() //calling interest method
        case 3 => obj1.credit() //calling credit method to credit amount
        case 4 => obj2.debit() //calling debit method to debit amount
        case 5 => obj4.opening() //calling opening method to open an account
        case 6 => obj4.closing() // calling closing method to close the account
        case 7 => obj3.details() //to print the details of particular user
        case _ => "other"
       if(choice2==1){
         obj2.credit()

       }
        if(choice2==1){
          obj2.debit()
        }

      }

      if (choice == 4) {
        println("Enter 1 for opening account " +
          "and 2 for closing an account: ")

        val choice3 = readInt()
        if (choice3 == 1) {
          obj4.opening()
        }
        else {
          obj4.closing()
        }
      }
    }
  }
}


