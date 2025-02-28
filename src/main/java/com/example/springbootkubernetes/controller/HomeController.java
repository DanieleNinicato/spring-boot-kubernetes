package com.example.springbootkubernetes.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/home")
@RestController
@Slf4j
public class HomeController {

    @Value("${MY_ENV_VAR:default_value}")
    private String myEnvVar;

    @Value("${spring-boot-kubernetes.properties.version}")
    private String version;

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> post(@RequestBody String input, RequestEntity<Object> request) {
        log.info("[{}] {} - {}  with data {}", version, request.getMethod(), request.getUrl(), input);
        log.info("[{}] env var: {}", version, myEnvVar);
        return new ResponseEntity<>(input.toUpperCase(), HttpStatus.OK);
    }

    @GetMapping(path = "/{variable}")
    public ResponseEntity<String> home(@PathVariable String variable, RequestEntity<Object> request) {
        log.info("[{}] {} - {}", version, request.getMethod(), request.getUrl(), variable);
        return new ResponseEntity<>(variable, HttpStatus.OK);
    }
}
