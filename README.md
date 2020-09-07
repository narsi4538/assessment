
## Tool/Libraries/Framework/plugins Used
  - Cucumber-Java framework 
  - Hamcrest-all (for Asserts)
  - Rest-assured (for api's)
  - Maven
  - Java
  - masterthought mvn plugin to generate reports 
  - Most of the code is reusable. 
    
  
### How to Run
##### via Intellij IDE
A Cucumber runner class is defined in (/src/test/java/com/techinical/assessment/RunCukesTest.java)

  Edit configurations for RunCukesTest if need to change uri

```sh
-ea -Duri="http://bpdts-test-app-v2.herokuapp.com/"
```

##### via Command line 
```sh
mvn clean -Duri="http://bpdts-test-app-v2.herokuapp.com/" test 
```

##### Reports

Reports is generated for each run and store in target directory and can be viewed in any preferred browser
###### How to access:
Go to /target/cucumber-report-html/cucumber-html-reports/countries-feature.html 
###### Types of reports:

 - Feature 
 - Tags
 - Steps
 - Failure 

