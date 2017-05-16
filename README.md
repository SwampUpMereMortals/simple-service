# Simple Example Service

This is a basic Spring Boot service that is built, tested, and
packaged as a docker image.  This code is not very interesting, but
the surrounding CI/CD code (Travis Configurations) is.  Use this as a
starting place to wrap your head around how to manage potentially
multiple Docker images all being deployed to Kubernetes/GKE via Travis
& Artifactory.

## Build & Run as Java

1. `mvn clean install`
2. `java -jar target/simple-service-0.0.1-SNAPSHOT.jar`


## Build & Run as Docker

1.

    docker build \
    --build-arg version=$(mvn -q -Dexec.executable="echo" -Dexec.args='${project.version}' --non-recursive org.codehaus.mojo:exec-maven-plugin:1.3.1:exec) \
    --build-arg jar=$(mvn -q -Dexec.executable="echo" -Dexec.args='${jar.finalName}' --non-recursive org.codehaus.mojo:exec-maven-plugin:1.3.1:exec).jar \
    -t simple-service:latest-dev .

2. `docker run -p 8080:8080 simple-service:latest-dev`

3. `curl http://192.168.99.100:8080/simple` (or whatever IP for docker
   VM, etc).
