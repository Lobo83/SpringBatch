/**
 * 
 */
package org.lobo.spring.batch.listener;

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
		System.out.println(String.format("antes de ejecutar la iteracion %s",context.getAttribute("index")));

	}
	/*
	 * (non-Javadoc)
	 * @see org.springframework.batch.repeat.RepeatListener#after(org.springframework.batch.repeat.RepeatContext, org.springframework.batch.repeat.RepeatStatus)
	 */
	@Override
	public void after(RepeatContext context, RepeatStatus result) {
		System.out.println(String.format("despues de ejecutar la iteracion %s",context.getAttribute("index")));
	}
	/*
	 * (non-Javadoc)
	 * @see org.springframework.batch.repeat.RepeatListener#open(org.springframework.batch.repeat.RepeatContext)
	 */
	@Override
	public void open(RepeatContext context) {
		System.out.println("Preparando el cotarro");
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
