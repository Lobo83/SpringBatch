package org.lobo.spring.batch.processor;

import org.lobo.spring.batch.dto.InputFieldSetDTO;
import org.lobo.spring.batch.dto.ProcessFieldSetDTO;
import org.springframework.batch.core.annotation.AfterProcess;
import org.springframework.batch.core.annotation.BeforeProcess;
import org.springframework.batch.item.ItemProcessor;

public class FileProcessor implements ItemProcessor<InputFieldSetDTO,ProcessFieldSetDTO> {

	

	public ProcessFieldSetDTO process(InputFieldSetDTO arg0) throws Exception {
		ProcessFieldSetDTO salida = new ProcessFieldSetDTO();
		salida.setSalida(arg0.toString());
		return salida;
	}
	
	@AfterProcess
	public void finProceso(InputFieldSetDTO in,ProcessFieldSetDTO out){
		System.out.println("finProceso dice que el input "+in+" se ha convertido en "+out);
	}
	@BeforeProcess
	void inicioProcessor(InputFieldSetDTO input){
		System.out.println("inicioProcessor dice que el input es "+input);
	}

}
