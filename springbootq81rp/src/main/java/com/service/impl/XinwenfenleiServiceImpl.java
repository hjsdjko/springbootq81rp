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


import com.dao.XinwenfenleiDao;
import com.entity.XinwenfenleiEntity;
import com.service.XinwenfenleiService;
import com.entity.vo.XinwenfenleiVO;
import com.entity.view.XinwenfenleiView;

@Service("xinwenfenleiService")
public class XinwenfenleiServiceImpl extends ServiceImpl<XinwenfenleiDao, XinwenfenleiEntity> implements XinwenfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwenfenleiEntity> page = this.selectPage(
                new Query<XinwenfenleiEntity>(params).getPage(),
                new EntityWrapper<XinwenfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwenfenleiEntity> wrapper) {
		  Page<XinwenfenleiView> page =new Query<XinwenfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinwenfenleiVO> selectListVO(Wrapper<XinwenfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinwenfenleiVO selectVO(Wrapper<XinwenfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinwenfenleiView> selectListView(Wrapper<XinwenfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwenfenleiView selectView(Wrapper<XinwenfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
