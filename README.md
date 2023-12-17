# QAcart - Complete REST Assured

This repository contains resources related to the project created as part of the "Complete REST Assured" Course at QAcart. In this repository, you will find both the project and the illustrative examples developed during the course.

## Table of Contents

- [Introduction](#introduction)
- [Learning Milestones](#learning-milestones)
- [Technologies Used](technologies-used)
- [Directory Structure](#directory-structure)
- [Usage](#usage)
- [Contributions](#contributions)
- [Disclaimer](#disclaimer)

## Introduction

The "[Complete REST Assured](https://qacart.com/course/rest-assured-101)" course at QAcart is a great resource for learning and mastering API testing using REST Assured. From diving into the secrets of RESTful APIs to creating powerful and automated test suites, this course is a great guide for enhancing API testing skills in a way that's both engaging and easy to grasp.\
This repository houses the project along with the examples developed and implemented throughout the course.

## Learning Milestones

- Creating a Maven project and adding project dependencies.
- Building an API using [mockapi.io](https://mockapi.io/).
- Utilizing TestNG annotations and static imports.
- Implementing response assertions.
- Mastering JSON query, Groovy GPath query, and Jayway JsonPath query.
- Extract full response, a specific item, using JSON Path, and using then().
- Applying response logging techniques.
- Headers in REST Assured.
- Working with Query parameters.
- Sending body as String, file, HashMap, POJO class and URL Encoded.
- Uploading a file as body.
- Authorization.
- Leveraging the RequestSpecification Class.

## Technologies Used

- [Apache Maven](https://maven.apache.org/)
- [REST-Assured](https://rest-assured.io/)
- [mockapi.io](https://mockapi.io/)
- [TestNG](https://testng.org/doc/)
- [Jayway JsonPath](https://github.com/json-path/JsonPath)
- [Hamcrest](https://hamcrest.org/)


## Directory Structure

The repository is organized as follows:
- `QAcartRestAssured/`: This directory contains my implementation to code presented throughout the course.
  - `pom.xml`: The `pom.xml` file is a Maven Project Object Model (POM) file used for managing dependencies and build configurations for the project.
  - `src/test/java/com/qacart/`:  This directory, located within the `QAcartRestAssured` directory, contains Java source code files. These files represent my own implementations to the examples presented in the lectures.
    - `TestCase.java`: A Java source code file within the `qacart` package, containing REST Assured test cases. These test cases represent implementations of the examples presented in the lectures throughout the course.
- `QAcartAcademyRestAssured/`: The main directory containing project files and resources related to the QAcart Academy REST Assured project.
  - `pom.xml`: The `pom.xml` file is a Maven Project Object Model (POM) file used for managing dependencies and build configurations for the project.
  - `src/test/`:  This directory, located within the `QAcartAcademyRestAssured` directory, dedicated to test-related code.
    - `resources/`: This directory contains essential resources for the project.
      - `login.json`: JSON file containing the email and password credintials for login
    - `java/com/qacart/academy/`: A sub-package within the `com.qacart` package, representing code related to the QAcart Academy project.
      - `pojo/`: A sub-package within `academy` containing Plain Old Java Object (POJO) classes.
        - `LoginPojo.java`: A POJO class within the `pojo` package, specifically representing the login entity.
      - `testcases`: A sub-package within `academy` containing Java classes for test cases.
        - `CoursesTest.java`: A Java class designed to assess authentication by utilizing the authentication token.
        - `InfoTest.java`: A Java class for testing request headers and query parameters.
        - `StudentsTest.java`: A Java class dedicated to evaluating the request body and validating login functionality using provided credentials.


## Usage

You can go ahead and explore my code implementations. Feel free to use these implementations as reference code, study materials, or review materials to enhance your understanding of REST-Assured.

## Contributions

Contributions to this repository are welcome. If you have alternative code implementations, suggestions for improvements please consider submitting a pull request. If you encounter any issues with my implementation or have additional insights to share, please open an issue.

## Disclaimer
> This is not the official implementation.
