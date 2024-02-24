package com.testspeedom.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Data
public class SpeedomDto {

    private Integer spdnVal;
    private Timestamp spdnTamp;
}
