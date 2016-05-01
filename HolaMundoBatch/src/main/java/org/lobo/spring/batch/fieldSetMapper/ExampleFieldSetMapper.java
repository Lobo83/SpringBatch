package org.lobo.spring.batch.fieldSetMapper;

import org.lobo.spring.batch.dto.InputFieldSetDTO;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class ExampleFieldSetMapper implements FieldSetMapper<InputFieldSetDTO> {

	
	public InputFieldSetDTO mapFieldSet(FieldSet arg0) throws BindException {
		InputFieldSetDTO salida = new InputFieldSetDTO();
		salida.setCampo(arg0.readString(0));
		salida.setValor(arg0.readString(1));
		return salida;
	}

}
