package org.lobo.spring.batch.tasklets;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TaskletKO implements Tasklet{

	public RepeatStatus execute(StepContribution contribution,
			ChunkContext chunkContext) throws Exception {
		System.out.println("OOOOoops algo fue mal");
		return RepeatStatus.FINISHED;//esto indica al framework que la tarea ha terminado bien
	}

}
