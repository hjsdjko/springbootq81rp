package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeiyongfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FeiyongfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FeiyongfenleiView;


/**
 * 费用分类
 *
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
public interface FeiyongfenleiService extends IService<FeiyongfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeiyongfenleiVO> selectListVO(Wrapper<FeiyongfenleiEntity> wrapper);
   	
   	FeiyongfenleiVO selectVO(@Param("ew") Wrapper<FeiyongfenleiEntity> wrapper);
   	
   	List<FeiyongfenleiView> selectListView(Wrapper<FeiyongfenleiEntity> wrapper);
   	
   	FeiyongfenleiView selectView(@Param("ew") Wrapper<FeiyongfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeiyongfenleiEntity> wrapper);
   	

}

