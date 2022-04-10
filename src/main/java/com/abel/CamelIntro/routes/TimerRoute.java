package com.abel.CamelIntro.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class TimerRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:timer")
                .transform().constant("camel-intro"+ LocalDate.now())
                .process(new SimpleProcessor())
                .to("log:timerTest");
    }


}
