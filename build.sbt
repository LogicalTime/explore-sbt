import src.main.scala.common.CommonProj

name := "explore-sbt"

lazy val scalaV = "2.11.7"

val gitHeadCommitSha = taskKey[String]("Determines cthe current git commit SHA") //example of a definition

lazy val blocks = Project("blocks-proj", file("blocks"))
  .settings(commonSettings: _*)
  .settings(
    version := "0.1.0",
    gitHeadCommitSha := CommonProj.fn() // //example of a definition
  )


lazy val httpserver = (project in file("httpserver"))
  .settings(commonSettings: _*)
  .settings(
    version := "0.1.0",
    libraryDependencies ++= Seq(

    )
  ).dependsOn(blocks)

lazy val restService = (project in file("rest-service"))
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