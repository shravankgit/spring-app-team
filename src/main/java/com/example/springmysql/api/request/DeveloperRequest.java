package com.example.springmysql.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class DeveloperRequest {

    @JsonProperty("name")
    private String name;

    @JsonProperty("phone_number")
    private String phone_number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "DeveloperRequest{" +
                "name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
