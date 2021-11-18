package com.shf.spring.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@Getter
@Setter
public class City {
    private Long id;
    private String name;
    private String state;
    private String country;
}
