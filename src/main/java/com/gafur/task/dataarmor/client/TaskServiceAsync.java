package com.gafur.task.dataarmor.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of TaskService
 *
 * @author igafurov
 * @since 04.05.2017
 */
public interface TaskServiceAsync {
	void execServer(String input, AsyncCallback<String> callback) throws IllegalArgumentException;
}
