package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 书城
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 17:26:39
 */
@TableName("shucheng")
public class ShuchengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShuchengEntity() {
		
	}
	
	public ShuchengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 书籍名称
	 */
					
	private String shujimingcheng;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 分类
	 */
					
	private String fenlei;
	
	/**
	 * 字数
	 */
					
	private String zishu;
	
	/**
	 * 章节数
	 */
					
	private String zhangjieshu;
	
	/**
	 * 作者
	 */
					
	private String zuozhe;
	
	/**
	 * 价格
	 */
					
	private String jiage;
	
	/**
	 * 上架日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shangjiariqi;
	
	/**
	 * 是否完结
	 */
					
	private String shifouwanjie;
	
	/**
	 * 简介
	 */
					
	private String jianjie;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：书籍名称
	 */
	public void setShujimingcheng(String shujimingcheng) {
		this.shujimingcheng = shujimingcheng;
	}
	/**
	 * 获取：书籍名称
	 */
	public String getShujimingcheng() {
		return shujimingcheng;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：分类
	 */
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
	/**
	 * 设置：字数
	 */
	public void setZishu(String zishu) {
		this.zishu = zishu;
	}
	/**
	 * 获取：字数
	 */
	public String getZishu() {
		return zishu;
	}
	/**
	 * 设置：章节数
	 */
	public void setZhangjieshu(String zhangjieshu) {
		this.zhangjieshu = zhangjieshu;
	}
	/**
	 * 获取：章节数
	 */
	public String getZhangjieshu() {
		return zhangjieshu;
	}
	/**
	 * 设置：作者
	 */
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	/**
	 * 获取：作者
	 */
	public String getZuozhe() {
		return zuozhe;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}
	/**
	 * 设置：上架日期
	 */
	public void setShangjiariqi(Date shangjiariqi) {
		this.shangjiariqi = shangjiariqi;
	}
	/**
	 * 获取：上架日期
	 */
	public Date getShangjiariqi() {
		return shangjiariqi;
	}
	/**
	 * 设置：是否完结
	 */
	public void setShifouwanjie(String shifouwanjie) {
		this.shifouwanjie = shifouwanjie;
	}
	/**
	 * 获取：是否完结
	 */
	public String getShifouwanjie() {
		return shifouwanjie;
	}
	/**
	 * 设置：简介
	 */
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}

}
