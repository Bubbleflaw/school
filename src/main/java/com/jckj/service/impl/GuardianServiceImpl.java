package com.jckj.service.impl;

import com.jckj.dto.LayUiDto;
import com.jckj.mapper.GuardianMapper;
import com.jckj.model.Guardian;
import com.jckj.service.GuardianService;
import com.jckj.vo.MapVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/20
 * @Description:
 */
@Service
public class GuardianServiceImpl implements GuardianService {
    @Autowired
    private GuardianMapper guardianMapper;

    /**
     * 列表
     * @param dto
     * @return
     */
    @Override
    public MapVo list(LayUiDto dto) {
        Integer count = guardianMapper.count(dto);
        if(count==0){
            return MapVo.successPage();
        }
        List<Guardian> list = guardianMapper.list(dto);
        MapVo mapVo = MapVo.successPage(list, count);
        return mapVo;
    }

    /**
     * 详情
     * @param guardianid
     * @return
     */
    @Override
    public Guardian info(Integer guardianid) {
        Guardian guardian = guardianMapper.info(guardianid);
        return guardian;
    }

    /**
     * 详情s
     * @param guardianids
     * @return
     */
    @Override
    public Guardian infos(Integer[] guardianids) {
        Guardian guardian=null;
        for (Integer guardianid : guardianids) {
           guardian = guardianMapper.info(guardianid);
        }
        return guardian;
    }

    /**
     * 修改
     * @param guardian
     * @return
     */
    @Override
    public Integer update(Guardian guardian) {
        Integer update = guardianMapper.update(guardian);
        return update;
    }

    /**
     * 删除
     * @param guardianid
     * @return
     */
    @Override
    public Integer remove(Integer guardianid) {
        Integer remove = guardianMapper.remove(guardianid);
        return remove;
    }

    /**
     * 批量删除
     * @param guardianids
     * @return
     */
    @Override
    public Integer removeMore(Integer[] guardianids) {
        Integer remove=0;
        for (Integer id : guardianids) {
            remove = guardianMapper.remove(id);
        }
        return remove;
    }

    /**
     * 增加
     * @param guardian
     * @return
     */
    @Override
    public Integer add(Guardian guardian) {
        Integer add = guardianMapper.add(guardian);
        return add;
    }
}
