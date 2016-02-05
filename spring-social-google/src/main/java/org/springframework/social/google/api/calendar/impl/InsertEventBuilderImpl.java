package org.springframework.social.google.api.calendar.impl;

import org.springframework.social.google.api.calendar.InsertEventBuilder;

import java.text.MessageFormat;

/**
 * Created by ldowell on 2/5/16.
 */
public class InsertEventBuilderImpl extends UriQueryBuilderImpl<InsertEventBuilder, Object> implements InsertEventBuilder {

    public InsertEventBuilderImpl(String urlTemplate, String calendarId) {
        super(MessageFormat.format(urlTemplate, encode(calendarId)));
    }

    @Override
    public InsertEventBuilder sendNotifications(boolean sendNotifications) {
        return appendQueryParam("sendNotifications", sendNotifications);
    }

    @Override
    public InsertEventBuilder maxAttendees(int maxAttendees) {
        return appendQueryParam("maxAttendees", maxAttendees);
    }

    @Override
    public InsertEventBuilder supportsAttachments(boolean supportsAttachments) {
        return appendQueryParam("supportsAttachments", supportsAttachments);
    }
}
