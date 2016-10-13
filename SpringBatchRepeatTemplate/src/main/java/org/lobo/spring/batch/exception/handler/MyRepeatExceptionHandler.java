package org.lobo.spring.batch.exception.handler;

import org.springframework.batch.repeat.RepeatContext;
import org.springframework.batch.repeat.exception.ExceptionHandler;

public class MyRepeatExceptionHandler implements ExceptionHandler {

	@Override
	public void handleException(RepeatContext context, Throwable throwable)
			throws Throwable {
		System.out.println("Excepcion!!!!!!!... bueno, sigamos");
		
		
	}

}
