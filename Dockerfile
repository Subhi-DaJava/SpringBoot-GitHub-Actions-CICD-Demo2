FROM openjdk:17-jdk

WORKDIR /app

COPY target/github-actions-workflow-demo2.jar /app/github-actions-workflow-demo2.jar

EXPOSE 8080

CMD ["java", "-jar", "github-actions-workflow-demo2.jar"]