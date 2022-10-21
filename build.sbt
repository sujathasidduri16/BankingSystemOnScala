ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "BankingProject"
  )
val scalaLogging="com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
val utilControl="org.scala-sbt" %% "util-control" % "1.7.2"
val reflect = "org.scala-lang" % "scala-reflect" % "2.13.10"
val xml = "org.scala-lang.modules" %% "scala-xml" % "2.1.0"
val test2 = "org.scala-lang.modules" %% "scala-swing" % "3.0.0"
val test1="org.scalatest" %% "scalatest" % "3.2.14" % Test
val flatSpec="org.scalatest" %% "scalatest-flatspec" % "3.2.14" % Test
val funSpec="org.scalatest" %% "scalatest-funspec" % "3.2.14" % Test
val wordSpec="org.scalatest" %% "scalatest-wordspec" % "3.2.14" % Test
val freespec="org.scalatest" %% "scalatest-freespec" % "3.2.14" % Test
val JodaTime="joda-time" % "joda-time" % "2.12.0"
val MySql="mysql" % "mysql-connector-java" % "8.0.30"
val jodaconvert ="org.joda" % "joda-convert" % "2.2.2"
val dep1="org.scalikejdbc" %% "scalikejdbc" % "3.5.0"
val dep2="com.h2database" % "h2" % "2.1.214" % Test
val dep3="ch.qos.logback" % "logback-classic" % "1.4.4" % Test
//val AkkaVersion1 = "2.6.20"
//val allakkaDependency="com.typesafe.akka" %% "akka-actor-typed" %


libraryDependencies ++=Seq(scalaLogging,utilControl,reflect,xml,test2,test1,flatSpec,freespec,wordSpec,funSpec,JodaTime,MySql,jodaconvert,dep1,dep2,dep3)
