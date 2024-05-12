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
 * 费用信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
@TableName("feiyongxinxi")
public class FeiyongxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FeiyongxinxiEntity() {
		
	}
	
	public FeiyongxinxiEntity(T t) {
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
	 * 费用编号
	 */
					
	private String feiyongbianhao;
	
	/**
	 * 费用名称
	 */
					
	private String feiyongmingcheng;
	
	/**
	 * 费用分类
	 */
					
	private String feiyongfenlei;
	
	/**
	 * 费用金额
	 */
					
	private Float feiyongjine;
	
	/**
	 * 费用凭证
	 */
					
	private String feiyongpingzheng;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 费用内容
	 */
					
	private String feiyongneirong;
	
	/**
	 * 发送日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fasongriqi;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：费用编号
	 */
	public void setFeiyongbianhao(String feiyongbianhao) {
		this.feiyongbianhao = feiyongbianhao;
	}
	/**
	 * 获取：费用编号
	 */
	public String getFeiyongbianhao() {
		return feiyongbianhao;
	}
	/**
	 * 设置：费用名称
	 */
	public void setFeiyongmingcheng(String feiyongmingcheng) {
		this.feiyongmingcheng = feiyongmingcheng;
	}
	/**
	 * 获取：费用名称
	 */
	public String getFeiyongmingcheng() {
		return feiyongmingcheng;
	}
	/**
	 * 设置：费用分类
	 */
	public void setFeiyongfenlei(String feiyongfenlei) {
		this.feiyongfenlei = feiyongfenlei;
	}
	/**
	 * 获取：费用分类
	 */
	public String getFeiyongfenlei() {
		return feiyongfenlei;
	}
	/**
	 * 设置：费用金额
	 */
	public void setFeiyongjine(Float feiyongjine) {
		this.feiyongjine = feiyongjine;
	}
	/**
	 * 获取：费用金额
	 */
	public Float getFeiyongjine() {
		return feiyongjine;
	}
	/**
	 * 设置：费用凭证
	 */
	public void setFeiyongpingzheng(String feiyongpingzheng) {
		this.feiyongpingzheng = feiyongpingzheng;
	}
	/**
	 * 获取：费用凭证
	 */
	public String getFeiyongpingzheng() {
		return feiyongpingzheng;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：费用内容
	 */
	public void setFeiyongneirong(String feiyongneirong) {
		this.feiyongneirong = feiyongneirong;
	}
	/**
	 * 获取：费用内容
	 */
	public String getFeiyongneirong() {
		return feiyongneirong;
	}
	/**
	 * 设置：发送日期
	 */
	public void setFasongriqi(Date fasongriqi) {
		this.fasongriqi = fasongriqi;
	}
	/**
	 * 获取：发送日期
	 */
	public Date getFasongriqi() {
		return fasongriqi;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
