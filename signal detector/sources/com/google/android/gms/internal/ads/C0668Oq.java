package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Oq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668Oq implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ St f10254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Qt f10255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2148xv f10257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Xt f10258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0702Qq f10259g;

    public C0668Oq(C0702Qq c0702Qq, long j6, St st, Qt qt, String str, C2148xv c2148xv, Xt xt) {
        this.f10253a = j6;
        this.f10254b = st;
        this.f10255c = qt;
        this.f10256d = str;
        this.f10257e = c2148xv;
        this.f10258f = xt;
        Objects.requireNonNull(c0702Qq);
        this.f10259g = c0702Qq;
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public final void mo11d(Object obj) {
        long j6;
        C0702Qq c0702Qq = this.f10259g;
        c0702Qq.f10710a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f10253a;
        synchronized (c0702Qq) {
            try {
                if (c0702Qq.f10714e) {
                    c0702Qq.f10711b.r(this.f10254b, this.f10255c, 0, null, jElapsedRealtime);
                    j6 = jElapsedRealtime;
                } else {
                    j6 = jElapsedRealtime;
                }
                if (c0702Qq.f10716g) {
                    return;
                }
                Qt qt = this.f10255c;
                if (c0702Qq.h(qt)) {
                    ((C0685Pq) c0702Qq.f10713d.get(qt)).f10520d = j6;
                } else {
                    c0702Qq.f10713d.put(qt, new C0685Pq(this.f10256d, qt.f10767f0, 0, j6, null));
                }
                c0702Qq.f10715f.c(qt, j6, null, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.BD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(java.lang.Throwable r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0668Oq.u(java.lang.Throwable):void");
    }
}
