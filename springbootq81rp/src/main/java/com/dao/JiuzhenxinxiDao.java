package com.dao;

import com.entity.JiuzhenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiuzhenxinxiVO;
import com.entity.view.JiuzhenxinxiView;


/**
 * 就诊信息
 * 
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
public interface JiuzhenxinxiDao extends BaseMapper<JiuzhenxinxiEntity> {
	
	List<JiuzhenxinxiVO> selectListVO(@Param("ew") Wrapper<JiuzhenxinxiEntity> wrapper);
	
	JiuzhenxinxiVO selectVO(@Param("ew") Wrapper<JiuzhenxinxiEntity> wrapper);
	
	List<JiuzhenxinxiView> selectListView(@Param("ew") Wrapper<JiuzhenxinxiEntity> wrapper);

	List<JiuzhenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiuzhenxinxiEntity> wrapper);
	
	JiuzhenxinxiView selectView(@Param("ew") Wrapper<JiuzhenxinxiEntity> wrapper);
	

}
