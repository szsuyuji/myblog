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
@SuppressWarnings("unused")
public class Topic extends Root {

	private static final long serialVersionUID = 6662818851179844682L;

	private Topic() {
	}

	public Topic(String title, String content, Long authorId) {
		this.title = title;
		this.content = content;
		this.authorId = authorId;
		this.modifiedBy = authorId;
	}

	private String title;

	private String content;

	private Long authorId;

	private Long modifiedBy;

	private DateTime createdOn;

	private DateTime modifiedOn;

	private Integer accessedNum;

	private Integer replyNum;

	private Integer likeNum;

	public void addReply(Long parentId, String reply) {
		this.replyNum++;
	}

	public void removeReply(Long replyId) {
		this.replyNum--;
	}

	public void like() {
		this.likeNum++;
	}

	public void accessed() {
		this.accessedNum++;
	}

	public String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	private void setContent(String content) {
		this.content = content;
	}

	public Long getAuthorId() {
		return authorId;
	}

	private void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	private void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public DateTime getCreatedOn() {
		return createdOn;
	}

	private void setCreatedOn(DateTime createdOn) {
		this.createdOn = createdOn;
	}

	public DateTime getModifiedOn() {
		return modifiedOn;
	}

	private void setModifiedOn(DateTime modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Integer getAccessedNum() {
		return accessedNum;
	}

	private void setAccessedNum(Integer accessedNum) {
		this.accessedNum = accessedNum;
	}

	public Integer getReplyNum() {
		return replyNum;
	}

	private void setReplyNum(Integer replyNum) {
		this.replyNum = replyNum;
	}

	public Integer getLikeNum() {
		return likeNum;
	}

	private void setLikeNum(Integer likeNum) {
		this.likeNum = likeNum;
	}

}
