name := "SparkWithMySQL"

version := "0.1"

scalaVersion := "2.12.18" // Compatible with Spark 3.4.x

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.4.1",
  "mysql" % "mysql-connector-java" % "8.0.33"
)
