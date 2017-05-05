package com.gafur.task.dataarmor.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service
 *
 * @author igafurov
 * @since 04.05.2017
 */
@RemoteServiceRelativePath("exec")
public interface TaskService extends RemoteService {

	/**
	 * Take text and reverse it
	 *
	 * @param text input text
	 * @return reverse text
	 */
	String execServer(String text) throws IllegalArgumentException;
}
