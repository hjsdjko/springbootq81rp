package com.dao;

import com.entity.GuahaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuahaoxinxiVO;
import com.entity.view.GuahaoxinxiView;


/**
 * 挂号信息
 * 
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
public interface GuahaoxinxiDao extends BaseMapper<GuahaoxinxiEntity> {
	
	List<GuahaoxinxiVO> selectListVO(@Param("ew") Wrapper<GuahaoxinxiEntity> wrapper);
	
	GuahaoxinxiVO selectVO(@Param("ew") Wrapper<GuahaoxinxiEntity> wrapper);
	
	List<GuahaoxinxiView> selectListView(@Param("ew") Wrapper<GuahaoxinxiEntity> wrapper);

	List<GuahaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GuahaoxinxiEntity> wrapper);
	
	GuahaoxinxiView selectView(@Param("ew") Wrapper<GuahaoxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GuahaoxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GuahaoxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GuahaoxinxiEntity> wrapper);



}
