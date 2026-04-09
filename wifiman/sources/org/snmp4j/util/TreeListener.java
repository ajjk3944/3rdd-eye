package org.snmp4j.util;

import java.util.EventListener;

/* loaded from: classes2.dex */
public interface TreeListener extends EventListener {
    void finished(TreeEvent treeEvent);

    boolean isFinished();

    boolean next(TreeEvent treeEvent);
}
