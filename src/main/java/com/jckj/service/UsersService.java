package com.jckj.service;

import com.jckj.dto.LayUiDto;
import com.jckj.model.Users;
import com.jckj.vo.MapVo;
import com.jckj.vo.PageVo;

import java.util.Map;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/18
 * @Description:
 */
public interface UsersService {
    /**
     * 列表
     */
    MapVo list(LayUiDto dto);
//     Map<String,Object> list(LayUiDto dto);
    /**
     * 详情
     */
    Users info(Integer userid);
    /**
     * 详情s
     */
    Users infos(Integer[] userid);
    /**
     * 修改
     */
    Integer update(Users users);
    /**
     * 删除
     */
    Integer remove(Integer userid);
    /**
     * 批量删除
     */
    Integer removeMore(Integer[] userids);
}
