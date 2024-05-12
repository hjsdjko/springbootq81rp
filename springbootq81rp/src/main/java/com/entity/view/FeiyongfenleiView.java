package com.entity.view;

import com.entity.FeiyongfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 费用分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
@TableName("feiyongfenlei")
public class FeiyongfenleiView  extends FeiyongfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FeiyongfenleiView(){
	}
 
 	public FeiyongfenleiView(FeiyongfenleiEntity feiyongfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, feiyongfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
