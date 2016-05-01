package org.lobo.spring.batch.lineAggregator;

import org.lobo.spring.batch.dto.ProcessFieldSetDTO;
import org.springframework.batch.item.file.transform.LineAggregator;

public class ExampleLineAggregator implements LineAggregator <ProcessFieldSetDTO>{

	

	public String aggregate(ProcessFieldSetDTO arg0) {
		
		return arg0.getSalida();
	}

}
