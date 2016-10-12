/**
 * 
 */
package org.lobo.spring.batch.listener;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.repeat.RepeatContext;
import org.springframework.batch.repeat.RepeatListener;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * @author Lobo
 *
 */
public class MyRepeatListener implements RepeatListener {
	/*
	 * (non-Javadoc)
	 * @see org.springframework.batch.repeat.RepeatListener#before(org.springframework.batch.repeat.RepeatContext)
	 */
	@Override
	public void before(RepeatContext context) {
		System.out.println("antes de ejecutar una iteracion actualizar indice");
		Integer index=(Integer) context.getAttribute("index");
		context.setAttribute("index", index++);
	}
	/*
	 * (non-Javadoc)
	 * @see org.springframework.batch.repeat.RepeatListener#after(org.springframework.batch.repeat.RepeatContext, org.springframework.batch.repeat.RepeatStatus)
	 */
	@Override
	public void after(RepeatContext context, RepeatStatus result) {
		System.out.println("despues de ejecutar una iteracion");
		
	}
	/*
	 * (non-Javadoc)
	 * @see org.springframework.batch.repeat.RepeatListener#open(org.springframework.batch.repeat.RepeatContext)
	 */
	@Override
	public void open(RepeatContext context) {
		System.out.println("Preparando el cotarro");
		List<String> lista = new ArrayList<String>(5);
		for(int i=0; i<lista.size(); i++){
			lista.add(String.valueOf(i));
		}
		context.setAttribute("lista", lista);
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.batch.repeat.RepeatListener#onError(org.springframework.batch.repeat.RepeatContext, java.lang.Throwable)
	 */
	@Override
	public void onError(RepeatContext context, Throwable e) {
		System.out.println("ups la cagaste");
		
	}
	/*
	 * (non-Javadoc)
	 * @see org.springframework.batch.repeat.RepeatListener#close(org.springframework.batch.repeat.RepeatContext)
	 */
	@Override
	public void close(RepeatContext context) {
		System.out.println("se acabó");
		
	}

}
