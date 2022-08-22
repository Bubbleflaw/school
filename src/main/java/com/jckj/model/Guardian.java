package com.jckj.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/21
 * @Description:家长表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_guardian_info")
public class Guardian {
//    @TableId("id")
    private Integer guardianid;
//    @TableField("guardian_name")
    private String guardianname;
//    @TableField("guardian_phone")
    private String guardianphone;
//    @TableField("is_show")
    private Integer isshow;
//    @TableField("is_delete")
    @TableLogic
    private Integer isdelete;
    @TableField(fill = FieldFill.INSERT)
    private Date createtime;
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    private Date updatetime;

    public Guardian(Integer guardianid, String guardianname, String guardianphone, Integer isshow) {
        this.guardianid = guardianid;
        this.guardianname = guardianname;
        this.guardianphone = guardianphone;
        this.isshow = isshow;
    }
}
