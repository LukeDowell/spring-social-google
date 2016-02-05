package org.springframework.social.google.api.calendar;

/**
 * Builds a URI with optional query parameters for inserting a new event
 *
 * https://developers.google.com/google-apps/calendar/v3/reference/events/insert
 *
 * Created by ldowell on 2/5/16.
 */
public interface InsertEventBuilder extends UriQueryBuilder<InsertEventBuilder, Object> {

    InsertEventBuilder sendNotifications(boolean sendNotifications);

    InsertEventBuilder maxAttendees(int maxAttendees);

    InsertEventBuilder supportsAttachments(boolean supportsAttachments);
}
