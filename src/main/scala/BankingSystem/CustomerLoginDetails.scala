package BankingSystem
import scalikejdbc._

import scala.collection.mutable.ListBuffer
class CustomerLoginDetails { // This class is used to maintain logged users details

    val username = new ListBuffer[String]()
  username += ("Sujatha1", "Suma1", "Dhruv1","Sravan1","Sravanthi1","Prasad1")
  val password = new ListBuffer[String]()
  password += ("Sujatha123", "Suma123", "Dhruv123", "Sravan123", "Sravanthi123", "Prasad123")

}


