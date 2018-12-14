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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.comerica.service.http.MultiScopeAnnouncementsServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.comerica.service.http.MultiScopeAnnouncementsServiceSoap
 * @generated
 */
@ProviderType
public class MultiScopeAnnouncementsSoap implements Serializable {
	public static MultiScopeAnnouncementsSoap toSoapModel(
		MultiScopeAnnouncements model) {
		MultiScopeAnnouncementsSoap soapModel = new MultiScopeAnnouncementsSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setEntryId(model.getEntryId());
		soapModel.setMultiScopeId(model.getMultiScopeId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static MultiScopeAnnouncementsSoap[] toSoapModels(
		MultiScopeAnnouncements[] models) {
		MultiScopeAnnouncementsSoap[] soapModels = new MultiScopeAnnouncementsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MultiScopeAnnouncementsSoap[][] toSoapModels(
		MultiScopeAnnouncements[][] models) {
		MultiScopeAnnouncementsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MultiScopeAnnouncementsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MultiScopeAnnouncementsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MultiScopeAnnouncementsSoap[] toSoapModels(
		List<MultiScopeAnnouncements> models) {
		List<MultiScopeAnnouncementsSoap> soapModels = new ArrayList<MultiScopeAnnouncementsSoap>(models.size());

		for (MultiScopeAnnouncements model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MultiScopeAnnouncementsSoap[soapModels.size()]);
	}

	public MultiScopeAnnouncementsSoap() {
	}

	public long getPrimaryKey() {
		return _entryId;
	}

	public void setPrimaryKey(long pk) {
		setEntryId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getEntryId() {
		return _entryId;
	}

	public void setEntryId(long entryId) {
		_entryId = entryId;
	}

	public long getMultiScopeId() {
		return _multiScopeId;
	}

	public void setMultiScopeId(long multiScopeId) {
		_multiScopeId = multiScopeId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private String _uuid;
	private long _entryId;
	private long _multiScopeId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
}