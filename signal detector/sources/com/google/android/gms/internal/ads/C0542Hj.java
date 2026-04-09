package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.Hj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542Hj implements InterfaceC1169fl, InterfaceC0441Bk {

    /* renamed from: a, reason: collision with root package name */
    public final Q2.a f8988a;

    /* renamed from: b, reason: collision with root package name */
    public final C0576Jj f8989b;

    /* renamed from: c, reason: collision with root package name */
    public final C0960bu f8990c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8991d;

    public C0542Hj(Q2.a aVar, C0576Jj c0576Jj, C0960bu c0960bu, String str) {
        this.f8988a = aVar;
        this.f8989b = c0576Jj;
        this.f8990c = c0960bu;
        this.f8991d = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1169fl
    public final void a() {
        this.f8988a.getClass();
        this.f8989b.f9343c.put(this.f8991d, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441Bk
    public final void e() {
        this.f8988a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.f8990c.f13485g;
        C0576Jj c0576Jj = this.f8989b;
        ConcurrentHashMap concurrentHashMap = c0576Jj.f9343c;
        String str2 = this.f8991d;
        Long l2 = (Long) concurrentHashMap.get(str2);
        if (l2 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        c0576Jj.f9344d.put(str, Long.valueOf(jElapsedRealtime - l2.longValue()));
    }
}
