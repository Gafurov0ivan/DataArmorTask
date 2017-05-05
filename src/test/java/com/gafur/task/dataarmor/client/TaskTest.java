package com.gafur.task.dataarmor.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

/**
 * Test servlet request and response
 *
 * @author igafurov
 * @since 04.05.2017
 */
public class TaskTest extends GWTTestCase {

	/**
	 * Must refer to a valid module that sources this class.
	 */
	public String getModuleName() {
		return "com.gafur.task.dataarmor.TaskJUnit";
	}

	/**
	 * This test will send a request to the server using the execServer method
	 * in TaskService and verify the response
	 */
	public void testExecutingService() {
		// Create the service that we will test.
		TaskServiceAsync executingService = GWT.create(TaskService.class);
		ServiceDefTarget target = (ServiceDefTarget) executingService;
		target.setServiceEntryPoint(GWT.getModuleBaseURL() + "task/exec");

		// Send a request to the server.
		executingService.execServer("A man, a plan, a canal: Panama", new AsyncCallback<String>() {

			public void onFailure(Throwable caught) {
				fail("Request failure: " + caught.getMessage());
			}

			public void onSuccess(String result) {
				assertTrue(result.startsWith("amanaP :lanac a ,nalp a ,nam A"));
				finishTest();
			}
		});
	}
}
