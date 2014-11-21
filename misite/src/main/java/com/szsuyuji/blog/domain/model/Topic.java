/**
 * 
 */
package com.szsuyuji.blog.domain.model;

import org.joda.time.DateTime;

import com.szsuyuji.blog.domain.base.Root;

/**
 * 帖子聚合根
 * 
 * @author 孙月江
 * 
 */
public class Topic implements Root {

	private static final long serialVersionUID = 6662818851179844682L;

	private String title;

	private String content;

	private Long createdBy;

	private Long modifiedBy;

	private DateTime createdOn;

	private DateTime modifiedOn;

}
