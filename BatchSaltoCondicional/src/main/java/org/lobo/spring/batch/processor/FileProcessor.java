package org.lobo.spring.batch.processor;

import org.lobo.spring.batch.dto.InputFieldSetDTO;
import org.lobo.spring.batch.dto.ProcessFieldSetDTO;
import org.springframework.batch.core.annotation.AfterProcess;
import org.springframework.batch.core.annotation.BeforeProcess;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;

public class FileProcessor implements ItemProcessor<InputFieldSetDTO,ProcessFieldSetDTO> {

	
	private String fallar;
	
	public String getFallar() {
		return this.fallar;
	}

	@Value("#{jobParameters['fallar']}")
	public void setFallar(String fallar) {
		this.fallar = fallar;
	}

	public ProcessFieldSetDTO process(InputFieldSetDTO arg0) throws Exception {
		if("si".equals(this.fallar)){
			throw new Exception("capuuuuut");
		}
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
