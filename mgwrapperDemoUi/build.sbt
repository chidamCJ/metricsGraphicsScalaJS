enablePlugins(ScalaJSPlugin)

name := "mgWrapperDemoUi"

version := "0.1.0"

scalaVersion := "2.11.8"

scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "mgwrapper"    %%% "mgwrapper"   % "0.1.0"
)

skip in packageJSDependencies := false

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
