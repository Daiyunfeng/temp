package pers.hjc.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import pers.hjc.util.RequestUtil;

/**
 * 拦截全部
 * @author Administrator
 */
public class AuthInterceptor implements HandlerInterceptor {
	
	/**
	 * 完成页面的render后调用
	 */
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object object, Exception exception)
			throws Exception {
	}

	/**
	 * 在调用controller具体方法后拦截
	 */
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object object,
			ModelAndView modelAndView) throws Exception {
	}

	/**
	 * 在调用controller具体方法前拦截
	 */
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object object) throws Exception {
		//HttpSession session = request.getSession();
		String requestPath = RequestUtil.getRequestPath(request);
		System.out.println(requestPath);
		request.setAttribute("ctx", request.getContextPath() + "/");
		
		return true;
	}
}
