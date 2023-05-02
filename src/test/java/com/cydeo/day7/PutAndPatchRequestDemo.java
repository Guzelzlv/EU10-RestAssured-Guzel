package com.cydeo.day7;

import com.cydeo.utilities.SpartanTestBase;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class PutAndPatchRequestDemo extends SpartanTestBase {

    @DisplayName("PUT request to one spartan for update with Map")
    @Test
    public void PUTRequest() {
        //just like post request we have different options to send body, we will go with map
        Map<String,Object> putRequestMap = new HashMap<>();
        putRequestMap.put("name","SeverusSpartan");
        putRequestMap.put("gender","Male");
        putRequestMap.put("phone",8877445590L);

        given().and().contentType(ContentType.JSON)
                .body(putRequestMap)
                .and().pathParam("id",117)
                .when().put("api/spartans/{id}")
                .then()
                .statusCode(204);

        //send a GET request after update, make sure updated field changed, or the new info matching
        //with requestBody that we send
    }

    @DisplayName("PUT request to one spartan for partial update with Map")
    @Test
    public void PATCHRequest() {
        //just like post request we have different options to send body, we will go with map
        Map<String,Object> putRequestMap = new HashMap<>();
        putRequestMap.put("phone",8877445599L);

        given().and().contentType(ContentType.JSON)
                .body(putRequestMap)
                .and().pathParam("id",117)
                .when().patch("api/spartans/{id}")
                .then()
                .statusCode(204);

        //send a GET request after update, make sure updated field changed, or the new info matching
        //with requestBody that we send
    }

    @DisplayName("DELETE one spartan")
    @Test
    public void deleteSpartan(){
        int idToDelete=100;

        given().pathParam("id",idToDelete)
                .when().delete("api/spartans/{id}")
                .then().statusCode(204);

        //send a get request after you delete make sure you are getting 404

    }
}
