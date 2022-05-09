package com.abel.FlightNumberService.model;

import lombok.Data;

@Data
public class FlightServiceRequest {

    private String origin;

    private String destination;

    private Integer queryID;
}
