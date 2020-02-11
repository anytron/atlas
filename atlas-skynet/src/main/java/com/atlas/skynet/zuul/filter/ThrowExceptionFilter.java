package com.atlas.skynet.zuul.filter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.netflix.zuul.ZuulFilter;

public class ThrowExceptionFilter extends ZuulFilter {

	private static Logger logger = LogManager.getLogger(ThrowExceptionFilter.class);

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		logger.info("This is a pre filter, it will throw a RuntimeException");
		return null;
	}

}
