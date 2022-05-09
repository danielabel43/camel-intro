package com.abel.CheckFlightService.model;

import lombok.Data;

@Data
public class CheckFlightResponse {

    private Boolean isFlightAvailable;

    private String queryID;
}
