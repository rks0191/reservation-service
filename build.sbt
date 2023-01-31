import sbt.Keys.libraryDependencies
ThisBuild / scalaVersion := "2.13.6"
ThisBuild / organization := "com.reservation"
lazy val AkkaVersion = "2.7.0"
lazy val ReservationService = (project in file("."))
  .settings(
    name := "ReservationService",
      libraryDependencies +="com.typesafe.akka" %% "akka-persistence-typed" % AkkaVersion,
      libraryDependencies +="com.typesafe.akka" %% "akka-persistence-testkit" % AkkaVersion % Test
)

