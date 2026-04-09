package org.snmp4j.event;

import java.util.EventListener;

/* loaded from: classes2.dex */
public interface CounterListener extends EventListener {
    void incrementCounter(CounterEvent counterEvent);
}
