name := "explore-sbt"

lazy val scalaV = "2.11.7"

lazy val blocks = (project in file("blocks"))
  .settings(commonSettings: _*)
  .settings(
    version := "0.1.0",
    libraryDependencies ++= Seq(

    )
  )

lazy val httpserver = (project in file("httpserver"))
  .settings(commonSettings: _*)
  .settings(
    version := "0.1.0",
    libraryDependencies ++= Seq(

    )
  ).dependsOn(blocks)

lazy val commonSettings: Seq[Setting[_]] = Seq(
  name <<= name("explore-" + _),
  scalaVersion := scalaV,
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "2.1.5" % "test"
  )
)