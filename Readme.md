Write an application which takes an array as an input, and calculates the volume of water
which remained after the rain, in units.  
The application shall be deployable in a EJB container of your choice  
(preferably either JBoss, Wildfly, Glassfish, or TomEE).  
Make a statement on complexity of your solution (time and memory), and if possibly
discuss complexity of an optimal solution.

## What will you need
* Java 8+
* Maven
* Wildfly

## How to build
`mvn package`  
Path to artifact is `target/rainyhills.war`

## How to deploy
`mvn package wildfly:deploy`

## How to use
Make POST request to url
`http://localhost:8080/rainyhills/v1/api/calculate` with body `[4,5,3,2,7]`.  
Result will be `5`.