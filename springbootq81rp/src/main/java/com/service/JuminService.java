package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JuminEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JuminVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JuminView;


/**
 * 居民
 *
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
public interface JuminService extends IService<JuminEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JuminVO> selectListVO(Wrapper<JuminEntity> wrapper);
   	
   	JuminVO selectVO(@Param("ew") Wrapper<JuminEntity> wrapper);
   	
   	List<JuminView> selectListView(Wrapper<JuminEntity> wrapper);
   	
   	JuminView selectView(@Param("ew") Wrapper<JuminEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JuminEntity> wrapper);
   	

}

