package com.entity.view;

import com.entity.KeshimingchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科室名称
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
@TableName("keshimingcheng")
public class KeshimingchengView  extends KeshimingchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KeshimingchengView(){
	}
 
 	public KeshimingchengView(KeshimingchengEntity keshimingchengEntity){
 	try {
			BeanUtils.copyProperties(this, keshimingchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
