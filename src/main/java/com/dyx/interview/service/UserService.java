package com.dyx.interview.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.dyx.interview.model.entity.User;
import me.chanjar.weixin.common.bean.WxOAuth2UserInfo;


public interface UserService extends IService<User> {


}
