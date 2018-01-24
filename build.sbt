version := "0.1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.2.0.cloudera1"
val scalatestVersion = "3.0.4"
val scallopVersion = "3.1.0"
val pureconfigVersion = "0.8.0"
val jodaTimeVersion = "2.9.3"

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = true)

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

publishTo := Some("Git" at "https://github.com/Denzzel/bla")

publishArtifact := false