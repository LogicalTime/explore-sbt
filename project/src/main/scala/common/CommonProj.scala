package src.main.scala.common

import sbt.Process

object CommonProj{
  val fn = () => Process("git rev-parse Head").lines.head // function could g anywhere
}