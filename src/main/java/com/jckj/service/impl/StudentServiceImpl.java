package com.jckj.service.impl;

import com.jckj.dto.LayUiDto;
import com.jckj.mapper.StudentMapper;
import com.jckj.mapper.UsersMapper;
import com.jckj.model.Student;
import com.jckj.model.Users;
import com.jckj.service.StudentService;
import com.jckj.service.UsersService;
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
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 列表
     * @param dto
     * @return
     */
    @Override
    public MapVo list(LayUiDto dto) {
        Integer count = studentMapper.count(dto);
        if(count==0){
            return MapVo.successPage();
        }
        List<Student> list = studentMapper.list(dto);
        MapVo mapVo = MapVo.successPage(list, count);
        return mapVo;
    }

    /**
     * 详情
     * @param id
     * @return
     */
    @Override
    public Student info(Integer id) {
        Student student = studentMapper.info(id);
        return student;
    }

    /**
     * 详情s
     * @param ids
     * @return
     */
    @Override
    public Student infos(Integer[] ids) {
        Student student=null;
        for (Integer id : ids) {
           student = studentMapper.info(id);
        }
        return student;
    }

    /**
     * 修改
     * @param student
     * @return
     */
    @Override
    public Integer update(Student student) {
        Integer update = studentMapper.update(student);
        return update;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public Integer remove(Integer id) {
        Integer remove = studentMapper.remove(id);
        return remove;
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @Override
    public Integer removeMore(Integer[] ids) {
        Integer remove=0;
        for (Integer id : ids) {
            remove = studentMapper.remove(id);
        }
        return remove;
    }

    /**
     * 增加
     * @param student
     * @return
     */
    @Override
    public Integer add(Student student) {
        Integer add = studentMapper.add(student);
        return add;
    }
}
