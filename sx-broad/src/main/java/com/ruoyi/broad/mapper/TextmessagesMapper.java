package com.ruoyi.broad.mapper;


import com.ruoyi.broad.domain.typenum;

import java.util.List;

public interface TextmessagesMapper {
    /**
     * 获取所有类型及数量和电话号码
     * @return
     */
    public List<typenum> selectTypeNum();
}
