package org.lobo.spring.batch.processor;

import org.lobo.spring.batch.dto.InputFieldSetDTO;
import org.lobo.spring.batch.dto.ProcessFieldSetDTO;
import org.springframework.batch.item.ItemProcessor;

public class FileProcessor implements ItemProcessor<InputFieldSetDTO,ProcessFieldSetDTO> {

	

	public ProcessFieldSetDTO process(InputFieldSetDTO arg0) throws Exception {
		ProcessFieldSetDTO salida = new ProcessFieldSetDTO();
		salida.setSalida(arg0.toString());
		return salida;
	}

}
