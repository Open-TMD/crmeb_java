package com.zbkj.crmeb.front.service;

import com.zbkj.crmeb.front.request.LoginMobileRequest;
import com.zbkj.crmeb.front.request.LoginRequest;
import com.zbkj.crmeb.front.response.LoginResponse;

/**
 * 移动端登录服务类
 * +----------------------------------------------------------------------
 * | CRMEB [ CRMEB赋能开发者，助力企业发展 ]
 * +----------------------------------------------------------------------
 * | Copyright (c) 2016~2020 https://www.crmeb.com All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed CRMEB并不是自由软件，未经许可不能去掉CRMEB相关版权
 * +----------------------------------------------------------------------
 * | Author: CRMEB Team <admin@crmeb.com>
 * +----------------------------------------------------------------------
 */
public interface LoginService {

    /**
     * 账号密码登录
     * @return LoginResponse
     */
    LoginResponse login(LoginRequest loginRequest) throws Exception;

    /**
     * 手机号验证码登录
     */
    LoginResponse phoneLogin(LoginMobileRequest loginRequest, String clientIp) throws Exception;
}
