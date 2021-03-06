package org.lobo.spring.batch.template;

import java.util.List;

import org.springframework.batch.repeat.RepeatCallback;
import org.springframework.batch.repeat.RepeatContext;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * 
 * @author Lobo
 *
 */
public class MyRepeatCallback implements RepeatCallback {

	@Override
	public RepeatStatus doInIteration(RepeatContext context) throws Exception {
		RepeatStatus result;
		List<String> lista = (List<String>) context.getAttribute("lista");
		Integer index=(Integer) context.getAttribute("index");
		double numero=Math.random();
		if(numero>0.80d){
			throw new Exception("solo por fastidiar y probar el exception handler");
		}
		if(index<lista.size()){
			System.out.println(String.format("posicion %s de la lista vale %s ",index,lista.get(index)));
			result=RepeatStatus.CONTINUABLE;
		}else{
			System.out.println("SACABOOOOOOOO");
			result=RepeatStatus.FINISHED;
		}
		return result;
	}

}
