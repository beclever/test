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
        // TODO Auto-generated method stub
       /* String path = request.getServletPath();
        String code = request.getParameter("code");
        if (LoginUser.getSessionUser() == null) {

            if (path.startsWith("/cp/ouath") && StringUtils.isEmpty(code)) {
                // 重定向网页授权
                logger.info("当前请求地址【" + request.getContextPath() + path + "】需要获取用户信息，系统重定向获取CODE");
                String url = Wechat.getInstance().getWxCpService()
                        .oauth2buildAuthorizationUrl(PathKit.getWebPath() + path, "STATE");
                response.sendRedirect(url);
                return false;
            } else if (path.startsWith("/cp/ouath") && StringUtils.isNotEmpty(code)) {
                // 获取用户信息并保存到session
                String[] res = Wechat.getInstance().getWxCpService().oauth2getUserInfo(code);
                String loginName = res[0];// drhua帐号
                String deviceId = res[1];// 设备ID
                // 根据帐号获取权限
                DeviceService deviceService = (DeviceService) SpringContextUtil.getBean("deviceService");
                Device device = deviceService.findDevice(loginName, deviceId);

                if (device == null) {
                    device = new Device();
                    device.setDeviceId(deviceId);
                    device.setLoginName(loginName);
                    deviceService.insert(device);
                    // 设备未授权
                    logger.info("当前用户【" + loginName + "】设备未授权");
                    response.sendRedirect(request.getContextPath() + "/norights.do");
                    return false;
                } else {
                    if (device.getStatus() != 0) {
                        // 设备未授权
                        logger.info("当前用户【" + loginName + "】设备未授权");
                        response.sendRedirect(request.getContextPath() + "/norights.do");
                        return false;
                    }
                }
                // 存取用户信息
                if(PropUtils.getBoolean("isDebug",false)){
                    loginName=PropUtils.get("engineer", "drhua");
                    logger.info("DEBUG模式，模拟【" + loginName + "】数据");
                }
                WxUserService wxUserService = (WxUserService) SpringContextUtil.getBean("wxUserService");
                WxUser wxUser = wxUserService.getUserInfo(loginName);
                wxUser.setDevice(deviceId);
                logger.info("保存当前用户【" + loginName + "】信息");
                request.getSession().setAttribute(Consts.SESSION_USER, wxUser);
            }
        }
        // 验证用户权限及session
        WxUser wxUser = LoginUser.getSessionUser();
        if (wxUser == null) {
            // 用户会话超时或未登录
            logger.error("用户会话Session已过期，请重新登录");
            response.sendRedirect(request.getContextPath() + "/noSession.do");
            return false;
        } else {
            // 验证权限
            boolean flag = true;// 是否有权限
            if (!flag) {
                // 用户没有权限
                return false;
            } else {
                WxJsapiSignature wxJsapiSignature = Wechat.getInstance().getWxCpService()
                        .createJsapiSignature(PathKit.getWebPath() + UrlKit.getRequestURL(request));
                request.setAttribute("jsSign", wxJsapiSignature);
                logger.info("jsapiticket:"+Wechat.getInstance().getWxCpInMemoryConfigStorage().getJsapiTicket()+'\n'+
                        "Noncestr:"+wxJsapiSignature.getNoncestr()+'\n'+
                        "URL:"+wxJsapiSignature.getUrl()+'\n'+
                        "Signature:"+wxJsapiSignature.getSignature()+'\n'+
                        "Timestamp:"+wxJsapiSignature.getTimestamp());
                request.setAttribute("corpId", Wechat.getInstance().getWxCpInMemoryConfigStorage().getCorpId());
                return true;
            }
        }*/
    }
}
