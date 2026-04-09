package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lj0 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yp0 f13502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wp0 f13503c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bt0 f13505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dq0 f13506f;
    public final /* synthetic */ nj0 g;

    public lj0(nj0 nj0Var, long j, yp0 yp0Var, wp0 wp0Var, String str, bt0 bt0Var, dq0 dq0Var) {
        this.f13501a = j;
        this.f13502b = yp0Var;
        this.f13503c = wp0Var;
        this.f13504d = str;
        this.f13505e = bt0Var;
        this.f13506f = dq0Var;
        Objects.requireNonNull(nj0Var);
        this.g = nj0Var;
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public final void mo163h(Object obj) {
        long j;
        nj0 nj0Var = this.g;
        nj0Var.f14296a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f13501a;
        synchronized (nj0Var) {
            try {
                if (nj0Var.f14300e) {
                    nj0Var.f14297b.q(this.f13502b, this.f13503c, 0, null, jElapsedRealtime);
                    j = jElapsedRealtime;
                } else {
                    j = jElapsedRealtime;
                }
                if (nj0Var.g) {
                    return;
                }
                wp0 wp0Var = this.f13503c;
                if (nj0Var.h(wp0Var)) {
                    ((mj0) nj0Var.f14299d.get(wp0Var)).f13912d = j;
                } else {
                    nj0Var.f14299d.put(wp0Var, new mj0(this.f13504d, wp0Var.f18083f0, 0, j, null));
                }
                nj0Var.f14301f.c(wp0Var, j, null, true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.p81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(java.lang.Throwable r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lj0.n(java.lang.Throwable):void");
    }
}
