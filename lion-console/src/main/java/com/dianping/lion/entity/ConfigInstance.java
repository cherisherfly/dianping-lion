/**
 * Project: com.dianping.lion.lion-console-0.0.1
 * 
 * File Created at 2012-7-11
 * $Id$
 * 
 * Copyright 2010 dianping.com.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Dianping Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with dianping.com.
 */
package com.dianping.lion.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author danson.liu
 *
 */
@SuppressWarnings("serial")
public class ConfigInstance implements Serializable {

	private int id;
	private int configId;
	private Config config;
	private int envId;
	private String value;
	private String context;
	private int createUserId;
	private int modifyUserId;
	private Date createTime;
	private Date modifyTime;
	private boolean deleted;
	private String remark;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the configId
	 */
	public int getConfigId() {
		return configId;
	}
	/**
	 * @param configId the configId to set
	 */
	public void setConfigId(int configId) {
		this.configId = configId;
	}
	/**
	 * @return the config
	 */
	public Config getConfig() {
		return config;
	}
	/**
	 * @param config the config to set
	 */
	public void setConfig(Config config) {
		this.config = config;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the context
	 */
	public String getContext() {
		return context;
	}
	/**
	 * @param context the context to set
	 */
	public void setContext(String context) {
		this.context = context;
	}
	/**
	 * @return the envId
	 */
	public int getEnvId() {
		return envId;
	}
	/**
	 * @param envId the envId to set
	 */
	public void setEnvId(int envId) {
		this.envId = envId;
	}
	/**
	 * @return the createUserId
	 */
	public int getCreateUserId() {
		return createUserId;
	}
	/**
	 * @param createUserId the createUserId to set
	 */
	public void setCreateUserId(int createUserId) {
		this.createUserId = createUserId;
	}
	/**
	 * @return the modifyUserId
	 */
	public int getModifyUserId() {
		return modifyUserId;
	}
	/**
	 * @param modifyUserId the modifyUserId to set
	 */
	public void setModifyUserId(int modifyUserId) {
		this.modifyUserId = modifyUserId;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the modifyTime
	 */
	public Date getModifyTime() {
		return modifyTime;
	}
	/**
	 * @param modifyTime the modifyTime to set
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	/**
	 * @return the deleted
	 */
	public boolean isDeleted() {
		return deleted;
	}
	/**
	 * @param deleted the deleted to set
	 */
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}