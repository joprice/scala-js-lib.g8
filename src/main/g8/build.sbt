
lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)

name := "$name$"

version := "$version$"

scalaVersion := "2.11.7"

persistLauncher := true

persistLauncher in Test := false

scalacOptions ++= Seq("-deprecation", "-feature", "-Xlint")

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

jsDependencies in Test += RuntimeDOM

libraryDependencies ++= Seq(
  "be.doeraene" %%% "scalajs-jquery" % "0.8.1",
  "org.scala-js" %%% "scalajs-dom" % "0.8.2"
)
