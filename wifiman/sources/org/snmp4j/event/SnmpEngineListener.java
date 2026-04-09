package org.snmp4j.event;

import java.util.EventListener;

/* loaded from: classes2.dex */
public interface SnmpEngineListener extends EventListener {
    void engineChanged(SnmpEngineEvent snmpEngineEvent);
}
