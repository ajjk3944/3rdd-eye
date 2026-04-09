package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class CQ implements T0 {

    /* renamed from: a, reason: collision with root package name */
    public final LQ f7593a;

    /* renamed from: b, reason: collision with root package name */
    public final LQ f7594b;

    /* renamed from: c, reason: collision with root package name */
    public final C1938u0 f7595c = new C1938u0();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f7596d = new AtomicReference(BQ.f7352a);

    public CQ(LQ lq) {
        this.f7593a = lq;
        this.f7594b = lq;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final void a(int i, C2036vr c2036vr) {
        g().a(i, c2036vr);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final void b(C2036vr c2036vr, int i, int i3) {
        g().b(c2036vr, i, i3);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final void c(long j6, int i, int i3, int i6, S0 s02) {
        g().c(j6, i, i3, i6, s02);
        AtomicReference atomicReference = this.f7596d;
        if (atomicReference.get() == BQ.f7353b) {
            this.f7594b.l(false);
            atomicReference.set(BQ.f7354c);
        }
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final int d(IN in, int i, boolean z6) {
        return g().d(in, i, z6);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final void e(TP tp) {
        this.f7593a.e(tp);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final int f(IN in, int i, boolean z6) {
        return g().f(in, i, z6);
    }

    public final T0 g() {
        return this.f7596d.get() == BQ.f7354c ? this.f7595c : this.f7594b;
    }
}
