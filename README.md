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

TODO
1. ``
2. ``
