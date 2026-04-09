package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d50 implements b80, w60 {

    /* renamed from: a, reason: collision with root package name */
    public final tb.a f10331a;

    /* renamed from: b, reason: collision with root package name */
    public final e50 f10332b;

    /* renamed from: c, reason: collision with root package name */
    public final hq0 f10333c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10334d;

    public d50(tb.a aVar, e50 e50Var, hq0 hq0Var, String str) {
        this.f10331a = aVar;
        this.f10332b = e50Var;
        this.f10333c = hq0Var;
        this.f10334d = str;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void a() {
        this.f10331a.getClass();
        this.f10332b.f10707c.put(this.f10334d, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void e() {
        this.f10331a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.f10333c.g;
        e50 e50Var = this.f10332b;
        ConcurrentHashMap concurrentHashMap = e50Var.f10707c;
        String str2 = this.f10334d;
        Long l10 = (Long) concurrentHashMap.get(str2);
        if (l10 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        e50Var.f10708d.put(str, Long.valueOf(jElapsedRealtime - l10.longValue()));
    }
}
