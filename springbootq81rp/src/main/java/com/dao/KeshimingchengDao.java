package com.dao;

import com.entity.KeshimingchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeshimingchengVO;
import com.entity.view.KeshimingchengView;


/**
 * 科室名称
 * 
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
public interface KeshimingchengDao extends BaseMapper<KeshimingchengEntity> {
	
	List<KeshimingchengVO> selectListVO(@Param("ew") Wrapper<KeshimingchengEntity> wrapper);
	
	KeshimingchengVO selectVO(@Param("ew") Wrapper<KeshimingchengEntity> wrapper);
	
	List<KeshimingchengView> selectListView(@Param("ew") Wrapper<KeshimingchengEntity> wrapper);

	List<KeshimingchengView> selectListView(Pagination page,@Param("ew") Wrapper<KeshimingchengEntity> wrapper);
	
	KeshimingchengView selectView(@Param("ew") Wrapper<KeshimingchengEntity> wrapper);
	

}
