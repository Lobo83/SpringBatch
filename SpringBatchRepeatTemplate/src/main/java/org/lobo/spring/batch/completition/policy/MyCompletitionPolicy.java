package org.lobo.spring.batch.completition.policy;

import java.util.List;

import org.springframework.batch.repeat.CompletionPolicy;
import org.springframework.batch.repeat.RepeatContext;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * 
 * @author Lobo
 *
 */
public class MyCompletitionPolicy implements CompletionPolicy {

	private int repetitions;
	private int currentIteration;
	public MyCompletitionPolicy(int numberOfRepetitions){
		this.repetitions=numberOfRepetitions;
		currentIteration=0;
	}
	@Override
	public boolean isComplete(RepeatContext context, RepeatStatus result) {
		
		return !result.isContinuable();
	}

	@Override
	public boolean isComplete(RepeatContext context) {
		
		boolean complete=false;
		if(currentIteration>=this.repetitions){
			complete=true;
		}
		return complete;
	}

	@Override
	public RepeatContext start(RepeatContext parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(RepeatContext context) {
		currentIteration++;
		
	}

}
