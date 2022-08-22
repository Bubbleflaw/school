package com.jckj.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
    private Date birthday;
    /**
     * 学员性别:0-男生，1-女生
     */
    private Integer gender;
    /**
     *学员学号
     */
    private String studentNumber;
    /**
     * 班级
     */
    private String grade;
    /**
     * 状态（IN-已入园、OUT-已出园）
     */
    private String studentState;
    /**
     * 是否显示 0-否，1-是
     */
    private Integer isShow;
    /**
     * 是否删除 0-否，1-是
     */
    @TableLogic
    private Integer isDelete;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    public Student(Integer id, String childName, Date birthday, Integer gender, String studentNumber, String grade, String studentState, Integer isShow) {
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
