package com.jerseydemo.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.jerseydemo.vo.Employee;

@Path("/demouri")
public class DemoClass {

	@POST
	@Path("/sayHello")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED,MediaType.APPLICATION_XML})
	public Response sayHello(@Context HttpServletRequest req) throws Exception {

		final List<String> demoList = new ArrayList<String>();
		demoList.add("Demo 1");
		demoList.add("Demo 2");

		final Map<String, String> demoMap = new HashMap<String, String>();
		demoMap.put("key1", "Value 1");
		demoMap.put("key2", "Value 2");

		final Employee emp1 = new Employee();
		emp1.setEmployeeId(new Long(100));
		emp1.setFirstName("First Name");
		emp1.setLastName("Last Name");
		emp1.setDeptList(demoList);
		// Change what ever you want to send here as JSON.
		return Response.status(Status.OK).entity(emp1).build();
	}
}