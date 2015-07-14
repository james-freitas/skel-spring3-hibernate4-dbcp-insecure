### Spring 3 insecure web application with Hibernate and DBCP

- Create the mysql database sphidb in the port 3306

##### Using Eclipse Maven Plugin to run the project for the first time

1. Select the project
2. Go at menu *Run > Run Configurations*
3. Select *Maven Build* 
4. Right click on *New* 
5. Specify the *Goal* as **clean tomcat:run**
6. Click in *Browse Workspace* and select the your project
7. In Name specify **<Project-Name> - Run Tomcat Without Downloads** 
7. Click *Run*
8. After that the configuration link will be available in the Run icon
9. Access the web application in **http://localhost:8080/sphidb**

Next time you run the application you may use for step 5: 
* **-o tomcat:run**

Other options for step 5:
* **-o clean package tomcat:run-war**
* **Dmaven.tomcat.port=8086 tomcat:run**
