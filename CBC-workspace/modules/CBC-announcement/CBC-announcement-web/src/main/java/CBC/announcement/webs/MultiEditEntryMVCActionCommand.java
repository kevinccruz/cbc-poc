/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package CBC.announcement.webs;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.comerica.model.MultiScopeAnnouncements;
import com.comerica.service.MultiScopeAnnouncementsLocalService;
import com.comerica.service.MultiScopeAnnouncementsService;
import com.liferay.announcements.kernel.model.AnnouncementsEntry;
import com.liferay.announcements.kernel.service.AnnouncementsEntryService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

/**
 * @author Raymond Aug??
 */
@Component(
	property = {
		"javax.portlet.name=" + "com_liferay_announcements_web_portlet_AlertsPortlet",
		"javax.portlet.name=" + "com_liferay_announcements_web_portlet_AnnouncementsPortlet",
		"mvc.command.name=/announcements/multi_edit_entry"
},
	service = MVCActionCommand.class
)

public class MultiEditEntryMVCActionCommand extends BaseMVCActionCommand {
	
	protected void deleteEntry(ActionRequest actionRequest) throws Exception {
		long entryId = ParamUtil.getLong(actionRequest, "entryId");
		
		//cross reference MultiScope Entry, for each Entry deleteEntry
		List<MultiScopeAnnouncements> msaList = 
				_multiScopeAnnouncementsLocalService.retrieveMultiScopeAnnouncements(entryId);
		
		if(Validator.isNotNull(msaList)) {
			for (MultiScopeAnnouncements msa : msaList) {
				long id = msa.getEntryId();
				_announcementsEntryService.deleteEntry(id);
			}
		}else {
			_announcementsEntryService.deleteEntry(entryId);
		}

	}

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

