package org.snmp4j.util;

/* loaded from: classes2.dex */
public interface WorkerPool {
    void cancel();

    void execute(WorkerTask workerTask);

    boolean isIdle();

    void stop();

    boolean tryToExecute(WorkerTask workerTask);
}
