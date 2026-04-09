package com.bytedance.sdk.component.lh.ouw;

import android.os.SystemClock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public long fkw;

    /* renamed from: le, reason: collision with root package name */
    public long f7588le;

    /* renamed from: lh, reason: collision with root package name */
    public long f7589lh;
    public long ouw = SystemClock.elapsedRealtime();
    public long pno;
    public long ra;
    public long vt;
    public long yu;

    public final String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.ouw + ", asyncCallExecTs=" + this.vt + ", requestStartExecTs=" + this.f7589lh + ", requestConnectStartTs=" + this.yu + ", requestConnectFinishTs=" + this.fkw + ", reqCallServerStartTs=" + this.ra + ", reqCallServerFinishTs=" + this.pno + '}';
    }
}
