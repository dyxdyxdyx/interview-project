package com.dyx.interview.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dyx.interview.model.dto.question.QuestionQueryRequest;
import com.dyx.interview.model.entity.Question;


import javax.servlet.http.HttpServletRequest;


public interface QuestionService extends IService<Question> {

}
