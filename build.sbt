enablePlugins(ScalaJSPlugin)

name := "mgWrapper"

scalaVersion := "2.11.8"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

skip in packageJSDependencies := false

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

