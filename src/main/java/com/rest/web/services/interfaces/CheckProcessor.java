package com.rest.web.services.interfaces;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

import com.rest.web.services.model.ChecksList;

@Path("/checkprocessingservice")
public interface CheckProcessor {

	@Path("/checks")
	@POST
	public void processChecks(@Suspended AsyncResponse reponse ,ChecksList checksList);
}
