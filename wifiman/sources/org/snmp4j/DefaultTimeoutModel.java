package org.snmp4j;

/* loaded from: classes2.dex */
public class DefaultTimeoutModel implements TimeoutModel {
    @Override // org.snmp4j.TimeoutModel
    public long getRequestTimeout(int i10, long j10) {
        return (i10 + 1) * j10;
    }

    @Override // org.snmp4j.TimeoutModel
    public long getRetryTimeout(int i10, int i11, long j10) {
        return j10;
    }
}
