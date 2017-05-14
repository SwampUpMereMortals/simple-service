FROM openjdk:8

ARG version
ARG jar


LABEL description="SwampUP 2017 Mere Mortals Docker service example."
LABEL version=$version

EXPOSE 8080

COPY target/$jar /app/app.jar

ENTRYPOINT [ "java -jar /app/app.jar" ]
