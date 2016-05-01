package org.lobo.spring.batch.listeners;

import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;

public class MyChunkListener implements ChunkListener {

	public void afterChunk(ChunkContext arg0) {
		System.out.println(String.format("Se finaliza el chunk con datos: \nnombre del job --> %s, estado del step --> %s",arg0.getStepContext().getJobName(),arg0.getStepContext().getStepExecution().getExitStatus().getExitCode()));
		
	}

	public void afterChunkError(ChunkContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeChunk(ChunkContext arg0) {
		System.out.println(String.format("Se inicia el chunk con datos: \nnombre del job --> %s, estado del step --> %s",arg0.getStepContext().getJobName(),arg0.getStepContext().getStepExecution().getExitStatus().getExitCode()));
		
	}

}
