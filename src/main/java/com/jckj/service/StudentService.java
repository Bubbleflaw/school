package com.jckj.service;

import com.jckj.dto.LayUiDto;
import com.jckj.model.Student;
import com.jckj.vo.MapVo;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/20
 * @Description:
 */
public interface StudentService {
    /**
     * 列表
     */
    MapVo list(LayUiDto dto);
    /**
     * 详情
     */
    Student info(Integer id);
    /**
     * 详情s
     */
    Student infos(Integer[] ids);
    /**
     * 修改
     */
    Integer update(Student student);
    /**
     * 删除
     */
    Integer remove(Integer id);
    /**
     * 批量删除
     */
    Integer removeMore(Integer[] ids);
    /**
     * 增加
     */
    Integer add(Student student);
}
