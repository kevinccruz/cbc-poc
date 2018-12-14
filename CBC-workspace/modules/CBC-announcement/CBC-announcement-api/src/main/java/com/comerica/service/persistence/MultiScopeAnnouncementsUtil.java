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

package com.comerica.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.comerica.model.MultiScopeAnnouncements;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the multi scope announcements service. This utility wraps {@link com.comerica.service.persistence.impl.MultiScopeAnnouncementsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MultiScopeAnnouncementsPersistence
 * @see com.comerica.service.persistence.impl.MultiScopeAnnouncementsPersistenceImpl
 * @generated
 */
@ProviderType
public class MultiScopeAnnouncementsUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		MultiScopeAnnouncements multiScopeAnnouncements) {
		getPersistence().clearCache(multiScopeAnnouncements);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MultiScopeAnnouncements> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MultiScopeAnnouncements> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MultiScopeAnnouncements> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MultiScopeAnnouncements update(
		MultiScopeAnnouncements multiScopeAnnouncements) {
		return getPersistence().update(multiScopeAnnouncements);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MultiScopeAnnouncements update(
		MultiScopeAnnouncements multiScopeAnnouncements,
		ServiceContext serviceContext) {
		return getPersistence().update(multiScopeAnnouncements, serviceContext);
	}

	/**
	* Returns all the multi scope announcementses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching multi scope announcementses
	*/
	public static List<MultiScopeAnnouncements> findByUuid(
		java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the multi scope announcementses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MultiScopeAnnouncementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of multi scope announcementses
	* @param end the upper bound of the range of multi scope announcementses (not inclusive)
	* @return the range of matching multi scope announcementses
	*/
	public static List<MultiScopeAnnouncements> findByUuid(
		java.lang.String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the multi scope announcementses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MultiScopeAnnouncementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of multi scope announcementses
	* @param end the upper bound of the range of multi scope announcementses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching multi scope announcementses
	*/
	public static List<MultiScopeAnnouncements> findByUuid(
		java.lang.String uuid, int start, int end,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the multi scope announcementses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MultiScopeAnnouncementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of multi scope announcementses
	* @param end the upper bound of the range of multi scope announcementses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching multi scope announcementses
	*/
	public static List<MultiScopeAnnouncements> findByUuid(
		java.lang.String uuid, int start, int end,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first multi scope announcements in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching multi scope announcements
	* @throws NoSuchMultiScopeAnnouncementsException if a matching multi scope announcements could not be found
	*/
	public static MultiScopeAnnouncements findByUuid_First(
		java.lang.String uuid,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator)
		throws com.comerica.exception.NoSuchMultiScopeAnnouncementsException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first multi scope announcements in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching multi scope announcements, or <code>null</code> if a matching multi scope announcements could not be found
	*/
	public static MultiScopeAnnouncements fetchByUuid_First(
		java.lang.String uuid,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last multi scope announcements in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching multi scope announcements
	* @throws NoSuchMultiScopeAnnouncementsException if a matching multi scope announcements could not be found
	*/
	public static MultiScopeAnnouncements findByUuid_Last(
		java.lang.String uuid,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator)
		throws com.comerica.exception.NoSuchMultiScopeAnnouncementsException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last multi scope announcements in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching multi scope announcements, or <code>null</code> if a matching multi scope announcements could not be found
	*/
	public static MultiScopeAnnouncements fetchByUuid_Last(
		java.lang.String uuid,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the multi scope announcementses before and after the current multi scope announcements in the ordered set where uuid = &#63;.
	*
	* @param entryId the primary key of the current multi scope announcements
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next multi scope announcements
	* @throws NoSuchMultiScopeAnnouncementsException if a multi scope announcements with the primary key could not be found
	*/
	public static MultiScopeAnnouncements[] findByUuid_PrevAndNext(
		long entryId, java.lang.String uuid,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator)
		throws com.comerica.exception.NoSuchMultiScopeAnnouncementsException {
		return getPersistence()
				   .findByUuid_PrevAndNext(entryId, uuid, orderByComparator);
	}

	/**
	* Removes all the multi scope announcementses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of multi scope announcementses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching multi scope announcementses
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the multi scope announcementses where multiScopeId = &#63;.
	*
	* @param multiScopeId the multi scope ID
	* @return the matching multi scope announcementses
	*/
	public static List<MultiScopeAnnouncements> findByMultiScopeId(
		long multiScopeId) {
		return getPersistence().findByMultiScopeId(multiScopeId);
	}

	/**
	* Returns a range of all the multi scope announcementses where multiScopeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MultiScopeAnnouncementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param multiScopeId the multi scope ID
	* @param start the lower bound of the range of multi scope announcementses
	* @param end the upper bound of the range of multi scope announcementses (not inclusive)
	* @return the range of matching multi scope announcementses
	*/
	public static List<MultiScopeAnnouncements> findByMultiScopeId(
		long multiScopeId, int start, int end) {
		return getPersistence().findByMultiScopeId(multiScopeId, start, end);
	}

	/**
	* Returns an ordered range of all the multi scope announcementses where multiScopeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MultiScopeAnnouncementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param multiScopeId the multi scope ID
	* @param start the lower bound of the range of multi scope announcementses
	* @param end the upper bound of the range of multi scope announcementses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching multi scope announcementses
	*/
	public static List<MultiScopeAnnouncements> findByMultiScopeId(
		long multiScopeId, int start, int end,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator) {
		return getPersistence()
				   .findByMultiScopeId(multiScopeId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the multi scope announcementses where multiScopeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MultiScopeAnnouncementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param multiScopeId the multi scope ID
	* @param start the lower bound of the range of multi scope announcementses
	* @param end the upper bound of the range of multi scope announcementses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching multi scope announcementses
	*/
	public static List<MultiScopeAnnouncements> findByMultiScopeId(
		long multiScopeId, int start, int end,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByMultiScopeId(multiScopeId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first multi scope announcements in the ordered set where multiScopeId = &#63;.
	*
	* @param multiScopeId the multi scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching multi scope announcements
	* @throws NoSuchMultiScopeAnnouncementsException if a matching multi scope announcements could not be found
	*/
	public static MultiScopeAnnouncements findByMultiScopeId_First(
		long multiScopeId,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator)
		throws com.comerica.exception.NoSuchMultiScopeAnnouncementsException {
		return getPersistence()
				   .findByMultiScopeId_First(multiScopeId, orderByComparator);
	}

	/**
	* Returns the first multi scope announcements in the ordered set where multiScopeId = &#63;.
	*
	* @param multiScopeId the multi scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching multi scope announcements, or <code>null</code> if a matching multi scope announcements could not be found
	*/
	public static MultiScopeAnnouncements fetchByMultiScopeId_First(
		long multiScopeId,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator) {
		return getPersistence()
				   .fetchByMultiScopeId_First(multiScopeId, orderByComparator);
	}

	/**
	* Returns the last multi scope announcements in the ordered set where multiScopeId = &#63;.
	*
	* @param multiScopeId the multi scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching multi scope announcements
	* @throws NoSuchMultiScopeAnnouncementsException if a matching multi scope announcements could not be found
	*/
	public static MultiScopeAnnouncements findByMultiScopeId_Last(
		long multiScopeId,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator)
		throws com.comerica.exception.NoSuchMultiScopeAnnouncementsException {
		return getPersistence()
				   .findByMultiScopeId_Last(multiScopeId, orderByComparator);
	}

	/**
	* Returns the last multi scope announcements in the ordered set where multiScopeId = &#63;.
	*
	* @param multiScopeId the multi scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching multi scope announcements, or <code>null</code> if a matching multi scope announcements could not be found
	*/
	public static MultiScopeAnnouncements fetchByMultiScopeId_Last(
		long multiScopeId,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator) {
		return getPersistence()
				   .fetchByMultiScopeId_Last(multiScopeId, orderByComparator);
	}

	/**
	* Returns the multi scope announcementses before and after the current multi scope announcements in the ordered set where multiScopeId = &#63;.
	*
	* @param entryId the primary key of the current multi scope announcements
	* @param multiScopeId the multi scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next multi scope announcements
	* @throws NoSuchMultiScopeAnnouncementsException if a multi scope announcements with the primary key could not be found
	*/
	public static MultiScopeAnnouncements[] findByMultiScopeId_PrevAndNext(
		long entryId, long multiScopeId,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator)
		throws com.comerica.exception.NoSuchMultiScopeAnnouncementsException {
		return getPersistence()
				   .findByMultiScopeId_PrevAndNext(entryId, multiScopeId,
			orderByComparator);
	}

	/**
	* Removes all the multi scope announcementses where multiScopeId = &#63; from the database.
	*
	* @param multiScopeId the multi scope ID
	*/
	public static void removeByMultiScopeId(long multiScopeId) {
		getPersistence().removeByMultiScopeId(multiScopeId);
	}

	/**
	* Returns the number of multi scope announcementses where multiScopeId = &#63;.
	*
	* @param multiScopeId the multi scope ID
	* @return the number of matching multi scope announcementses
	*/
	public static int countByMultiScopeId(long multiScopeId) {
		return getPersistence().countByMultiScopeId(multiScopeId);
	}

	/**
	* Caches the multi scope announcements in the entity cache if it is enabled.
	*
	* @param multiScopeAnnouncements the multi scope announcements
	*/
	public static void cacheResult(
		MultiScopeAnnouncements multiScopeAnnouncements) {
		getPersistence().cacheResult(multiScopeAnnouncements);
	}

	/**
	* Caches the multi scope announcementses in the entity cache if it is enabled.
	*
	* @param multiScopeAnnouncementses the multi scope announcementses
	*/
	public static void cacheResult(
		List<MultiScopeAnnouncements> multiScopeAnnouncementses) {
		getPersistence().cacheResult(multiScopeAnnouncementses);
	}

	/**
	* Creates a new multi scope announcements with the primary key. Does not add the multi scope announcements to the database.
	*
	* @param entryId the primary key for the new multi scope announcements
	* @return the new multi scope announcements
	*/
	public static MultiScopeAnnouncements create(long entryId) {
		return getPersistence().create(entryId);
	}

	/**
	* Removes the multi scope announcements with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the multi scope announcements
	* @return the multi scope announcements that was removed
	* @throws NoSuchMultiScopeAnnouncementsException if a multi scope announcements with the primary key could not be found
	*/
	public static MultiScopeAnnouncements remove(long entryId)
		throws com.comerica.exception.NoSuchMultiScopeAnnouncementsException {
		return getPersistence().remove(entryId);
	}

	public static MultiScopeAnnouncements updateImpl(
		MultiScopeAnnouncements multiScopeAnnouncements) {
		return getPersistence().updateImpl(multiScopeAnnouncements);
	}

	/**
	* Returns the multi scope announcements with the primary key or throws a {@link NoSuchMultiScopeAnnouncementsException} if it could not be found.
	*
	* @param entryId the primary key of the multi scope announcements
	* @return the multi scope announcements
	* @throws NoSuchMultiScopeAnnouncementsException if a multi scope announcements with the primary key could not be found
	*/
	public static MultiScopeAnnouncements findByPrimaryKey(long entryId)
		throws com.comerica.exception.NoSuchMultiScopeAnnouncementsException {
		return getPersistence().findByPrimaryKey(entryId);
	}

	/**
	* Returns the multi scope announcements with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entryId the primary key of the multi scope announcements
	* @return the multi scope announcements, or <code>null</code> if a multi scope announcements with the primary key could not be found
	*/
	public static MultiScopeAnnouncements fetchByPrimaryKey(long entryId) {
		return getPersistence().fetchByPrimaryKey(entryId);
	}

	public static java.util.Map<java.io.Serializable, MultiScopeAnnouncements> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the multi scope announcementses.
	*
	* @return the multi scope announcementses
	*/
	public static List<MultiScopeAnnouncements> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the multi scope announcementses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MultiScopeAnnouncementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of multi scope announcementses
	* @param end the upper bound of the range of multi scope announcementses (not inclusive)
	* @return the range of multi scope announcementses
	*/
	public static List<MultiScopeAnnouncements> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the multi scope announcementses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MultiScopeAnnouncementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of multi scope announcementses
	* @param end the upper bound of the range of multi scope announcementses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of multi scope announcementses
	*/
	public static List<MultiScopeAnnouncements> findAll(int start, int end,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the multi scope announcementses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MultiScopeAnnouncementsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of multi scope announcementses
	* @param end the upper bound of the range of multi scope announcementses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of multi scope announcementses
	*/
	public static List<MultiScopeAnnouncements> findAll(int start, int end,
		OrderByComparator<MultiScopeAnnouncements> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the multi scope announcementses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of multi scope announcementses.
	*
	* @return the number of multi scope announcementses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static MultiScopeAnnouncementsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MultiScopeAnnouncementsPersistence, MultiScopeAnnouncementsPersistence> _serviceTracker =
		ServiceTrackerFactory.open(MultiScopeAnnouncementsPersistence.class);
}