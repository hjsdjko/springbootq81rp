package com.entity.view;

import com.entity.JiuzhenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 就诊信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
@TableName("jiuzhenxinxi")
public class JiuzhenxinxiView  extends JiuzhenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiuzhenxinxiView(){
	}
 
 	public JiuzhenxinxiView(JiuzhenxinxiEntity jiuzhenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jiuzhenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
