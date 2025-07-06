name := "podcast-api"
organization := "farran"
version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.16"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.2" % Test

// PostgreSQL + Slick + Twirl Fix
libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "5.1.0" exclude("com.typesafe.play", "twirl-api_2.13"),
  "com.typesafe.play" %% "play-slick-evolutions" % "5.1.0" exclude("com.typesafe.play", "twirl-api_2.13"),
  "org.scala-lang.modules" %% "scala-xml" % "2.2.0",
  "org.playframework.twirl" %% "twirl-api" % "2.0.9",
  "org.postgresql" % "postgresql" % "42.6.0"
)
