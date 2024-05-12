package com.dao;

import com.entity.JuminEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JuminVO;
import com.entity.view.JuminView;


/**
 * 居民
 * 
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
public interface JuminDao extends BaseMapper<JuminEntity> {
	
	List<JuminVO> selectListVO(@Param("ew") Wrapper<JuminEntity> wrapper);
	
	JuminVO selectVO(@Param("ew") Wrapper<JuminEntity> wrapper);
	
	List<JuminView> selectListView(@Param("ew") Wrapper<JuminEntity> wrapper);

	List<JuminView> selectListView(Pagination page,@Param("ew") Wrapper<JuminEntity> wrapper);
	
	JuminView selectView(@Param("ew") Wrapper<JuminEntity> wrapper);
	

}
