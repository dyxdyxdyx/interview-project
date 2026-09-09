package com.dyx.interview.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dyx.interview.model.entity.Question;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface QuestionMapper extends BaseMapper<Question> {


    @Select("select * from question where updateTime >= #{minUpdateTime}")
    List<Question> listQuestionWithDelete(Date minUpdateTime);
}




