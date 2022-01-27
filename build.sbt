
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "graalvm-native-image-bug-demo",

    libraryDependencies ++= Seq(
      "io.7mind.izumi" %% "fundamentals-bio" % "1.0.8",
      "dev.zio" %% "zio" % "1.0.13",
    ),
      GraalVMNativeImage / mainClass := Some("demo.Demo00"), // OK

    graalVMNativeImageOptions ++= Seq(
      "--no-fallback",
      "-H:+ReportExceptionStackTraces",
      "--allow-incomplete-classpath",
      "--report-unsupported-elements-at-runtime",
      "--enable-https",
      "--enable-http",
      "--enable-all-security-services",
      "-J-Xmx4G",
    ),
  )
  .enablePlugins(GraalVMNativeImagePlugin, UniversalPlugin)

