package com.showshine.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 
 * 版权所有：2015-GRGBANKING
 * 项目名称：camara   
 *
 * 类描述：
 * 类名称：com.showshine.interceptor.AuthorityInterceptor     
 * 创建人：WSH
 * 创建时间：2015年9月22日 下午1:16:11   
 * 修改人：
 * 修改时间：2015年9月22日 下午1:16:11   
 * 修改备注：   
 * @version   V1.0
 */
public class AuthorityInterceptor extends HandlerInterceptorAdapter  {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }
}
