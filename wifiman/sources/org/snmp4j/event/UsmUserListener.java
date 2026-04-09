package org.snmp4j.event;

import java.util.EventListener;

/* loaded from: classes2.dex */
public interface UsmUserListener extends EventListener {
    void usmUserChange(UsmUserEvent usmUserEvent);
}
