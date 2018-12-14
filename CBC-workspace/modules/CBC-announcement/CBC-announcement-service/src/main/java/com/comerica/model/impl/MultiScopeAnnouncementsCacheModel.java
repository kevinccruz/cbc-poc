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

package com.comerica.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.comerica.model.MultiScopeAnnouncements;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MultiScopeAnnouncements in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see MultiScopeAnnouncements
 * @generated
 */
@ProviderType
public class MultiScopeAnnouncementsCacheModel implements CacheModel<MultiScopeAnnouncements>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MultiScopeAnnouncementsCacheModel)) {
			return false;
		}

		MultiScopeAnnouncementsCacheModel multiScopeAnnouncementsCacheModel = (MultiScopeAnnouncementsCacheModel)obj;

		if (entryId == multiScopeAnnouncementsCacheModel.entryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, entryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", entryId=");
		sb.append(entryId);
		sb.append(", multiScopeId=");
		sb.append(multiScopeId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MultiScopeAnnouncements toEntityModel() {
		MultiScopeAnnouncementsImpl multiScopeAnnouncementsImpl = new MultiScopeAnnouncementsImpl();

		if (uuid == null) {
			multiScopeAnnouncementsImpl.setUuid(StringPool.BLANK);
		}
		else {
			multiScopeAnnouncementsImpl.setUuid(uuid);
		}

		multiScopeAnnouncementsImpl.setEntryId(entryId);
		multiScopeAnnouncementsImpl.setMultiScopeId(multiScopeId);
		multiScopeAnnouncementsImpl.setUserId(userId);

		if (userName == null) {
			multiScopeAnnouncementsImpl.setUserName(StringPool.BLANK);
		}
		else {
			multiScopeAnnouncementsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			multiScopeAnnouncementsImpl.setCreateDate(null);
		}
		else {
			multiScopeAnnouncementsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			multiScopeAnnouncementsImpl.setModifiedDate(null);
		}
		else {
			multiScopeAnnouncementsImpl.setModifiedDate(new Date(modifiedDate));
		}

		multiScopeAnnouncementsImpl.resetOriginalValues();

		return multiScopeAnnouncementsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		entryId = objectInput.readLong();

		multiScopeId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(entryId);

		objectOutput.writeLong(multiScopeId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long entryId;
	public long multiScopeId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
}