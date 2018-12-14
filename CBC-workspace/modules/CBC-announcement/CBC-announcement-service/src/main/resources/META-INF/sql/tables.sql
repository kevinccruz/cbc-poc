create table MultiScopeAnnouncements_MultiScopeAnnouncements (
	uuid_ VARCHAR(75) null,
	entryId LONG not null primary key,
	multiScopeId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);