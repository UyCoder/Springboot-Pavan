package com.uycoder.demo;
import org.springframework.web.bind.annotation.*;

// Part 3- Rest API & Microservices| How To Create Rest Service to handle CRUD Operations
// https://www.youtube.com/watch?v=n6GA1p6Wbvs&list=PLUDwpEzHYYLtg-RO06RVFsauoAv241TNE&index=3
// How to develop a simple Spring Boot REST service to handle HTTP GET, POST, PUT and DELETE requests.
//  Controller Class
//  Handle Path Parameter
//  Handle Query Parameter



@RestController
@RequestMapping("/users")
public class UsersController {

// simple url localhost:8081/user
//    @GetMapping
//    public String getUsers() {
//        return "http GET request was sent..";
//    }

    // this is for localhost:8081/users?page=1&limit=50
    @GetMapping
    public String getUsers(@RequestParam(value = "page") int pageno,
                           @RequestParam(value ="limit") int limitno) {
        return "http GET request was sent for page: " + pageno + " limit is: " + limitno;
    }

    // when we send localhost:8081/users/123
    // response will be 'http GET request was sent..123'
    @GetMapping(path="/{userID}")
    public String getUsers(@PathVariable String userID) {
        return "http GET request was sent.." + userID;
    }


    @PostMapping
    public String createUsers() {
        return "http POST request was sent..";
    }

    @PutMapping
    public String updateUsers() {
        return "http PUT request was sent..";
    }

    @DeleteMapping
    public String deleteUsers() {
        return "http DELETE request was sent..";
    }
}
