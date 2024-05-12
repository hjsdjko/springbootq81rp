package com.dao;

import com.entity.ChathelperEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChathelperVO;
import com.entity.view.ChathelperView;


/**
 * 聊天助手表
 * 
 * @author 
 * @email 
 * @date 2023-02-10 20:47:49
 */
public interface ChathelperDao extends BaseMapper<ChathelperEntity> {
	
	List<ChathelperVO> selectListVO(@Param("ew") Wrapper<ChathelperEntity> wrapper);
	
	ChathelperVO selectVO(@Param("ew") Wrapper<ChathelperEntity> wrapper);
	
	List<ChathelperView> selectListView(@Param("ew") Wrapper<ChathelperEntity> wrapper);

	List<ChathelperView> selectListView(Pagination page,@Param("ew") Wrapper<ChathelperEntity> wrapper);
	
	ChathelperView selectView(@Param("ew") Wrapper<ChathelperEntity> wrapper);
	

}
