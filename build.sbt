ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "session-4-day-3-assignment-2"
  )
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"