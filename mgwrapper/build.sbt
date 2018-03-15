enablePlugins(ScalaJSPlugin)

name := "mgWrapper"

version := "0.1.1"

organization := "mgwrapper"

scalaVersion := "2.11.8"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

/*
isScalaJSProject := true

scalaJSUseMainModuleInitializer := true

skip in packageJSDependencies := false

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
*/
