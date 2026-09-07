package com.dyx.interview.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dyx.interview.model.dto.questionBank.QuestionBankQueryRequest;
import com.dyx.interview.model.entity.QuestionBank;


import javax.servlet.http.HttpServletRequest;


public interface QuestionBankService extends IService<QuestionBank> {

}
