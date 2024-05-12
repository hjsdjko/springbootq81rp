package com.entity.vo;

import com.entity.JiuzhenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 就诊信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
public class JiuzhenxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医院地址
	 */
	
	private String yiyuandizhi;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 相片
	 */
	
	private String xiangpian;
		
	/**
	 * 职位
	 */
	
	private String zhiwei;
		
	/**
	 * 挂号费
	 */
	
	private String guahaofei;
		
	/**
	 * 科室名称
	 */
	
	private String keshimingcheng;
		
	/**
	 * 就诊时间
	 */
	
	private String jiuzhenshijian;
		
	/**
	 * 医生简介
	 */
	
	private String yishengjianjie;
				
	
	/**
	 * 设置：医院地址
	 */
	 
	public void setYiyuandizhi(String yiyuandizhi) {
		this.yiyuandizhi = yiyuandizhi;
	}
	
	/**
	 * 获取：医院地址
	 */
	public String getYiyuandizhi() {
		return yiyuandizhi;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：相片
	 */
	 
	public void setXiangpian(String xiangpian) {
		this.xiangpian = xiangpian;
	}
	
	/**
	 * 获取：相片
	 */
	public String getXiangpian() {
		return xiangpian;
	}
				
	
	/**
	 * 设置：职位
	 */
	 
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
				
	
	/**
	 * 设置：挂号费
	 */
	 
	public void setGuahaofei(String guahaofei) {
		this.guahaofei = guahaofei;
	}
	
	/**
	 * 获取：挂号费
	 */
	public String getGuahaofei() {
		return guahaofei;
	}
				
	
	/**
	 * 设置：科室名称
	 */
	 
	public void setKeshimingcheng(String keshimingcheng) {
		this.keshimingcheng = keshimingcheng;
	}
	
	/**
	 * 获取：科室名称
	 */
	public String getKeshimingcheng() {
		return keshimingcheng;
	}
				
	
	/**
	 * 设置：就诊时间
	 */
	 
	public void setJiuzhenshijian(String jiuzhenshijian) {
		this.jiuzhenshijian = jiuzhenshijian;
	}
	
	/**
	 * 获取：就诊时间
	 */
	public String getJiuzhenshijian() {
		return jiuzhenshijian;
	}
				
	
	/**
	 * 设置：医生简介
	 */
	 
	public void setYishengjianjie(String yishengjianjie) {
		this.yishengjianjie = yishengjianjie;
	}
	
	/**
	 * 获取：医生简介
	 */
	public String getYishengjianjie() {
		return yishengjianjie;
	}
			
}
