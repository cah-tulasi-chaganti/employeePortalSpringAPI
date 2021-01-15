# employeePortalSpringAPI

To setup the API in local 

Setup DB:
1. Login to SQl ,  with your password and run the bewlo SQL: 
2. CREATE DATABASE `employeeportal`
3. CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(20) DEFAULT NULL,
  `lastname` varchar(20) DEFAULT NULL,
  `emprole` varchar(20) DEFAULT NULL,
  `empprofile` varchar(20) DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) 
3. INSERT INTO `employeeportal`.`employee`
(
`firstname`,
`lastname`,
`emprole`,
`empprofile`,
`department`,
`address`)
VALUES
(
'Tom',
'Chad',
'Developer',
'Services',
'Tech',
'5100 Rings Road Dublin OHIO');

INSERT INTO `employeeportal`.`employee`
(
`firstname`,
`lastname`,
`emprole`,
`empprofile`,
`department`,
`address`)
VALUES
(
'Tulasi',
'Chaganti',
'Developer',
'Services',
'Tech',
'5100 Rings Road Dublin OHIO');

INSERT INTO `employeeportal`.`employee`
(
`firstname`,
`lastname`,
`emprole`,
`empprofile`,
`department`,
`address`)
VALUES
(
'Kc',
'Kollim',
'Tech Lead',
'Services',
'Tech',
'5100 Rings Road Dublin OHIO');

Setup API:

Step 1: git clone 

Step 2: change the  below properies from, add your password:
 /src/main/resources/application.properties
 
spring.datasource.password=your_password

Stpe 3: from command promot ->cd to the project location
Step 3: run the following command:
mvn clean spring-boot:run


Service endpoints:
Get All employees list:
localhost:8080/employees



