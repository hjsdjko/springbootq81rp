package com.dao;

import com.entity.FeiyongfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FeiyongfenleiVO;
import com.entity.view.FeiyongfenleiView;


/**
 * 费用分类
 * 
 * @author 
 * @email 
 * @date 2023-02-10 20:47:48
 */
public interface FeiyongfenleiDao extends BaseMapper<FeiyongfenleiEntity> {
	
	List<FeiyongfenleiVO> selectListVO(@Param("ew") Wrapper<FeiyongfenleiEntity> wrapper);
	
	FeiyongfenleiVO selectVO(@Param("ew") Wrapper<FeiyongfenleiEntity> wrapper);
	
	List<FeiyongfenleiView> selectListView(@Param("ew") Wrapper<FeiyongfenleiEntity> wrapper);

	List<FeiyongfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<FeiyongfenleiEntity> wrapper);
	
	FeiyongfenleiView selectView(@Param("ew") Wrapper<FeiyongfenleiEntity> wrapper);
	

}
