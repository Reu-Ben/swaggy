# swaggy
SWAGGY Wallet, A Spring boot application that exposes a set of API's respecting the RESTFUL architecture to perform CRUD operations on user and view realtime currency exchange data

Steps to run the application:

1. Make sure you have java 11 and latest version of maven
2. create a database in mysql called swaggy
3. Navigate to the directory of swaggy with cmd and type mvn clean install && mvn spring-boot:run
4. Once the app is running, via browser you can see the list of API's on localhost:8080/swagger-ui.html
