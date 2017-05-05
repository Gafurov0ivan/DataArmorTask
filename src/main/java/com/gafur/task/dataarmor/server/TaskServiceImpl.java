package com.gafur.task.dataarmor.server;

import com.gafur.task.dataarmor.client.TaskService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service
 *
 * @author igafurov
 * @since 04.05.2017
 */
@SuppressWarnings("serial")
public class TaskServiceImpl extends RemoteServiceServlet implements TaskService {

	public String execServer(String input) throws IllegalArgumentException {
		input = escapeHtml(input);
		String reverseString = new StringBuilder(input).reverse().toString();
		return reverseString;
	}

	/**
	 * Escape an html string. Escaping data received from the client helps to
	 * prevent cross-site script vulnerabilities.
	 * 
	 * @param html string to escape
	 * @return the escaped string
	 */
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
	}
}