		try {
			if (cmd.equals(Constants.ADD) || cmd.equals(Constants.UPDATE)) {
				updateEntry(actionRequest);
			}
			else if (cmd.equals(Constants.DELETE)) {
				deleteEntry(actionRequest);
			}
		}
		catch (Exception e) {

			SessionErrors.add(actionRequest, e.getClass());
		}
	}

	@Reference(unbind = "-")
	protected void setAnnouncementsEntryService(
		AnnouncementsEntryService announcementsEntryService) {

		_announcementsEntryService = announcementsEntryService;
	}
	
	@Reference(unbind = "-")
	protected void setMultiScopeAnnouncementsLocalService(
			MultiScopeAnnouncementsLocalService multiScopeAnnouncementsLocalService) {
		_multiScopeAnnouncementsLocalService = multiScopeAnnouncementsLocalService;
	}
	
	protected void updateEntry(ActionRequest actionRequest) throws Exception {
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		long entryId = ParamUtil.getLong(actionRequest, "entryId");

		//Check for MultipleScopes, otherwise process as one.
		boolean multipleScope = false;
		
		String[] multipleScopes = ParamUtil.getStringValues(actionRequest, "distributionScope");
		int scopeCount = multipleScopes.length;
		if(scopeCount > 0) {
			multipleScope = true;
		}
		ArrayList<Long> announcementEntryIds = new ArrayList<Long>();
		
		int iterations = 0;
		do {
			String[] distributionScopeParts;
			if(multipleScope) {
				distributionScopeParts = StringUtil.split(multipleScopes[iterations]);
			} else {
				distributionScopeParts = StringUtil.split(
						ParamUtil.getString(actionRequest, "distributionScope"));
			}

			long classNameId = 0;
			long classPK = 0;

			if (distributionScopeParts.length == 2) {
				classNameId = GetterUtil.getLong(distributionScopeParts[0]);

				if (classNameId > 0) {
					classPK = GetterUtil.getLong(distributionScopeParts[1]);
				}
			}

			String title = ParamUtil.getString(actionRequest, "title");
			String content = ParamUtil.getString(actionRequest, "content");
			String url = ParamUtil.getString(actionRequest, "url");
			String type = ParamUtil.getString(actionRequest, "type");

			int displayDateMonth = ParamUtil.getInteger(
				actionRequest, "displayDateMonth");
			int displayDateDay = ParamUtil.getInteger(
				actionRequest, "displayDateDay");
			int displayDateYear = ParamUtil.getInteger(
				actionRequest, "displayDateYear");
			int displayDateHour = ParamUtil.getInteger(
				actionRequest, "displayDateHour");
			int displayDateMinute = ParamUtil.getInteger(
				actionRequest, "displayDateMinute");
			int displayDateAmPm = ParamUtil.getInteger(
				actionRequest, "displayDateAmPm");

			if (displayDateAmPm == Calendar.PM) {
				displayDateHour += 12;
			}

			boolean displayImmediately = ParamUtil.getBoolean(
				actionRequest, "displayImmediately");

			int expirationDateMonth = ParamUtil.getInteger(
				actionRequest, "expirationDateMonth");
			int expirationDateDay = ParamUtil.getInteger(
				actionRequest, "expirationDateDay");
			int expirationDateYear = ParamUtil.getInteger(
				actionRequest, "expirationDateYear");
			int expirationDateHour = ParamUtil.getInteger(
				actionRequest, "expirationDateHour");
			int expirationDateMinute = ParamUtil.getInteger(
				actionRequest, "expirationDateMinute");
			int expirationDateAmPm = ParamUtil.getInteger(
				actionRequest, "expirationDateAmPm");

			if (expirationDateAmPm == Calendar.PM) {
				expirationDateHour += 12;
			}

			int priority = ParamUtil.getInteger(actionRequest, "priority");
			boolean alert = ParamUtil.getBoolean(actionRequest, "alert");

			if (entryId <= 0) {

				// Add entry

				AnnouncementsEntry aes = _announcementsEntryService.addEntry(
					themeDisplay.getPlid(), classNameId, classPK, title, content,
					url, type, displayDateMonth, displayDateDay, displayDateYear,
					displayDateHour, displayDateMinute, displayImmediately,
					expirationDateMonth, expirationDateDay, expirationDateYear,
					expirationDateHour, expirationDateMinute, priority, alert);
				
				// Adds to multiScopes table if more than one scope
				if (multipleScopes.length > 0) {
					announcementEntryIds.add(aes.getEntryId());
				}
			}
			else {

				// Update entry
				
				// Check MultiScope for other related entries
				// for each other related entry, updateEntry with that entryid
				List<MultiScopeAnnouncements> msaList = 
						_multiScopeAnnouncementsLocalService.retrieveMultiScopeAnnouncements(entryId);
				
				if(Validator.isNotNull(msaList)) {
					for (MultiScopeAnnouncements msa : msaList) {
						long id = msa.getEntryId();
						_announcementsEntryService.updateEntry(
								id, title, content, url, type, displayDateMonth,
								displayDateDay, displayDateYear, displayDateHour,
								displayDateMinute, displayImmediately, expirationDateMonth,
								expirationDateDay, expirationDateYear, expirationDateHour,
								expirationDateMinute, priority);
					}
				} else {
					_announcementsEntryService.updateEntry(
							entryId, title, content, url, type, displayDateMonth,
							displayDateDay, displayDateYear, displayDateHour,
							displayDateMinute, displayImmediately, expirationDateMonth,
							expirationDateDay, expirationDateYear, expirationDateHour,
							expirationDateMinute, priority);
				}
			}
			
			iterations++;
		} while(iterations < scopeCount);
		
		if(multipleScopes.length > 0) {
			_multiScopeAnnouncementsLocalService.addMultiScopeAnnouncements(announcementEntryIds);
		}
	}
	
	private AnnouncementsEntryService _announcementsEntryService;
	private MultiScopeAnnouncementsLocalService _multiScopeAnnouncementsLocalService;
}