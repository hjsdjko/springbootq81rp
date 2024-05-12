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


import com.dao.FeiyongfenleiDao;
import com.entity.FeiyongfenleiEntity;
import com.service.FeiyongfenleiService;
import com.entity.vo.FeiyongfenleiVO;
import com.entity.view.FeiyongfenleiView;

@Service("feiyongfenleiService")
public class FeiyongfenleiServiceImpl extends ServiceImpl<FeiyongfenleiDao, FeiyongfenleiEntity> implements FeiyongfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeiyongfenleiEntity> page = this.selectPage(
                new Query<FeiyongfenleiEntity>(params).getPage(),
                new EntityWrapper<FeiyongfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeiyongfenleiEntity> wrapper) {
		  Page<FeiyongfenleiView> page =new Query<FeiyongfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FeiyongfenleiVO> selectListVO(Wrapper<FeiyongfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FeiyongfenleiVO selectVO(Wrapper<FeiyongfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FeiyongfenleiView> selectListView(Wrapper<FeiyongfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeiyongfenleiView selectView(Wrapper<FeiyongfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
