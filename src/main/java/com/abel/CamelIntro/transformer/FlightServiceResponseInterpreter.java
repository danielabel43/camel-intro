package com.abel.CamelIntro.transformer;

import com.abel.CamelIntro.model.FlightServiceResponse;
import com.abel.CamelIntro.model.Request;
import org.springframework.stereotype.Component;

@Component("flightServiceResponseBuilder")
public class FlightServiceResponseBuilder {

    public Request buildRequestFromFlightServiceResponse(FlightServiceResponse flightServiceResponse){
        Request request=new Request();
        request.setOrg(flightServiceResponse.getOrigin());
        request.setDst(flightServiceResponse.getDestination());
        request.setFlightNum(flightServiceResponse.getFlightNumber());
        return request;
    }
}
