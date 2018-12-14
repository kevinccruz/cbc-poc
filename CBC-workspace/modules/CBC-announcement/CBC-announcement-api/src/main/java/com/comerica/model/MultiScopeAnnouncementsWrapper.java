/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.comerica.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link MultiScopeAnnouncements}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MultiScopeAnnouncements
 * @generated
 */
@ProviderType
public class MultiScopeAnnouncementsWrapper implements MultiScopeAnnouncements,
	ModelWrapper<MultiScopeAnnouncements> {
	public MultiScopeAnnouncementsWrapper(
		MultiScopeAnnouncements multiScopeAnnouncements) {
		_multiScopeAnnouncements = multiScopeAnnouncements;
	}

	@Override
	public Class<?> getModelClass() {
		return MultiScopeAnnouncements.class;
	}

	@Override
	public String getModelClassName() {
		return MultiScopeAnnouncements.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("entryId", getEntryId());
		attributes.put("multiScopeId", getMultiScopeId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		Long multiScopeId = (Long)attributes.get("multiScopeId");

		if (multiScopeId != null) {
			setMultiScopeId(multiScopeId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public MultiScopeAnnouncements toEscapedModel() {
		return new MultiScopeAnnouncementsWrapper(_multiScopeAnnouncements.toEscapedModel());
	}

	@Override
	public MultiScopeAnnouncements toUnescapedModel() {
		return new MultiScopeAnnouncementsWrapper(_multiScopeAnnouncements.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _multiScopeAnnouncements.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _multiScopeAnnouncements.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _multiScopeAnnouncements.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _multiScopeAnnouncements.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<MultiScopeAnnouncements> toCacheModel() {
		return _multiScopeAnnouncements.toCacheModel();
	}

	@Override
	public int compareTo(MultiScopeAnnouncements multiScopeAnnouncements) {
		return _multiScopeAnnouncements.compareTo(multiScopeAnnouncements);
	}

	@Override
	public int hashCode() {
		return _multiScopeAnnouncements.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _multiScopeAnnouncements.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new MultiScopeAnnouncementsWrapper((MultiScopeAnnouncements)_multiScopeAnnouncements.clone());
	}

	/**
	* Returns the user name of this multi scope announcements.
	*
	* @return the user name of this multi scope announcements
	*/
	@Override
	public java.lang.String getUserName() {
		return _multiScopeAnnouncements.getUserName();
	}

	/**
	* Returns the user uuid of this multi scope announcements.
	*
	* @return the user uuid of this multi scope announcements
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _multiScopeAnnouncements.getUserUuid();
	}

	/**
	* Returns the uuid of this multi scope announcements.
	*
	* @return the uuid of this multi scope announcements
	*/
	@Override
	public java.lang.String getUuid() {
		return _multiScopeAnnouncements.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _multiScopeAnnouncements.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _multiScopeAnnouncements.toXmlString();
	}

	/**
	* Returns the create date of this multi scope announcements.
	*
	* @return the create date of this multi scope announcements
	*/
	@Override
	public Date getCreateDate() {
		return _multiScopeAnnouncements.getCreateDate();
	}

	/**
	* Returns the modified date of this multi scope announcements.
	*
	* @return the modified date of this multi scope announcements
	*/
	@Override
	public Date getModifiedDate() {
		return _multiScopeAnnouncements.getModifiedDate();
	}

	/**
	* Returns the entry ID of this multi scope announcements.
	*
	* @return the entry ID of this multi scope announcements
	*/
	@Override
	public long getEntryId() {
		return _multiScopeAnnouncements.getEntryId();
	}

	/**
	* Returns the multi scope ID of this multi scope announcements.
	*
	* @return the multi scope ID of this multi scope announcements
	*/
	@Override
	public long getMultiScopeId() {
		return _multiScopeAnnouncements.getMultiScopeId();
	}

	/**
	* Returns the primary key of this multi scope announcements.
	*
	* @return the primary key of this multi scope announcements
	*/
	@Override
	public long getPrimaryKey() {
		return _multiScopeAnnouncements.getPrimaryKey();
	}

	/**
	* Returns the user ID of this multi scope announcements.
	*
	* @return the user ID of this multi scope announcements
	*/
	@Override
	public long getUserId() {
		return _multiScopeAnnouncements.getUserId();
	}

	@Override
	public void persist() {
		_multiScopeAnnouncements.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_multiScopeAnnouncements.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this multi scope announcements.
	*
	* @param createDate the create date of this multi scope announcements
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_multiScopeAnnouncements.setCreateDate(createDate);
	}

	/**
	* Sets the entry ID of this multi scope announcements.
	*
	* @param entryId the entry ID of this multi scope announcements
	*/
	@Override
	public void setEntryId(long entryId) {
		_multiScopeAnnouncements.setEntryId(entryId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_multiScopeAnnouncements.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_multiScopeAnnouncements.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_multiScopeAnnouncements.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this multi scope announcements.
	*
	* @param modifiedDate the modified date of this multi scope announcements
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_multiScopeAnnouncements.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the multi scope ID of this multi scope announcements.
	*
	* @param multiScopeId the multi scope ID of this multi scope announcements
	*/
	@Override
	public void setMultiScopeId(long multiScopeId) {
		_multiScopeAnnouncements.setMultiScopeId(multiScopeId);
	}

	@Override
	public void setNew(boolean n) {
		_multiScopeAnnouncements.setNew(n);
	}

	/**
	* Sets the primary key of this multi scope announcements.
	*
	* @param primaryKey the primary key of this multi scope announcements
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_multiScopeAnnouncements.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_multiScopeAnnouncements.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this multi scope announcements.
	*
	* @param userId the user ID of this multi scope announcements
	*/
	@Override
	public void setUserId(long userId) {
		_multiScopeAnnouncements.setUserId(userId);
	}

	/**
	* Sets the user name of this multi scope announcements.
	*
	* @param userName the user name of this multi scope announcements
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_multiScopeAnnouncements.setUserName(userName);
	}

	/**
	* Sets the user uuid of this multi scope announcements.
	*
	* @param userUuid the user uuid of this multi scope announcements
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_multiScopeAnnouncements.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this multi scope announcements.
	*
	* @param uuid the uuid of this multi scope announcements
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_multiScopeAnnouncements.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MultiScopeAnnouncementsWrapper)) {
			return false;
		}

		MultiScopeAnnouncementsWrapper multiScopeAnnouncementsWrapper = (MultiScopeAnnouncementsWrapper)obj;

		if (Objects.equals(_multiScopeAnnouncements,
					multiScopeAnnouncementsWrapper._multiScopeAnnouncements)) {
			return true;
		}

		return false;
	}

	@Override
	public MultiScopeAnnouncements getWrappedModel() {
		return _multiScopeAnnouncements;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _multiScopeAnnouncements.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _multiScopeAnnouncements.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_multiScopeAnnouncements.resetOriginalValues();
	}

	private final MultiScopeAnnouncements _multiScopeAnnouncements;
}