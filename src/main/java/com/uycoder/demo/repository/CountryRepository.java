package com.uycoder.demo.repository;
// Part 6- Rest API & Microservices| How To Create Rest API & Microservice using SpringBoot |JPA| MySQL
// https://www.youtube.com/watch?v=m5-tEb1kdaE&list=PLUDwpEzHYYLtg-RO06RVFsauoAv241TNE&index=6

import com.uycoder.demo.beans.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
