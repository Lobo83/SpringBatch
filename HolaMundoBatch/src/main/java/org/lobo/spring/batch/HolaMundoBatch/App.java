package org.lobo.spring.batch.HolaMundoBatch;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String[] springConfig  = 
    		{	
    			"/spring/batch/jobs/job-hola-mundo.xml",
    			"/spring/batch/config/batchContext.xml",
    			"/spring/batch/config/batchStepsContext.xml",
    			"/spring/batch/config/dataBaseContext.xml"
    		};
    		
    	ApplicationContext context = 
    			new ClassPathXmlApplicationContext(springConfig);
    		
    	JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
    	Job job = (Job) context.getBean("holaMundo");

    	try {
    		//Si se hacen 2 ejecuciones identicas con los mismos parámetros Spring falla porque detecta una jobInstance ya ejecutada en estado COMPLETED
    		//pasando la fecha de ejecución, aunque no se use, se evita este problema 
    		JobParameters parameters = new JobParametersBuilder().addDate("fechaEjecucion", new Date()).toJobParameters();
    		JobExecution execution = jobLauncher.run(job, parameters);
    		System.out.println("Exit Status : " + execution.getStatus());

    	} catch (Exception e) {
    		e.printStackTrace();
    	}

    	System.out.println("Done");

    }
}
