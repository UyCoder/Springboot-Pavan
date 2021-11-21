package com.uycoder.demo.repository;
/**
 * Project:     Springboot-Pavan
 * Package:     com.uycoder.demo.beans
 * Created:     2021-11-15  22:31
 * Author:      Ahmed Bughra
 * Email:       AhmedBughra@gmail.com
 * LinkedIn:    https://www.linkedin.com/in/ahmed-bughra/
 * CreatedWith: IntelliJ IDEA
 */
// Part 6- Rest API & Microservices| How To Create Rest API & Microservice using SpringBoot |JPA| MySQL
// https://www.youtube.com/watch?v=m5-tEb1kdaE&list=PLUDwpEzHYYLtg-RO06RVFsauoAv241TNE&index=6

import com.uycoder.demo.beans.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
