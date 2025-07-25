package com.hospitalmanagement.hospitalManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BloodGroupCountResponseEntity {
    private String bloodGroup;
    private Long count;
}
//--------PROJECTION CLASS FOR "BLOOD GROUP COUNT BY TYPE" - only works with JPQL, does not work for native queries.