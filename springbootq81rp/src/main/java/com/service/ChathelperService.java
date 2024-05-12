package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChathelperEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChathelperVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChathelperView;


/**
 * 聊天助手表
 *
 * @author 
 * @email 
 * @date 2023-02-10 20:47:49
 */
public interface ChathelperService extends IService<ChathelperEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChathelperVO> selectListVO(Wrapper<ChathelperEntity> wrapper);
   	
   	ChathelperVO selectVO(@Param("ew") Wrapper<ChathelperEntity> wrapper);
   	
   	List<ChathelperView> selectListView(Wrapper<ChathelperEntity> wrapper);
   	
   	ChathelperView selectView(@Param("ew") Wrapper<ChathelperEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChathelperEntity> wrapper);
   	

}

