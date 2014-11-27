/**
 * 
 */
package com.szsuyuji.blog.domain.base;

import java.io.Serializable;

/**
 * 聚合根
 * 
 * @author 孙月江
 * 
 */
public class Root implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

}
