FROM sbtscala/scala-sbt:eclipse-temurin-25.0.4_7_1.x
COPY build.sbt ./build.sbt
COPY src ./src
RUN  sbt compile
CMD  ["sbt", "run"]
