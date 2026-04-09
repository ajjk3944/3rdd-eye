package org.snmp4j.util;

/* loaded from: classes2.dex */
public interface WorkerTask extends Runnable {
    void interrupt();

    void join() throws InterruptedException;

    void terminate();
}
