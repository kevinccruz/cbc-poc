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

package com.comerica.service;

import aQute.bnd.annotation.ProviderType;

import com.comerica.model.MultiScopeAnnouncements;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides the local service interface for MultiScopeAnnouncements. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see MultiScopeAnnouncementsLocalServiceUtil
 * @see com.comerica.service.base.MultiScopeAnnouncementsLocalServiceBaseImpl
 * @see com.comerica.service.impl.MultiScopeAnnouncementsLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface MultiScopeAnnouncementsLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MultiScopeAnnouncementsLocalServiceUtil} to access the multi scope announcements local service. Add custom service methods to {@link com.comerica.service.impl.MultiScopeAnnouncementsLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the multi scope announcements to the database. Also notifies the appropriate model listeners.
	*
	* @param multiScopeAnnouncements the multi scope announcements
	* @return the multi scope announcements that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public MultiScopeAnnouncements addMultiScopeAnnouncements(
		MultiScopeAnnouncements multiScopeAnnouncements);

	/**
	* Creates a new multi scope announcements with the primary key. Does not add the multi scope announcements to the database.
	*
	* @param entryId the primary key for the new multi scope announcements
	* @return the new multi scope announcements
	*/
	public MultiScopeAnnouncements createMultiScopeAnnouncements(long entryId);

	/**
	* Deletes the multi scope announcements from the database. Also notifies the appropriate model listeners.
	*
	* @param multiScopeAnnouncements the multi scope announcements
	* @return the multi scope announcements that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public MultiScopeAnnouncements deleteMultiScopeAnnouncements(
		MultiScopeAnnouncements multiScopeAnnouncements);

	/**
	* Deletes the multi scope announcements with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the multi scope announcements
	* @return the multi scope announcements that was removed
	* @throws PortalException if a multi scope announcements with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public MultiScopeAnnouncements deleteMultiScopeAnnouncements(long entryId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MultiScopeAnnouncements fetchMultiScopeAnnouncements(long entryId);

	/**
	* Returns the multi scope announcements with the primary key.
	*
	* @param entryId the primary key of the multi scope announcements
	* @return the multi scope announcements
	* @throws PortalException if a multi scope announcements with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MultiScopeAnnouncements getMultiScopeAnnouncements(long entryId)
		throws PortalException;

	/**
	* Updates the multi scope announcements in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param multiScopeAnnouncements the multi scope announcements
	* @return the multi scope announcements that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public MultiScopeAnnouncements updateMultiScopeAnnouncements(
		MultiScopeAnnouncements multiScopeAnnouncements);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of multi scope announcementses.
	*
	* @return the number of multi scope announcementses
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getMultiScopeAnnouncementsesCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.comerica.model.impl.MultiScopeAnnouncementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.comerica.model.impl.MultiScopeAnnouncementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns a range of all the multi scope announcementses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.comerica.model.impl.MultiScopeAnnouncementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of multi scope announcementses
	* @param end the upper bound of the range of multi scope announcementses (not inclusive)
	* @return the range of multi scope announcementses
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MultiScopeAnnouncements> getMultiScopeAnnouncementses(
		int start, int end);

	public List<MultiScopeAnnouncements> retrieveMultiScopeAnnouncements(
		long entryId) throws PortalException;

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	public void addMultiScopeAnnouncements(ArrayList<java.lang.Long> entryIds);
}