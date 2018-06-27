# springBoot
Function: returns a JSON containing the balance and currency accordingly to a given id and username.

How it works: <br>
First you need to run the server.

  In the folder of the project, build the JAR file with (do not use "./" if you are running it in Windows):
    
      ./mvnw clean package
  
  Then you can run the JAR file:
    
      java -jar target/gs-consuming-rest-0.1.0.jar
     
After that you can access through the browser locally:

       http://localhost:8080/balance

You also need to provide the parameters "id" and "username" by GET. The final url must be similar to:

        http://localhost:8080/balance?id=10&username=Paf
        
The result should be similar to:

        {"balance":100,"currency":"P"}
        


<h3>Good to know</h3>
You need the JDK for running this project. 
You also may need to set the JAVA_HOME to the folder that contains the JDK.

For more information, check the wiki of this project.

  
