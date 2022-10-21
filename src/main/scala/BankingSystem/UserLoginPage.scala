package BankingSystem

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt

  //This is the login page where customer can login to the account using username and password.
  //The logged users details are in user class and loginpage extends from user class
  class UserLoginPage extends CustomerLoginDetails {
    def login(): Int = {
      println("Enter the username")
      val entered_username: Any = scala.io.StdIn.readLine()
      val index_username = username.indexOf(entered_username)
      if (index_username == -1) { //checking the index value is -1 then it is invalid user
        println("Invalid Username")
        return index_username
      } else {
        println("Enter the Password") // enter password and compare it with password already saved in Customer
        val entered_password: Any = scala.io.StdIn.readLine()
        val value_password = password(index_username)

        if (value_password.equals(entered_password)) {

          return index_username
        } else {
          println("Invalid Password")
          return -1
        }
      }
    }

}
object UserLoginPageMain extends App{
  var u=new UserLoginPage
  u.login()
}

