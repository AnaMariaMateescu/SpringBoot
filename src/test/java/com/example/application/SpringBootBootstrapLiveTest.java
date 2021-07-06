package com.example.application;

import org.apache.catalina.connector.Response;
import org.springframework.boot.test.autoconfigure.restdocs.RestDocsRestAssuredConfigurationCustomizer;
import org.springframework.http.MediaType;
import io.restassured.RestAssured;

public class SpringBootBootstrapLiveTest {

    private static final String API_ROOT
            ="http://localhost:8081/api/books";

    public void whenGetAllBooks_thenOK() {
        final Response response =
    }
}
