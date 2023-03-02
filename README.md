# ***SpringBootCRUD***
## A simple CRUD server with exposed endpoints made with SpringBoot as entry exercise for "Ready2Use" company.

**WARNING**<br>
This project is compiled with the Java 19 JDK. So whether you install the full JDK or just the JRE to run the application, install the Java 19 version.

**DISCLAIMER**<br>
The following instructions are MY recommended ways to handle the project, but if you feel confident with your own ways then feel free to do so as you like.

There are mainly two ways to run the application.

The easiest and most straightforward way is by running it standalone using the pre-compiled executable JAR file.
To do that, follow the instructions in the JAR release.

Instead, if you want to run the application from the actual project (so to have control over the source code too), install Maven (by default it installs the JDK as well) and clone the main repository's branch (**project**), either by using GitHub's website or by using the git CLI with the command:<br>
``git clone https://github.com/StiffWriter00/SpringBootCRUD.git``

Then, open a terminal, go to the "SpringBootCRUD/Project" folder and type the following command:<br>
``mvn spring-boot:run``

This command alone will download and store all needed dependencies on your computer, compile the source code and run the application.<br>
The JAR file will be located in the "target" folder (the same folder that stores the compiled classes).<br>
Once the application is running, it will be listening for requests on *localhost:8080* .<br>
For a quick and easy testing of the REST APIs, install Postman and import the collection file (**CRUD.postman_collection.json**).

**BONUS**<br>
If you wish to create your own JAR file from the project, go to the "SpringBootCRUD/Project" folder and run the following command:<br>
`mvn package spring-boot:repackage`

The JAR file can then be found in the "target" folder named as **SpringBootCRUD-SNAPSHOT.jar** .
