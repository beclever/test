package com.showshine.dao;

import com.showshine.model.UserEntity;

/**
 * 
 * 版权所有：2015-GRGBANKING
 * 项目名称：camara   
 *
 * 类描述：
 * 类名称：com.showshine.dao.IUserDao     
 * 创建人：showshine
 * 创建时间：2015年9月17日 上午10:35:05   
 * 修改人：
 * 修改时间：2015年9月17日 上午10:35:05   
 * 修改备注：   
 * @version   V1.0
 */
public interface IUserDao {
    public boolean isExist(UserEntity user);
}
