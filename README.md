# spring-mongo

I have created first Spring application with mongo
In this we can add students 

For this I have used Robot 3T(Intsall Robot  3T)
From the postman I have hit the api and it goes on mongo db

Step1: Create project with File-> new -> Other -> Spring Starter Project then do next next and in last yoou have to add dependecies for Lombok,Spring Web,Spring dev Tools(Done in eclipse)
Step2: Install Robot 3T You will get nice UI of Robot 3T
step3: To run the projct you have to create folder in C:\data\db (data and db)
step4: Go to the path where mongo is located so min was(C:\Program Files\MongoDB\Server\4.4\bin) and run command monogod . here you will find the port where youor localhost mongo is runnning
       so mine is (27017) this will need letter
step5: Now go to eclipse where we have created project and go to /src/main/resources/application.properties and add path like below
       server.ports=8080
       spring.data.mongodb.uri=mongodb://localhost:27017/studentdb
step6: Create Controller, Model, Repositories(heck in src code i have shared)
step7: Run project Right click on project that you have created goto Run as->Java Applictaion -> SpringMongoApplication (Project will run check in console)
Step8: Goto Postman http://localhost:8080/all (hit url  for getting all the students) with GET
step9: http://localhost:8080/create hit this with POST -->goto body raw->json->{
    "id":"2",
    "name" : "Priya",
    "age" : 30,
    "grade": 40
}
and hit 
Step10: Check in Robot 3T you will find your entry and db created
