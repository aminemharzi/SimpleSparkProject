val scala3Version = "3.6.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "SparkExample",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )

name := "SparkExample"

version := "0.1"

scalaVersion := "2.12.15" // Ensure compatibility with your Spark version

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.4.0",
  "org.apache.spark" %% "spark-sql" % "3.4.0"
)
