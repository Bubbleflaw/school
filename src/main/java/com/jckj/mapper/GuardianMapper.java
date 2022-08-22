package com.jckj.mapper;

import com.jckj.dto.LayUiDto;
import com.jckj.model.Guardian;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/20
 * @Description:家长表的mapper
 */
@Repository
public interface GuardianMapper {
    /**
     * 列表+查询
     * @param dto
     * @return
     */
    List<Guardian> list(LayUiDto dto);

    /**
     * 列表总数
     */
    Integer count(LayUiDto dto);
    /**
     * 详情--根据id查
     */
    Guardian info(Integer guardianid);
    /**
     * 修改
     */
    Integer update(Guardian guardian);
    /**
     * 删除
     */
    Integer remove(Integer guardianid);
    /**
     * 增加
     */
    Integer add(Guardian guardian);
}
