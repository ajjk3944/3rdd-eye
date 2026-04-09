package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Ok {

    /* renamed from: a, reason: collision with root package name */
    public final C4933ro f39945a;

    public Ok(C4933ro c4933ro) {
        this.f39945a = c4933ro;
    }

    public final long a() {
        long jOptLong;
        C4933ro c4933ro = this.f39945a;
        synchronized (c4933ro) {
            jOptLong = c4933ro.f41594a.a().optLong("session_id", -1L);
        }
        long j4 = jOptLong >= 10000000000L ? 1 + jOptLong : 10000000000L;
        this.f39945a.c(j4);
        return j4;
    }
}
