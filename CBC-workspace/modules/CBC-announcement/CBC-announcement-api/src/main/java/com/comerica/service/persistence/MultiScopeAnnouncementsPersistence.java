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

import com.comerica.exception.NoSuchMultiScopeAnnouncementsException;

import com.comerica.model.MultiScopeAnnouncements;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the multi scope announcements service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.comerica.service.persistence.impl.MultiScopeAnnouncementsPersistenceImpl
 * @see MultiScopeAnnouncementsUtil
 * @generated
 */
@ProviderType
public interface MultiScopeAnnouncementsPersistence extends BasePersistence<MultiScopeAnnouncements> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MultiScopeAnnouncementsUtil} to access the multi scope announcements persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the multi scope announcementses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching multi scope announcementses
	*/
	public java.util.List<MultiScopeAnnouncements> findByUuid(
		java.lang.String uuid);

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
	public java.util.List<MultiScopeAnnouncements> findByUuid(
		java.lang.String uuid, int start, int end);

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
	public java.util.List<MultiScopeAnnouncements> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator);

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
	public java.util.List<MultiScopeAnnouncements> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first multi scope announcements in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching multi scope announcements
	* @throws NoSuchMultiScopeAnnouncementsException if a matching multi scope announcements could not be found
	*/
	public MultiScopeAnnouncements findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator)
		throws NoSuchMultiScopeAnnouncementsException;

	/**
	* Returns the first multi scope announcements in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching multi scope announcements, or <code>null</code> if a matching multi scope announcements could not be found
	*/
	public MultiScopeAnnouncements fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator);

	/**
	* Returns the last multi scope announcements in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching multi scope announcements
	* @throws NoSuchMultiScopeAnnouncementsException if a matching multi scope announcements could not be found
	*/
	public MultiScopeAnnouncements findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator)
		throws NoSuchMultiScopeAnnouncementsException;

	/**
	* Returns the last multi scope announcements in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching multi scope announcements, or <code>null</code> if a matching multi scope announcements could not be found
	*/
	public MultiScopeAnnouncements fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator);

	/**
	* Returns the multi scope announcementses before and after the current multi scope announcements in the ordered set where uuid = &#63;.
	*
	* @param entryId the primary key of the current multi scope announcements
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next multi scope announcements
	* @throws NoSuchMultiScopeAnnouncementsException if a multi scope announcements with the primary key could not be found
	*/
	public MultiScopeAnnouncements[] findByUuid_PrevAndNext(long entryId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator)
		throws NoSuchMultiScopeAnnouncementsException;

	/**
	* Removes all the multi scope announcementses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of multi scope announcementses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching multi scope announcementses
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns all the multi scope announcementses where multiScopeId = &#63;.
	*
	* @param multiScopeId the multi scope ID
	* @return the matching multi scope announcementses
	*/
	public java.util.List<MultiScopeAnnouncements> findByMultiScopeId(
		long multiScopeId);

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
	public java.util.List<MultiScopeAnnouncements> findByMultiScopeId(
		long multiScopeId, int start, int end);

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
	public java.util.List<MultiScopeAnnouncements> findByMultiScopeId(
		long multiScopeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator);

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
	public java.util.List<MultiScopeAnnouncements> findByMultiScopeId(
		long multiScopeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first multi scope announcements in the ordered set where multiScopeId = &#63;.
	*
	* @param multiScopeId the multi scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching multi scope announcements
	* @throws NoSuchMultiScopeAnnouncementsException if a matching multi scope announcements could not be found
	*/
	public MultiScopeAnnouncements findByMultiScopeId_First(long multiScopeId,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator)
		throws NoSuchMultiScopeAnnouncementsException;

	/**
	* Returns the first multi scope announcements in the ordered set where multiScopeId = &#63;.
	*
	* @param multiScopeId the multi scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching multi scope announcements, or <code>null</code> if a matching multi scope announcements could not be found
	*/
	public MultiScopeAnnouncements fetchByMultiScopeId_First(
		long multiScopeId,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator);

	/**
	* Returns the last multi scope announcements in the ordered set where multiScopeId = &#63;.
	*
	* @param multiScopeId the multi scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching multi scope announcements
	* @throws NoSuchMultiScopeAnnouncementsException if a matching multi scope announcements could not be found
	*/
	public MultiScopeAnnouncements findByMultiScopeId_Last(long multiScopeId,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator)
		throws NoSuchMultiScopeAnnouncementsException;

	/**
	* Returns the last multi scope announcements in the ordered set where multiScopeId = &#63;.
	*
	* @param multiScopeId the multi scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching multi scope announcements, or <code>null</code> if a matching multi scope announcements could not be found
	*/
	public MultiScopeAnnouncements fetchByMultiScopeId_Last(long multiScopeId,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator);

	/**
	* Returns the multi scope announcementses before and after the current multi scope announcements in the ordered set where multiScopeId = &#63;.
	*
	* @param entryId the primary key of the current multi scope announcements
	* @param multiScopeId the multi scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next multi scope announcements
	* @throws NoSuchMultiScopeAnnouncementsException if a multi scope announcements with the primary key could not be found
	*/
	public MultiScopeAnnouncements[] findByMultiScopeId_PrevAndNext(
		long entryId, long multiScopeId,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator)
		throws NoSuchMultiScopeAnnouncementsException;

	/**
	* Removes all the multi scope announcementses where multiScopeId = &#63; from the database.
	*
	* @param multiScopeId the multi scope ID
	*/
	public void removeByMultiScopeId(long multiScopeId);

	/**
	* Returns the number of multi scope announcementses where multiScopeId = &#63;.
	*
	* @param multiScopeId the multi scope ID
	* @return the number of matching multi scope announcementses
	*/
	public int countByMultiScopeId(long multiScopeId);

	/**
	* Caches the multi scope announcements in the entity cache if it is enabled.
	*
	* @param multiScopeAnnouncements the multi scope announcements
	*/
	public void cacheResult(MultiScopeAnnouncements multiScopeAnnouncements);

	/**
	* Caches the multi scope announcementses in the entity cache if it is enabled.
	*
	* @param multiScopeAnnouncementses the multi scope announcementses
	*/
	public void cacheResult(
		java.util.List<MultiScopeAnnouncements> multiScopeAnnouncementses);

	/**
	* Creates a new multi scope announcements with the primary key. Does not add the multi scope announcements to the database.
	*
	* @param entryId the primary key for the new multi scope announcements
	* @return the new multi scope announcements
	*/
	public MultiScopeAnnouncements create(long entryId);

	/**
	* Removes the multi scope announcements with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the multi scope announcements
	* @return the multi scope announcements that was removed
	* @throws NoSuchMultiScopeAnnouncementsException if a multi scope announcements with the primary key could not be found
	*/
	public MultiScopeAnnouncements remove(long entryId)
		throws NoSuchMultiScopeAnnouncementsException;

	public MultiScopeAnnouncements updateImpl(
		MultiScopeAnnouncements multiScopeAnnouncements);

	/**
	* Returns the multi scope announcements with the primary key or throws a {@link NoSuchMultiScopeAnnouncementsException} if it could not be found.
	*
	* @param entryId the primary key of the multi scope announcements
	* @return the multi scope announcements
	* @throws NoSuchMultiScopeAnnouncementsException if a multi scope announcements with the primary key could not be found
	*/
	public MultiScopeAnnouncements findByPrimaryKey(long entryId)
		throws NoSuchMultiScopeAnnouncementsException;

	/**
	* Returns the multi scope announcements with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entryId the primary key of the multi scope announcements
	* @return the multi scope announcements, or <code>null</code> if a multi scope announcements with the primary key could not be found
	*/
	public MultiScopeAnnouncements fetchByPrimaryKey(long entryId);

	@Override
	public java.util.Map<java.io.Serializable, MultiScopeAnnouncements> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the multi scope announcementses.
	*
	* @return the multi scope announcementses
	*/
	public java.util.List<MultiScopeAnnouncements> findAll();

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
	public java.util.List<MultiScopeAnnouncements> findAll(int start, int end);

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
	public java.util.List<MultiScopeAnnouncements> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator);

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
	public java.util.List<MultiScopeAnnouncements> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MultiScopeAnnouncements> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the multi scope announcementses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of multi scope announcementses.
	*
	* @return the number of multi scope announcementses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}