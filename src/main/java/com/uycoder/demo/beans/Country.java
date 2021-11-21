package com.uycoder.demo.beans;
/**
 * Project:     Springboot-Pavan
 * Package:     com.uycoder.demo.beans
 * Created:     2021-11-15  22:31
 * Author:      Ahmed Bughra
 * Email:       AhmedBughra@gmail.com
 * LinkedIn:    https://www.linkedin.com/in/ahmed-bughra/
 * CreatedWith: IntelliJ IDEA
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Country")
public class Country {

    @Id
    @Column(name="id")
    int id;

    @Column(name="country_name")
    String countryName;

    @Column(name="Capital")
    String countryCapital;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }


    public Country() {

    }
    public Country(int id, String countryName, String countryCapital) {
        this.id = id;
        this.countryName = countryName;
        this.countryCapital = countryCapital;
    }

}
