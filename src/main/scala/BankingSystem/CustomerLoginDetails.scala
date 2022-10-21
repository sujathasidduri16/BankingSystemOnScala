package BankingSystem

// In this class we can storing the deatails user name and password by using the ListBuffer
//and giving the mail account for user
import scala.collection.mutable.ListBuffer
class CustomerLoginDetails {

  // This class is used to maintain logged users details

  val username = new ListBuffer[String]()
  username += ("Sujatha1", "Suma1", "Dhruv1", "Sravan1", "Sravanthi1", "Prasad1")
  val password = new ListBuffer[String]()
  password += ("Sujatha123", "Suma123", "Dhruv123", "Sravan123", "Sravanthi123", "Prasad123")

  def main(args: Array[String]): Unit = {
    println(apply("Sujatha", "gmail.com"))
    println(unApply(apply("Sujatha", "gmail.com")))
    println(unApply("Sujatha Sidduri"))
  }

  def apply(user: String, domain: String): String = {
    user + "@" + domain
  }

  def unApply(str: String): Option[(String, String)] = {
    val parts = str.split("@")
    if (parts.length == 2) {
      Some(parts(0), parts(1))
    } else {
      None
    }
  }
}

