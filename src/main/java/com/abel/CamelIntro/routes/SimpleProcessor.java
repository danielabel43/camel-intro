package com.abel.CamelIntro.routes;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleProcessor implements org.apache.camel.Processor {

    private static final Logger logger= LoggerFactory.getLogger(SimpleProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        logger.info("processor {}",exchange.getMessage());
    }
}
