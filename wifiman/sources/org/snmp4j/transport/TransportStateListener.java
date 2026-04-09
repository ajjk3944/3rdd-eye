package org.snmp4j.transport;

import java.util.EventListener;

/* loaded from: classes2.dex */
public interface TransportStateListener extends EventListener {
    void connectionStateChanged(TransportStateEvent transportStateEvent);
}
