package org.snmp4j.mp;

/* loaded from: classes2.dex */
public interface RequestStatistics {
    int getIndexOfMessageResponded();

    long getResponseRuntimeNanos();

    int getTotalMessagesSent();

    void setIndexOfMessageResponded(int i10);

    void setResponseRuntimeNanos(long j10);

    void setTotalMessagesSent(int i10);
}
