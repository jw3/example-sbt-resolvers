name := "example-sbt-resolvers"
version := "1.0"
scalaVersion := "2.12.3"

resolvers += Resolver.bintrayRepo("jw3", "maven")
libraryDependencies += "com.rxthings" %% "akka-injects" % "0.8"

dockerExposedPorts := Seq(9000)
dockerRepository := Some("jwiii")
packageName in Docker := "example-sbt-resolvers"
enablePlugins(JavaServerAppPackaging, OpenShiftPlugin)
