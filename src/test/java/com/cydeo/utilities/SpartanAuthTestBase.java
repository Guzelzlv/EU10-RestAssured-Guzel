package com.cydeo.utilities;

import org.junit.jupiter.api.*;
import static io.restassured.RestAssured.baseURI;
import org.junit.jupiter.api.BeforeAll;

public abstract class SpartanAuthTestBase {

    @BeforeAll
    public static void init() {
        //save baseurl inside this variable so that we dont need to type each http method.
        baseURI = "http://3.86.198.182:7000";
    }
}

//
//=======
//<?xml version="1.0" encoding="UTF-8"?>
//<project xmlns="http://maven.apache.org/POM/4.0.0"
//        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
//<modelVersion>4.0.0</modelVersion>
//
//<groupId>com.cybertek</groupId>
//<artifactId>B22-RestAssured</artifactId>
//<version>1.0-SNAPSHOT</version>
//
//<properties>
//<maven.compiler.source>8</maven.compiler.source>
//<maven.compiler.target>8</maven.compiler.target>
//<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
//</properties>
//
//<build>
//<plugins>
//<plugin>
//<groupId>org.apache.maven.plugins</groupId>
//<artifactId>maven-compiler-plugin</artifactId>
//<version>3.8.1</version>
//<configuration>
//<source>8</source>
//<target>8</target>
//</configuration>
//</plugin>
//</plugins>
//</build>
//
//<dependencies>
//<dependency>
//<groupId>org.junit.jupiter</groupId>
//<artifactId>junit-jupiter</artifactId>
//<version>5.7.2</version>
//</dependency>
//<dependency>
//<groupId>io.rest-assured</groupId>
//<artifactId>rest-assured</artifactId>
//<version>4.4.0</version>
//</dependency>
//<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
//<dependency>
//<groupId>com.fasterxml.jackson.core</groupId>
//<artifactId>jackson-databind</artifactId>
//<version>2.12.4</version>
//</dependency>
//
//<dependency>
//<groupId>com.oracle.ojdbc</groupId>
//<artifactId>ojdbc8</artifactId>
//<version>19.3.0.0</version>
//</dependency>
//
//<dependency>
//<groupId>org.projectlombok</groupId>
//<artifactId>lombok</artifactId>
//<version>1.18.20</version>
//</dependency>
//
//
//
//
//</dependencies>
//
//
//</project>