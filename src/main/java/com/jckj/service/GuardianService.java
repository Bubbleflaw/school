package com.jckj.service;

import com.jckj.dto.LayUiDto;
import com.jckj.model.Guardian;
import com.jckj.model.Student;
import com.jckj.vo.MapVo;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/20
 * @Description:
 */
public interface GuardianService {
    /**
     * 列表
     */
    MapVo list(LayUiDto dto);
    /**
     * 详情
     */
    Guardian info(Integer guardianid);
    /**
     * 详情s
     */
    Guardian infos(Integer[] guardianids);
    /**
     * 修改
     */
    Integer update(Guardian guardian);
    /**
     * 删除
     */
    Integer remove(Integer guardianid);
    /**
     * 批量删除
     */
    Integer removeMore(Integer[] guardianids);
    /**
     * 增加
     */
    Integer add(Guardian guardian);
}
