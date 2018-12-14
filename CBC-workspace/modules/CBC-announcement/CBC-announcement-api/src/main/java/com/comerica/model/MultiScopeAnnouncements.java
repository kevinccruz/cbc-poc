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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the MultiScopeAnnouncements service. Represents a row in the &quot;MultiScopeAnnouncements_MultiScopeAnnouncements&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MultiScopeAnnouncementsModel
 * @see com.comerica.model.impl.MultiScopeAnnouncementsImpl
 * @see com.comerica.model.impl.MultiScopeAnnouncementsModelImpl
 * @generated
 */
@ImplementationClassName("com.comerica.model.impl.MultiScopeAnnouncementsImpl")
@ProviderType
public interface MultiScopeAnnouncements extends MultiScopeAnnouncementsModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.comerica.model.impl.MultiScopeAnnouncementsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MultiScopeAnnouncements, Long> ENTRY_ID_ACCESSOR =
		new Accessor<MultiScopeAnnouncements, Long>() {
			@Override
			public Long get(MultiScopeAnnouncements multiScopeAnnouncements) {
				return multiScopeAnnouncements.getEntryId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<MultiScopeAnnouncements> getTypeClass() {
				return MultiScopeAnnouncements.class;
			}
		};
}