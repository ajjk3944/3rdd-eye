package org.snmp4j.util;

import java.util.EventListener;

/* loaded from: classes2.dex */
public interface TableListener extends EventListener {
    void finished(TableEvent tableEvent);

    boolean isFinished();

    boolean next(TableEvent tableEvent);
}
