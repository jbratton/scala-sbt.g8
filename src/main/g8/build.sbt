lazy val root = (project in file("."))
  .settings(

    name := "$name$",
    organization := "$organization$",
    description := "$project_description$",

    scalaVersion := "$scala_version$",

    libraryDependencies ++= Seq(
      "com.typesafe"                % "config"          % "1.3.2",

      "com.typesafe.scala-logging" %% "scala-logging"   % "3.9.0",
      "ch.qos.logback"              % "logback-classic" % "1.2.3",

      "org.scalatest"              %% "scalatest"       % "3.0.5" % Test
    )
  )

