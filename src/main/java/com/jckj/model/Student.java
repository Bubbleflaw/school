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
    private Integer id;
//    @TableId("child_name")
    private String childname;
    private Long birthday;
    private Integer gender;
//    @TableField("student_number")
    private String studentnumber;
    private String grade;
//    @TableField("state")
    private String studentstate;
//    @TableField("is_show")
    private Integer isshow;
    @TableLogic
//    @TableField("is_delete")
    private Integer isdelete;
    @TableField(fill = FieldFill.INSERT)
    private Long createtime;
    @TableField(fill = FieldFill.UPDATE)
    private Long updatetime;

    public Student(Integer id, String childname, Long birthday, Integer gender, String studentnumber, String grade, String studentstate, Integer isshow) {
        this.id = id;
        this.childname = childname;
        this.birthday = birthday;
        this.gender = gender;
        this.studentnumber = studentnumber;
        this.grade = grade;
        this.studentstate = studentstate;
        this.isshow = isshow;
    }

}
