package com.cydeo.utilities;

import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.baseURI;

public abstract class HRTestBase {

    @BeforeAll
    //save baseurl inside this variable so that we dont need to type each http method.
    public static void init() {
        baseURI = "http://3.86.198.182:1000/ords/hr";
    }

}
