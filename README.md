Spring 3 insecure web application with Hibernate and DBCP

Using Eclipse Maven Plugin

1. Select the project
2. Go at menu Run > Run Configurations
3. Select Maven Build 
4. Right click on New 
5. Specify the Goal as "clean tomcat:run" 
6. Click in Browse Workspace and select the your project
7. In Name specify "<Project-Name> - Run Tomcat Without Downloads" 
7. Click Run
8. After that the configuration link will be available in the Run icon

Other option for step 5:
-o clean package tomcat:run-war
-Dmaven.tomcat.port=8086 tomcat:run