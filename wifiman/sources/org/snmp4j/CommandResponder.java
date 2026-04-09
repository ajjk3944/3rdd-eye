package org.snmp4j;

import java.util.EventListener;

/* loaded from: classes2.dex */
public interface CommandResponder extends EventListener {
    void processPdu(CommandResponderEvent commandResponderEvent);
}
