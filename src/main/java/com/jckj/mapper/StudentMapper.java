package com.jckj.mapper;

import com.jckj.dto.LayUiDto;

import com.jckj.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/20
 * @Description:student表的mapper
 */
@Repository
public interface StudentMapper {
    /**
     * 列表+查询
     * @param dto
     * @return
     */
    List<Student> list(LayUiDto dto);

    /**
     * 列表总数
     */
    Integer count(LayUiDto dto);
    /**
     * 详情--根据id查
     */
    Student info(Integer id);
    /**
     * 修改
     */
    Integer update(Student student);
    /**
     * 删除
     */
    Integer remove(Integer id);
    /**
     * 增加
     */
    Integer add(Student student);
}
