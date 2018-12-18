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

package com.comerica.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.ArrayList;
import java.util.List;

import com.comerica.model.MultiScopeAnnouncements;
import com.comerica.service.MultiScopeAnnouncementsLocalServiceUtil;
import com.comerica.service.base.MultiScopeAnnouncementsLocalServiceBaseImpl;
import com.comerica.service.persistence.MultiScopeAnnouncementsPersistence;
import com.comerica.service.persistence.MultiScopeAnnouncementsUtil;
import com.comerica.service.persistence.impl.MultiScopeAnnouncementsPersistenceImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the multi scope announcements local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.comerica.service.MultiScopeAnnouncementsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MultiScopeAnnouncementsLocalServiceBaseImpl
 * @see com.comerica.service.MultiScopeAnnouncementsLocalServiceUtil
 */
@ProviderType
public class MultiScopeAnnouncementsLocalServiceImpl
	extends MultiScopeAnnouncementsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.comerica.service.MultiScopeAnnouncementsLocalServiceUtil} to access the multi scope announcements local service.
	 */
	public void addMultiScopeAnnouncements(ArrayList<Long> entryIds) {
		
		long multiScopeId = counterLocalService.increment();

		for (long entryId : entryIds) {
			MultiScopeAnnouncements announcement = 
					MultiScopeAnnouncementsLocalServiceUtil.createMultiScopeAnnouncements(entryId);

			announcement.setMultiScopeId(multiScopeId);
			
			MultiScopeAnnouncementsLocalServiceUtil.addMultiScopeAnnouncements(announcement);
		}
	}
	
	public List<MultiScopeAnnouncements> retrieveMultiScopeAnnouncements(long entryId) {	
		
		MultiScopeAnnouncements msa = MultiScopeAnnouncementsLocalServiceUtil.fetchMultiScopeAnnouncements(entryId);
		
		if(Validator.isNotNull(msa)) {
			long multiScopeId = msa.getMultiScopeId();
			
			return MultiScopeAnnouncementsUtil.findByMultiScopeId(multiScopeId);
		}
		
		return null;
	}
	
	private Log _log = LogFactoryUtil.getLog(MultiScopeAnnouncementsLocalServiceImpl.class);
}