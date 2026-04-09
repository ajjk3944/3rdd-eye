package com.singular.sdk.internal;

import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public interface BatchManagerPersistence {
    boolean addEvent(String str, String str2);

    boolean deleteEvent(String str);

    Set<Map.Entry<String, String>> getAllEvents();

    long getSendId();

    long incSendId();

    boolean updateEvent(String str, String str2);
}
