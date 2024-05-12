package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeshimingchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeshimingchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeshimingchengView;


/**
 * 科室名称
 *
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
public interface KeshimingchengService extends IService<KeshimingchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeshimingchengVO> selectListVO(Wrapper<KeshimingchengEntity> wrapper);
   	
   	KeshimingchengVO selectVO(@Param("ew") Wrapper<KeshimingchengEntity> wrapper);
   	
   	List<KeshimingchengView> selectListView(Wrapper<KeshimingchengEntity> wrapper);
   	
   	KeshimingchengView selectView(@Param("ew") Wrapper<KeshimingchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeshimingchengEntity> wrapper);
   	

}

