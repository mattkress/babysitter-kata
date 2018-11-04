Running this application will require Java (JDK1.7 or higher) and Maven to be installed.  Instructions for installation are available on each website.  

Java can be downloaded from https://www.oracle.com/technetwork/java/javase/downloads/index.html

Maven can be downloaded from https://maven.apache.org/download.cgi

Instructions for running Unit Tests from command line 
1. Navigate to where the project has been saved to after pulling from the Git Repository (i.e. Development/babysitter-kata/Pillar-Kata)

2. When executing an ls command from this directory you should see pom.xml, src, and target

3. Run the command mvn clean test (The first time the tests are run maven will download all necessary dependencies)


Instructions for running the application from the command line
1. Navigate to the same path as above

2. When executing an ls command from this directory you should see pom.xml, src, and target

3. Run the command mvn clean install

4. Run the command mvn exec:java


