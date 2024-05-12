package com.entity.model;

import com.entity.FeiyongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 费用信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
public class FeiyongxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
