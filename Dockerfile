FROM openjdk:17-oracle
COPY target/*.jar /opt/app/league-football-service.jar
EXPOSE 8090
LABEL maintainer="KK"

ENTRYPOINT ["java", "-server", "-jar", "/opt/app/league-football-service.jar"]