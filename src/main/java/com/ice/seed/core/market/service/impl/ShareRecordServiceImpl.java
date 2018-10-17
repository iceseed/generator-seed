package com.ice.seed.core.market.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ice.common.service.impl.BaseServiceImpl;
import com.ice.seed.core.market.mapper.ShareRecordMapper;
import com.ice.seed.core.market.domain.ShareRecordDomain;
import com.ice.seed.core.market.service.IShareRecordService;

/**
 * 分享记录表的业务实现类
 * @author : iceSeed
 * @since : 2018年10月17日
 * @version : v0.0.1
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("shareRecordService")
public class ShareRecordServiceImpl extends BaseServiceImpl<ShareRecordDomain> implements IShareRecordService {
	
	@Autowired
	private ShareRecordMapper shareRecordMapper;
	  
}
