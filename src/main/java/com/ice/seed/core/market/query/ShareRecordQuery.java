package com.ice.seed.core.market.query;

import tk.mybatis.mapper.entity.Example;
import lombok.Data;
import com.ice.seed.core.market.domain.ShareRecordDomain;
import com.ice.common.persistence.Query;
import com.ice.common.persistence.criteria.Criteria;
import com.ice.common.persistence.criteria.QueryCriteria;


/**
 * 分享记录表的Query
 * @author : iceSeed
 * @since : 2018年10月17日
 * @version : v0.0.1
 */
@Data
public class ShareRecordQuery extends Query {

	/**/
	@Id
	private Long id;

	/*用户Id*/
	private Long userId;

	/*创建时间*/
	private Date createTime;

	/*分享的渠道，对应t_activity表*/
	private Long activityId;



	@Override
	public QueryCriteria toCriteria() {
		QueryCriteria queryCriteria = new QueryCriteria(ShareRecordDomain.class);
		Example.Criteria criteria = queryCriteria.createCriteria();
		if (valid(id)) {
            criteria.andEqualTo("id", id);
        }

		if (valid(userId)) {
            criteria.andEqualTo("userId", userId);
        }

		if (valid(createTime)) {
            criteria.andEqualTo("createTime", createTime);
        }

		if (valid(activityId)) {
            criteria.andEqualTo("activityId", activityId);
        }

		//todo 写查询逻辑
		
		return queryCriteria;
	}

}
