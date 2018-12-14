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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MultiScopeAnnouncements service. Represents a row in the &quot;MultiScopeAnnouncements_MultiScopeAnnouncements&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.comerica.model.impl.MultiScopeAnnouncementsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.comerica.model.impl.MultiScopeAnnouncementsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MultiScopeAnnouncements
 * @see com.comerica.model.impl.MultiScopeAnnouncementsImpl
 * @see com.comerica.model.impl.MultiScopeAnnouncementsModelImpl
 * @generated
 */
@ProviderType
public interface MultiScopeAnnouncementsModel extends BaseModel<MultiScopeAnnouncements> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a multi scope announcements model instance should use the {@link MultiScopeAnnouncements} interface instead.
	 */

	/**
	 * Returns the primary key of this multi scope announcements.
	 *
	 * @return the primary key of this multi scope announcements
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this multi scope announcements.
	 *
	 * @param primaryKey the primary key of this multi scope announcements
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this multi scope announcements.
	 *
	 * @return the uuid of this multi scope announcements
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this multi scope announcements.
	 *
	 * @param uuid the uuid of this multi scope announcements
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the entry ID of this multi scope announcements.
	 *
	 * @return the entry ID of this multi scope announcements
	 */
	public long getEntryId();

	/**
	 * Sets the entry ID of this multi scope announcements.
	 *
	 * @param entryId the entry ID of this multi scope announcements
	 */
	public void setEntryId(long entryId);

	/**
	 * Returns the multi scope ID of this multi scope announcements.
	 *
	 * @return the multi scope ID of this multi scope announcements
	 */
	public long getMultiScopeId();

	/**
	 * Sets the multi scope ID of this multi scope announcements.
	 *
	 * @param multiScopeId the multi scope ID of this multi scope announcements
	 */
	public void setMultiScopeId(long multiScopeId);

	/**
	 * Returns the user ID of this multi scope announcements.
	 *
	 * @return the user ID of this multi scope announcements
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this multi scope announcements.
	 *
	 * @param userId the user ID of this multi scope announcements
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this multi scope announcements.
	 *
	 * @return the user uuid of this multi scope announcements
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this multi scope announcements.
	 *
	 * @param userUuid the user uuid of this multi scope announcements
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this multi scope announcements.
	 *
	 * @return the user name of this multi scope announcements
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this multi scope announcements.
	 *
	 * @param userName the user name of this multi scope announcements
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this multi scope announcements.
	 *
	 * @return the create date of this multi scope announcements
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this multi scope announcements.
	 *
	 * @param createDate the create date of this multi scope announcements
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this multi scope announcements.
	 *
	 * @return the modified date of this multi scope announcements
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this multi scope announcements.
	 *
	 * @param modifiedDate the modified date of this multi scope announcements
	 */
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(MultiScopeAnnouncements multiScopeAnnouncements);

	@Override
	public int hashCode();

	@Override
	public CacheModel<MultiScopeAnnouncements> toCacheModel();

	@Override
	public MultiScopeAnnouncements toEscapedModel();

	@Override
	public MultiScopeAnnouncements toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}