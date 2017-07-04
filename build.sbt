name := "mydl4j"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.deeplearning4j" % "deeplearning4j-core" % "0.8.0",
  "org.deeplearning4j" %% "deeplearning4j-ui" % "0.8.0",
  "org.nd4j" % "nd4j-native" % "0.8.0" classifier "" classifier "linux-x86_64",
  "org.bytedeco" % "javacv-platform" % "1.3.2"
)