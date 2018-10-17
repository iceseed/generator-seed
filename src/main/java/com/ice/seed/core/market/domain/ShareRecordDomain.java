package com.ice.seed.core.market.domain;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;


/**
 * 分享记录表的domain
 * @author : iceSeed
 * @since : 2018年10月17日
 * @version : v0.0.1
 */
@Data
@NoArgsConstructor
@Table(name = "t_share_record")
public class ShareRecordDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**/
	@Id
	private Long id;
	
	/*用户Id*/
	private Long userId;
	
	/*创建时间*/
	private Date createTime;
	
	/*分享的渠道，对应t_activity表*/
	private Long activityId;
	

}
