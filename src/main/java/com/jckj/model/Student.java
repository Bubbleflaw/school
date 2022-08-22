package com.jckj.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/20
 * @Description:学员管理
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    /**
     * 学员id
     */
    private Integer id;
    /**
     * 学员姓名
     */
    private String childName;
    /**
     * 学员生日
     */
    private Long birthday;
    /**
     * 学员性别:0-男生，1-女生
     */
    private Integer gender;
    /**
     *
     */
    private String studentNumber;
    private String grade;
    private String studentState;
    private Integer isShow;
    @TableLogic
    private Integer isDelete;
    @TableField(fill = FieldFill.INSERT)
    private Long createTime;
    @TableField(fill = FieldFill.UPDATE)
    private Long updateTime;

    public Student(Integer id, String childName, Long birthday, Integer gender, String studentNumber, String grade, String studentState, Integer isShow) {
        this.id = id;
        this.childName = childName;
        this.birthday = birthday;
        this.gender = gender;
        this.studentNumber = studentNumber;
        this.grade = grade;
        this.studentState = studentState;
        this.isShow = isShow;
    }
}
