package org.lobo.spring.batch.listeners;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class MyStepListener implements StepExecutionListener  {

	public void beforeStep(StepExecution stepExecution) {
		// TODO Auto-generated method stub
		
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		System.out.println(String.format("Se finaliza el step con datos: \nnombre del step --> %s, estado del step --> %s",stepExecution.getStepName(),stepExecution.getStatus()));
		
		return stepExecution.getExitStatus();
	}

}
