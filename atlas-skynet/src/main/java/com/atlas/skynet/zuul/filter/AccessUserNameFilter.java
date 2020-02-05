package com.atlas.skynet.zuul.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.atlas.model.ErrorCode;
import com.atlas.model.Result;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * @description 数据拦截示例,一般用于请求头的拦截,为了方便浏览器实验, 
 * 				暂时用普通参数方式,可以用POSTMAN更方便测试各种情况的拦截
 *              http://127.0.0.1/api/atlas/sayMyName?name=张三&authcode=10001
 *              http://127.0.0.1/api/atlas/getPort?authcode=10001
 * @className AccessUserNameFilter
 * @author anytron
 * @date 2020年2月6日上午3:26:26
 * @version 1.0
 */
public class AccessUserNameFilter extends ZuulFilter {

	private static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();

		logger.info(String.format("%s AccessUserNameFilter request to %s", request.getMethod(), request.getRequestURL().toString()));

		String authcode = request.getParameter("authcode");// 获取请求的参数
		if (StringUtils.isNotBlank(authcode)) {// 如果请求的参数不为空则通过
			ctx.setSendZuulResponse(true);// 对该请求进行路由
			ctx.setResponseStatusCode(200);
			ctx.set("isSuccess", true);// 设值，让下一个Filter看到上一个Filter的状态
			return null;
		} else {
			ctx.setSendZuulResponse(false);// 过滤该请求，不对其进行路由
			ctx.setResponseStatusCode(401);// 返回错误码
			Result<String> result = new Result<String>(ErrorCode.AUTH_ERROR);
			String resultStr = JSON.toJSONString(result);
			ctx.setResponseBody(resultStr);// 返回错误内容
			ctx.set("isSuccess", false);
			HttpServletResponse response = ctx.getResponse();
			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json; charset=UTF-8");
			return null;
		}
	}

	@Override
	public boolean shouldFilter() {
		return true;// 是否执行该过滤器，此处为true，说明需要过滤
	}

	@Override
	public int filterOrder() {
		return 0;// 优先级为0，数字越大，优先级越低
	}

	@Override
	public String filterType() {
		return "pre";// 前置过滤器
	}
}
