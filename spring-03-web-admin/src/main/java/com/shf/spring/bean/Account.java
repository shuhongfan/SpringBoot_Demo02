package com.shf.spring.bean;

import lombok.*;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String name;
    private Integer money;
}
