package org.lobo.spring.batch.step;

import org.lobo.spring.batch.completition.policy.MyCompletitionPolicy;
import org.lobo.spring.batch.template.MyRepeatCallback;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.batch.repeat.support.RepeatTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class StepRepeatTemplate implements Tasklet{
	@Autowired
	private MyRepeatCallback callback;
	@Override
	public RepeatStatus execute(StepContribution contribution,
			ChunkContext chunkContext) throws Exception {
		RepeatTemplate repeatTemplate = new RepeatTemplate();
		
		repeatTemplate.setCompletionPolicy(new MyCompletitionPolicy(5));
		
		return repeatTemplate.iterate(callback);
	}

}
