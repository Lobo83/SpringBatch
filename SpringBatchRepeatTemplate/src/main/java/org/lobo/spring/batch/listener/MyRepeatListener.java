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

	@Override
	public void before(RepeatContext context) {
		System.out.println("antes de ejecutar");
		
	}

	@Override
	public void after(RepeatContext context, RepeatStatus result) {
		System.out.println("despues de ejecutar");
		
	}

	@Override
	public void open(RepeatContext context) {
		System.out.println("no se qué es");
		
	}

	@Override
	public void onError(RepeatContext context, Throwable e) {
		System.out.println("ups la cagaste");
		
	}

	@Override
	public void close(RepeatContext context) {
		System.out.println("se acabó");
		
	}

}
