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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MultiScopeAnnouncementsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MultiScopeAnnouncementsLocalService
 * @generated
 */
@ProviderType
public class MultiScopeAnnouncementsLocalServiceWrapper
	implements MultiScopeAnnouncementsLocalService,
		ServiceWrapper<MultiScopeAnnouncementsLocalService> {
	public MultiScopeAnnouncementsLocalServiceWrapper(
		MultiScopeAnnouncementsLocalService multiScopeAnnouncementsLocalService) {
		_multiScopeAnnouncementsLocalService = multiScopeAnnouncementsLocalService;
	}

	/**
	* Adds the multi scope announcements to the database. Also notifies the appropriate model listeners.
	*
	* @param multiScopeAnnouncements the multi scope announcements
	* @return the multi scope announcements that was added
	*/
	@Override
	public com.comerica.model.MultiScopeAnnouncements addMultiScopeAnnouncements(
		com.comerica.model.MultiScopeAnnouncements multiScopeAnnouncements) {
		return _multiScopeAnnouncementsLocalService.addMultiScopeAnnouncements(multiScopeAnnouncements);
	}

	/**
	* Creates a new multi scope announcements with the primary key. Does not add the multi scope announcements to the database.
	*
	* @param entryId the primary key for the new multi scope announcements
	* @return the new multi scope announcements
	*/
	@Override
	public com.comerica.model.MultiScopeAnnouncements createMultiScopeAnnouncements(
		long entryId) {
		return _multiScopeAnnouncementsLocalService.createMultiScopeAnnouncements(entryId);
	}

	/**
	* Deletes the multi scope announcements from the database. Also notifies the appropriate model listeners.
	*
	* @param multiScopeAnnouncements the multi scope announcements
	* @return the multi scope announcements that was removed
	*/
	@Override
	public com.comerica.model.MultiScopeAnnouncements deleteMultiScopeAnnouncements(
		com.comerica.model.MultiScopeAnnouncements multiScopeAnnouncements) {
		return _multiScopeAnnouncementsLocalService.deleteMultiScopeAnnouncements(multiScopeAnnouncements);
	}

	/**
	* Deletes the multi scope announcements with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the multi scope announcements
	* @return the multi scope announcements that was removed
	* @throws PortalException if a multi scope announcements with the primary key could not be found
	*/
	@Override
	public com.comerica.model.MultiScopeAnnouncements deleteMultiScopeAnnouncements(
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _multiScopeAnnouncementsLocalService.deleteMultiScopeAnnouncements(entryId);
	}

	@Override
	public com.comerica.model.MultiScopeAnnouncements fetchMultiScopeAnnouncements(
		long entryId) {
		return _multiScopeAnnouncementsLocalService.fetchMultiScopeAnnouncements(entryId);
	}

	/**
	* Returns the multi scope announcements with the primary key.
	*
	* @param entryId the primary key of the multi scope announcements
	* @return the multi scope announcements
	* @throws PortalException if a multi scope announcements with the primary key could not be found
	*/
	@Override
	public com.comerica.model.MultiScopeAnnouncements getMultiScopeAnnouncements(
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _multiScopeAnnouncementsLocalService.getMultiScopeAnnouncements(entryId);
	}

	/**
	* Updates the multi scope announcements in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param multiScopeAnnouncements the multi scope announcements
	* @return the multi scope announcements that was updated
	*/
	@Override
	public com.comerica.model.MultiScopeAnnouncements updateMultiScopeAnnouncements(
		com.comerica.model.MultiScopeAnnouncements multiScopeAnnouncements) {
		return _multiScopeAnnouncementsLocalService.updateMultiScopeAnnouncements(multiScopeAnnouncements);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _multiScopeAnnouncementsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _multiScopeAnnouncementsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _multiScopeAnnouncementsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _multiScopeAnnouncementsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _multiScopeAnnouncementsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of multi scope announcementses.
	*
	* @return the number of multi scope announcementses
	*/
	@Override
	public int getMultiScopeAnnouncementsesCount() {
		return _multiScopeAnnouncementsLocalService.getMultiScopeAnnouncementsesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _multiScopeAnnouncementsLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _multiScopeAnnouncementsLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _multiScopeAnnouncementsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _multiScopeAnnouncementsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

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
	@Override
	public java.util.List<com.comerica.model.MultiScopeAnnouncements> getMultiScopeAnnouncementses(
		int start, int end) {
		return _multiScopeAnnouncementsLocalService.getMultiScopeAnnouncementses(start,
			end);
	}

	@Override
	public java.util.List<com.comerica.model.MultiScopeAnnouncements> retrieveMultiScopeAnnouncements(
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _multiScopeAnnouncementsLocalService.retrieveMultiScopeAnnouncements(entryId);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _multiScopeAnnouncementsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _multiScopeAnnouncementsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public void addMultiScopeAnnouncements(
		java.util.ArrayList<java.lang.Long> entryIds) {
		_multiScopeAnnouncementsLocalService.addMultiScopeAnnouncements(entryIds);
	}

	@Override
	public MultiScopeAnnouncementsLocalService getWrappedService() {
		return _multiScopeAnnouncementsLocalService;
	}

	@Override
	public void setWrappedService(
		MultiScopeAnnouncementsLocalService multiScopeAnnouncementsLocalService) {
		_multiScopeAnnouncementsLocalService = multiScopeAnnouncementsLocalService;
	}

	private MultiScopeAnnouncementsLocalService _multiScopeAnnouncementsLocalService;
}