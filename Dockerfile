# Step 1: Build WAR using Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app
COPY . .

# Maven project inside SignUp folder
WORKDIR /app/SignUp
RUN mvn clean package

# Step 2: Deploy to Tomcat
FROM tomcat:10.1-jdk17
COPY --from=build /app/SignUp/target/*.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
