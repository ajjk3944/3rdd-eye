package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x40 implements xa.l {

    /* renamed from: a, reason: collision with root package name */
    public final t60 f18304a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f18305b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f18306c = new AtomicBoolean(false);

    public x40(t60 t60Var) {
        this.f18304a = t60Var;
    }

    @Override // xa.l
    public final void D2() {
        AtomicBoolean atomicBoolean = this.f18306c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f18304a.p1(k60.f13049h);
    }

    @Override // xa.l
    public final void e0(int i4) {
        this.f18305b.set(true);
        AtomicBoolean atomicBoolean = this.f18306c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f18304a.p1(k60.f13049h);
    }

    @Override // xa.l
    public final void z1() {
        this.f18304a.p1(k60.f13047e);
    }

    @Override // xa.l
    public final void T() {
    }

    @Override // xa.l
    public final void U0() {
    }

    @Override // xa.l
    public final void a2() {
    }

    @Override // xa.l
    public final void g1() {
    }

    @Override // xa.l
    public final void h3() {
    }

    @Override // xa.l
    public final void k2() {
    }

    @Override // xa.l
    public final void r0() {
    }

    @Override // xa.l
    public final void u1() {
    }
}
