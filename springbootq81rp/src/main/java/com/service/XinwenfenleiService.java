package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinwenfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinwenfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinwenfenleiView;


/**
 * 新闻分类
 *
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
public interface XinwenfenleiService extends IService<XinwenfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwenfenleiVO> selectListVO(Wrapper<XinwenfenleiEntity> wrapper);
   	
   	XinwenfenleiVO selectVO(@Param("ew") Wrapper<XinwenfenleiEntity> wrapper);
   	
   	List<XinwenfenleiView> selectListView(Wrapper<XinwenfenleiEntity> wrapper);
   	
   	XinwenfenleiView selectView(@Param("ew") Wrapper<XinwenfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwenfenleiEntity> wrapper);
   	

}

