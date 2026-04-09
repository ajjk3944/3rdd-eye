package org.snmp4j.event;

import java.util.EventListener;

/* loaded from: classes2.dex */
public interface AuthenticationFailureListener extends EventListener {
    void authenticationFailure(AuthenticationFailureEvent authenticationFailureEvent);
}
