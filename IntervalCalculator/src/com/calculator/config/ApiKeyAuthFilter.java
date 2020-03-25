package com.calculator.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

public class ApiKeyAuthFilter extends AbstractPreAuthenticatedProcessingFilter{

	private String requestHeader;
	
	public ApiKeyAuthFilter(String requestHeader) {
		super();
		this.requestHeader = requestHeader;
	}

	@Override
	protected Object getPreAuthenticatedPrincipal(HttpServletRequest request) {
		return request.getHeader(requestHeader);
	}

	@Override
	protected Object getPreAuthenticatedCredentials(HttpServletRequest request) {
		return "";
	}

}
