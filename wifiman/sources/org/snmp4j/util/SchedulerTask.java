package org.snmp4j.util;

/* loaded from: classes2.dex */
public interface SchedulerTask extends WorkerTask {
    boolean isDone();

    boolean isReadyToRun();
}
