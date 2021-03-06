package com.hades.restaurantfoodservice.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
public class User {

    @JsonProperty
    private String fname;
    @JsonProperty
    private String lname;
    @JsonProperty
    private int age;

    @JsonProperty
    private int salary;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime creationDate;

}
