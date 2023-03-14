# ***SpringBootCRUD***
## A simple CRUD server with exposed endpoints made with SpringBoot as an entry exercise for "Ready2Use" company.

**WARNING**<br>
This project is made and compiled with the Java 19 JDK. So whether you install the full JDK or just the JRE to run the application, install the Java 19 version.

**DISCLAIMER**<br>
The following instructions are MY recommended ways to handle the project, but if you feel confident with your own ways then feel free to do so as you like.
Also, feel free to modify or create your own version/fork of the app if you wish.

There are mainly two ways to run the application.<br>
The easiest and most straightforward way is by running it standalone using the pre-compiled executable JAR file.
To do that, follow the instructions in the JAR release page.

Instead, if you want to run the application from the actual project (so to have control over the source code too), you need to install Maven (or just download and store the Maven binary in the "SpringBootCRUD/Project" folder if you wish, just keep in mind that you will need to change `mvn` with the name of the binary in the following Maven commands and that the binary needs to be compatible with your operating system) and the JDK on your computer.
Then, follow these instructions:<br>
- Clone the main repository (**project**), either by using GitHub's website or by using the git CLI with the command:<br>
``git clone https://github.com/StiffWriter00/SpringBootCRUD.git``<br>
- Then, open a terminal, go to the "SpringBootCRUD/Project" folder and type the following command:<br>
``mvn spring-boot:run``<br>
This command alone will download and store every needed dependency on your computer, compile the source code and run the application.<br>
The JAR file will be located in the "target" folder (the same folder that stores the compiled classes).<br>
Once the application is running, it will be listening for requests on *localhost:8080* .<br>
For a quick and easy testing of the REST APIs, install Postman and import the collection file (**CRUD.postman_collection.json**).

**BONUS**<br>
If you wish to create your own JAR file from the project, go to the "SpringBootCRUD/Project" folder and run the following command:<br>
`mvn package spring-boot:repackage`<br>
The JAR file can then be found in the "target" folder named as **SpringBootCRUD-SNAPSHOT.jar** .
You can then run the app standalone with it.<br>
However, as specified in the JAR release page aware that when you run the JAR executable file, it will automatically create another void **db** (database) file in the path you run the JAR from, if there is not one already.
