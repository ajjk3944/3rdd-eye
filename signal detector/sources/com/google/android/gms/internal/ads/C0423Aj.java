package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Aj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423Aj implements s2.k {

    /* renamed from: a, reason: collision with root package name */
    public final C2191yk f7029a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f7030b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f7031c = new AtomicBoolean(false);

    public C0423Aj(C2191yk c2191yk) {
        this.f7029a = c2191yk;
    }

    @Override // s2.k
    public final void I0() {
    }

    @Override // s2.k
    public final void K1() {
    }

    @Override // s2.k
    public final void N2() {
    }

    @Override // s2.k
    public final void R1() {
    }

    @Override // s2.k
    public final void d1() {
    }

    @Override // s2.k
    public final void g() {
        this.f7029a.C1(C1652ok.f16043f);
    }

    @Override // s2.k
    public final void h0() {
    }

    @Override // s2.k
    public final void j2() {
        AtomicBoolean atomicBoolean = this.f7031c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f7029a.C1(C1652ok.i);
    }

    @Override // s2.k
    public final void k0(int i) {
        this.f7030b.set(true);
        AtomicBoolean atomicBoolean = this.f7031c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f7029a.C1(C1652ok.i);
    }

    @Override // s2.k
    public final void n1() {
    }

    @Override // s2.k
    public final void x1() {
    }
}
