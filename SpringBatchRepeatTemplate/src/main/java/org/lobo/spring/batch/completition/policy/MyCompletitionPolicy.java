package org.lobo.spring.batch.completition.policy;

import java.util.ArrayList;
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
	public RepeatContext start(RepeatContext context) {
		 
		List<String> lista = new ArrayList<String>(5);
		for(int i=0; i<5; i++){
			lista.add(String.valueOf(i));
		}
		context.setAttribute("lista", lista);
		context.setAttribute("index", currentIteration);
		return context;
	}

	@Override
	public void update(RepeatContext context) {
		context.setAttribute("index", currentIteration++);
		
	}

}
