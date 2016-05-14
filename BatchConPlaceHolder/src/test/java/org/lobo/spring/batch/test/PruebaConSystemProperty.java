package org.lobo.spring.batch.test;



import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring/batch/jobs/job-hola-mundo.xml",
		"/spring/batch/config/batchContext.xml",
		"/spring/batch/config/batchStepsContext.xml",
		"/spring/batch/config/batchStepsContextConSystemProperty.xml",
		"/spring/batch/config/dataBaseContext.xml" })
public class PruebaConSystemProperty {
    @Autowired
	private JobLauncher jobLauncher;
    @Autowired
	private Job job;

	@Test
    public void testApp()
    {
		
    	try {

    		JobParameters parameters = new JobParametersBuilder().addDate("fechaEjecucion", new Date()).toJobParameters();
    		JobExecution execution = jobLauncher.run(job, parameters);
    		System.out.println("Exit Status : " + execution.getStatus());

    	} catch (Exception e) {
    		e.printStackTrace();
    	}

    }
}