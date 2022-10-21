package BankingSystem
import scalikejdbc._
import scalikejdbc.{AutoSession, ConnectionPool}
import java.sql.{Connection,DriverManager,Statement,ResultSet,SQLException}

object ConnectJDBC extends App{
      // jdbc driver name and database URL
  Class.forName("com.mysql.jdbc.Driver")

  ConnectionPool.singleton(DB_URL, "root", "Scala123")
    val JDBC_DRIVER = "com.mysql.jdbc.Driver"
    val DB_URL      = "jdbc:mysql://localhost:3306/BankingSystem"

    // database credentials
    val USER = "root"
    val PASS = "Scala123"
   // ad-hoc session provider on the REPL
implicit val session = AutoSession

  // table creation, you can run DDL by using #execute as same as JDBC
  sql"""
create table users (
  id serial not null primary key,
  fristname varchar(45),
  lastname varchar(45),
  age int not null,
  created_at timestamp not null
)
""".execute.apply()
  // insert initial data
  Seq("Sujatha", "Suma", "Sravan") foreach { firstname =>
    sql"insert into members (fristname, created_at) values (${firstname}, current_timestamp)".update.apply()
  }
    Seq("Sidduri","Airneni","Kalluri") foreach { lastname =>
      sql"insert into members (lastname, created_at) values (${lastname}, current_timestamp)".update.apply()
    }

  val sql =  "SELECT * FROM USERS"

    var conn: Connection = null
    var stmt: Statement = null

    try {
      Class.forName(JDBC_DRIVER)
      conn = DriverManager.getConnection(DB_URL, USER, PASS)

      stmt = conn.createStatement
      val rs: ResultSet = stmt.executeQuery(sql)
      while (rs.next) {
        val id = rs.getInt("id")
        val firstname = rs.getString("firstname")
        val lastname = rs.getString("lastname")
        val age = rs.getInt("age")
        println(s"$id, $firstname, $lastname, $age")
      }

      // cleanup
      stmt.close
      conn.close
    } catch {
      case se: SQLException => se.printStackTrace
      case e:  Exception => e.printStackTrace
    } finally {
      try {
        if (stmt!=null) stmt.close
      } catch {
        case se2: SQLException => // nothing we can do
      }
      try {
        if (conn!=null) conn.close
      } catch {
        case se: SQLException => se.printStackTrace
      } //end finally-try
    } //end try

    println("the end")


}
