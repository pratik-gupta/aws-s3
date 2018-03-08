package com.pratik.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHello implements RequestHandler<Object, String> {

	
	public String handleRequest(Object input, Context context) {
		context.getLogger().log("Input: " + input);
        return "Hello from Lambda!";
	}
}
