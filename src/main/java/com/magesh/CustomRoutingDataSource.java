package com.magesh;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class CustomRoutingDataSource extends AbstractRoutingDataSource {
	@Override
	protected Object determineCurrentLookupKey() {
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes(); // get request object
		if (attr != null) {
			String cId = attr.getRequest().getParameter("contactId"); // find parameter from request
			return cId;
		} else {
			return "contactId1"; // default data source
		}
	}
}