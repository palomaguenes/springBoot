# springBoot
Function: returns a JSON containing the balance and currency accordingly to a given id and username.

How it works using Linux:
First you need to run the server.

  Build the JAR file with 
    
      ./mvnw clean package
  
  Then you can run the JAR file:
    
      java -jar target/gs-rest-service-0.1.0.jar
     
After that you can access through the browser locally:

       http://localhost:8080/balance

You also need to provide the parameters "id" and "username". The final url must be similar to:

        http://localhost:8080/balance?id=10&username=Paf
        
The result should be similar to:

        {"balance":100,"currency":"P"}
  
