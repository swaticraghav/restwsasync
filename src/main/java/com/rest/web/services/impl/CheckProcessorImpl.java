package com.rest.web.services.impl;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.container.AsyncResponse;

import org.springframework.stereotype.Service;

import com.rest.web.services.interfaces.CheckProcessor;
import com.rest.web.services.model.ChecksList;

@Service
public class CheckProcessorImpl implements CheckProcessor {

	@Override
	public void processChecks(AsyncResponse response, ChecksList checksList) {
		// logic to process check
		new Thread() {
			public void run() {
				if(checksList == null || checksList.getChecks() == null || checksList.getChecks().size() == 0) {
					response.resume(new BadRequestException());
				}
				response.resume(true);
			}
		}.start();
	}

}
