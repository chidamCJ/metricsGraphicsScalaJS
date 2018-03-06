enablePlugins(ScalaJSPlugin)

name := "mgWrapper"

version := "0.1.0"

organization := "mgwrapper"

isScalaJSProject := true

scalaVersion := "2.11.8"

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

skip in packageJSDependencies := false

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

