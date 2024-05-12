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


import com.dao.ChathelperDao;
import com.entity.ChathelperEntity;
import com.service.ChathelperService;
import com.entity.vo.ChathelperVO;
import com.entity.view.ChathelperView;

@Service("chathelperService")
public class ChathelperServiceImpl extends ServiceImpl<ChathelperDao, ChathelperEntity> implements ChathelperService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChathelperEntity> page = this.selectPage(
                new Query<ChathelperEntity>(params).getPage(),
                new EntityWrapper<ChathelperEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChathelperEntity> wrapper) {
		  Page<ChathelperView> page =new Query<ChathelperView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChathelperVO> selectListVO(Wrapper<ChathelperEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChathelperVO selectVO(Wrapper<ChathelperEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChathelperView> selectListView(Wrapper<ChathelperEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChathelperView selectView(Wrapper<ChathelperEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
