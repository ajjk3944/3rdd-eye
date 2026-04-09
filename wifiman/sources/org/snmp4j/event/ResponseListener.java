package org.snmp4j.event;

import java.util.EventListener;

/* loaded from: classes2.dex */
public interface ResponseListener extends EventListener {
    void onResponse(ResponseEvent responseEvent);
}
