import com.typesafe.sbt.packager.graalvmnativeimage.GraalVMNativeImagePlugin.autoImport.graalVMNativeImageOptions

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "graalvm-native-image-bug-demo",

    libraryDependencies ++= Seq(
      "io.7mind.izumi" %% "fundamentals-bio" % "1.0.8",
      "dev.zio" %% "zio" % "1.0.13",
      "org.typelevel" %% "cats-core" % "2.5.0",
    ),
      GraalVMNativeImage / mainClass := Some("izumi.functional.bio.Demo00"), // OK

    scalacOptions ++= Seq(
      "-target:jvm-1.8",
      "-explaintypes",
      "-Xsource:3",
      "-Wconf:cat=optimizer:warning",
      "-Wconf:cat=other-match-analysis:error",
      "-Vimplicits",
      "-Vtype-diffs",
      "-Ybackend-parallelism",
      math.min(16, math.max(1, sys.runtime.availableProcessors() - 1)).toString,
      "-Wdead-code",
      "-Wextra-implicit",
      "-Wnumeric-widen",
      "-Woctal-literal",
      "-Wvalue-discard",
      "-Wunused:_",
      "-Wmacros:after",
      "-Ycache-plugin-class-loader:always",
      "-Ycache-macro-class-loader:last-modified",
      "-Wunused:-synthetics",
      "-Wconf:any:warning",
      "-Wconf:cat=deprecation:warning",
      "-Wconf:msg=nowarn:silent",
      "-Wconf:msg=parameter.value.x\\$4.in.anonymous.function.is.never.used:silent",
      "-Wconf:msg=package.object.inheritance:silent",

      "-opt:l:inline",
      "-opt-inline-from:izumi.**"
    ),

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
