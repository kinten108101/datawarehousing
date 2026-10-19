val scala3Version = "3.10.0"

val spark_4 = "4.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "datawarehousing",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.3.6" % Test,
      ("org.apache.spark" %% "spark-core" % spark_4).cross(CrossVersion.for3Use2_13),
      ("org.apache.spark" %% "spark-sql"  % spark_4).cross(CrossVersion.for3Use2_13),
    )
  )
