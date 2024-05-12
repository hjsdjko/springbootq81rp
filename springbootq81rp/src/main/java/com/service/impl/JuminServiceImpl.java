package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JuminDao;
import com.entity.JuminEntity;
import com.service.JuminService;
import com.entity.vo.JuminVO;
import com.entity.view.JuminView;

@Service("juminService")
public class JuminServiceImpl extends ServiceImpl<JuminDao, JuminEntity> implements JuminService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JuminEntity> page = this.selectPage(
                new Query<JuminEntity>(params).getPage(),
                new EntityWrapper<JuminEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JuminEntity> wrapper) {
		  Page<JuminView> page =new Query<JuminView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JuminVO> selectListVO(Wrapper<JuminEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JuminVO selectVO(Wrapper<JuminEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JuminView> selectListView(Wrapper<JuminEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JuminView selectView(Wrapper<JuminEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
