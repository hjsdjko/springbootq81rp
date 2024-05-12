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


import com.dao.KeshimingchengDao;
import com.entity.KeshimingchengEntity;
import com.service.KeshimingchengService;
import com.entity.vo.KeshimingchengVO;
import com.entity.view.KeshimingchengView;

@Service("keshimingchengService")
public class KeshimingchengServiceImpl extends ServiceImpl<KeshimingchengDao, KeshimingchengEntity> implements KeshimingchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeshimingchengEntity> page = this.selectPage(
                new Query<KeshimingchengEntity>(params).getPage(),
                new EntityWrapper<KeshimingchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeshimingchengEntity> wrapper) {
		  Page<KeshimingchengView> page =new Query<KeshimingchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KeshimingchengVO> selectListVO(Wrapper<KeshimingchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeshimingchengVO selectVO(Wrapper<KeshimingchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeshimingchengView> selectListView(Wrapper<KeshimingchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeshimingchengView selectView(Wrapper<KeshimingchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
