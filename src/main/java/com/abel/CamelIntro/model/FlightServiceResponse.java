package com.abel.FlightNumberService.model;

import lombok.Data;

@Data
public class FlightServiceResponse {

    private Integer flightNumber;

    private String origin;

    private String destination;

    private Integer queryID;
}
