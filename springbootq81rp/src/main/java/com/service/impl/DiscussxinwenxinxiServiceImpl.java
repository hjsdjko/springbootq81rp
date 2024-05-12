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


import com.dao.DiscussxinwenxinxiDao;
import com.entity.DiscussxinwenxinxiEntity;
import com.service.DiscussxinwenxinxiService;
import com.entity.vo.DiscussxinwenxinxiVO;
import com.entity.view.DiscussxinwenxinxiView;

@Service("discussxinwenxinxiService")
public class DiscussxinwenxinxiServiceImpl extends ServiceImpl<DiscussxinwenxinxiDao, DiscussxinwenxinxiEntity> implements DiscussxinwenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxinwenxinxiEntity> page = this.selectPage(
                new Query<DiscussxinwenxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussxinwenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxinwenxinxiEntity> wrapper) {
		  Page<DiscussxinwenxinxiView> page =new Query<DiscussxinwenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxinwenxinxiVO> selectListVO(Wrapper<DiscussxinwenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxinwenxinxiVO selectVO(Wrapper<DiscussxinwenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxinwenxinxiView> selectListView(Wrapper<DiscussxinwenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxinwenxinxiView selectView(Wrapper<DiscussxinwenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
