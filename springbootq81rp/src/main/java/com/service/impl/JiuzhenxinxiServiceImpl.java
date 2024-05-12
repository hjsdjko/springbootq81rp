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


import com.dao.JiuzhenxinxiDao;
import com.entity.JiuzhenxinxiEntity;
import com.service.JiuzhenxinxiService;
import com.entity.vo.JiuzhenxinxiVO;
import com.entity.view.JiuzhenxinxiView;

@Service("jiuzhenxinxiService")
public class JiuzhenxinxiServiceImpl extends ServiceImpl<JiuzhenxinxiDao, JiuzhenxinxiEntity> implements JiuzhenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiuzhenxinxiEntity> page = this.selectPage(
                new Query<JiuzhenxinxiEntity>(params).getPage(),
                new EntityWrapper<JiuzhenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiuzhenxinxiEntity> wrapper) {
		  Page<JiuzhenxinxiView> page =new Query<JiuzhenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiuzhenxinxiVO> selectListVO(Wrapper<JiuzhenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiuzhenxinxiVO selectVO(Wrapper<JiuzhenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiuzhenxinxiView> selectListView(Wrapper<JiuzhenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiuzhenxinxiView selectView(Wrapper<JiuzhenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
