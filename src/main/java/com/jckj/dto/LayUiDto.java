package com.jckj.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/18
 * @Description:接收到页面传回来的值 page，limit
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LayUiDto implements Serializable {

	private static final long serialVersionUID = 5172649115384573373L;

	/**
	 * 0
	 */
	private static final Integer ZERO = 0;
	/**
	 * 每页显示条数
	 */
	private Integer page ;

	/**
	 * 页码
	 */
	private Integer limit ;

	/**
	 * sql分页起始位置
	 */
	private Integer dataNum = ZERO;

	/**
	 * 排序 desc降序 asc升序
	 */
	private String sort;

	/**
	 * 状态
	 */
	private Integer state;
	/**
	 * 用户名称
	 */
	private String username;
	/**
	 * 用户电话
	 */
	private String userphone;
	/**
	 * 学员id
	 */
	private Integer id;
	/**
	 * 学员姓名
	 */
	private String childname;
	/**
	 * 学号
	 */
	private String studentnumber;
	/**
	 * 学员班级
	 */
	private String grade;
	/**
	 * 学员状态
	 */
	private String studentstate;
	/**
	 * 学员——显示
	 */
	private Integer isshow;
	/**
	 * 监护人id
	 */
	private Integer guardianid;
	/**
	 * 监护人姓名
	 */
	private String guardianname;
	/**
	 * 监护人电话
	 */
	private String guardianphone;
	/**
	 * @param page 页码
	 * @param limit 每页显示数
	 */
	public LayUiDto(Integer page, Integer limit) {
		if (page != null && page > ZERO) {
			this.page = page;
		}
		if (limit != null && limit > ZERO) {
			this.limit = limit;
		}
		this.dataNum = (this.page - 1) * this.limit;
	}

}
