package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d70 extends hp1 implements p60, b70 {

    /* renamed from: c, reason: collision with root package name */
    public final wp0 f10347c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f10348d;

    /* renamed from: e, reason: collision with root package name */
    public final dq0 f10349e;

    public d70(Set set, wp0 wp0Var, dq0 dq0Var) {
        super(set);
        this.f10348d = new AtomicBoolean();
        this.f10347c = wp0Var;
        this.f10349e = dq0Var;
    }

    @Override // com.google.android.gms.internal.ads.hp1, com.google.android.gms.internal.ads.b70
    public final void B1() {
        if (this.f10347c.f18074b == 1) {
            v1();
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void n() {
        int i4 = this.f10347c.f18074b;
        if (i4 == 2 || i4 == 5 || i4 == 4 || i4 == 6 || i4 == 7) {
            v1();
        }
    }

    public final void v1() {
        va.d3 d3Var;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.S8)).booleanValue() && this.f10348d.compareAndSet(false, true) && (d3Var = this.f10347c.f18081e0) != null && d3Var.f36064a == 3) {
            p1(new fk0(22, d3Var));
        }
    }
}
