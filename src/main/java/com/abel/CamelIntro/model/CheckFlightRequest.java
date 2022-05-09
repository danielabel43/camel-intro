package com.abel.CheckFlightService.model;

import lombok.Data;

@Data
public class CheckFlightRequest {

    private String flightNum;
    private String queryId;
}
