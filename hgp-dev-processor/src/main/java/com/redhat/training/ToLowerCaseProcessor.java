package com.redhat.training;

import java.util.Locale;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ToLowerCaseProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
			String payload = exchange.getIn().getBody(String.class);
			payload.toLowerCase(Locale.ENGLISH);
			System.out.println("Message content in lower case:" + payload);
			exchange.getIn().setBody(payload);
			String body = exchange.getIn().getBody(String.class);
			System.out.println("Message content in lower case:" + body);
	}

}
