package com.entity.vo;

import com.entity.ChathelperEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 聊天助手表
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-10 20:47:49
 */
public class ChathelperVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 回复
	 */
	
	private String reply;
				
	
	/**
	 * 设置：回复
	 */
	 
	public void setReply(String reply) {
		this.reply = reply;
	}
	
	/**
	 * 获取：回复
	 */
	public String getReply() {
		return reply;
	}
			
}
