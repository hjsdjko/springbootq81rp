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


import com.dao.XinwenxinxiDao;
import com.entity.XinwenxinxiEntity;
import com.service.XinwenxinxiService;
import com.entity.vo.XinwenxinxiVO;
import com.entity.view.XinwenxinxiView;

@Service("xinwenxinxiService")
public class XinwenxinxiServiceImpl extends ServiceImpl<XinwenxinxiDao, XinwenxinxiEntity> implements XinwenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwenxinxiEntity> page = this.selectPage(
                new Query<XinwenxinxiEntity>(params).getPage(),
                new EntityWrapper<XinwenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwenxinxiEntity> wrapper) {
		  Page<XinwenxinxiView> page =new Query<XinwenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinwenxinxiVO> selectListVO(Wrapper<XinwenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinwenxinxiVO selectVO(Wrapper<XinwenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinwenxinxiView> selectListView(Wrapper<XinwenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwenxinxiView selectView(Wrapper<XinwenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
