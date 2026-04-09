package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m60 extends hp1 implements j60 {

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f13774c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f13775d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13776e;

    public m60(l60 l60Var, Set set, ex exVar, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f13776e = false;
        this.f13774c = scheduledExecutorService;
        m1(l60Var, exVar);
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void J(va.w1 w1Var) {
        p1(new fk0(21, w1Var));
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void K(e90 e90Var) {
        if (this.f13776e) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f13775d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        p1(new mx0(19, e90Var));
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void c() {
        p1(hl.g);
    }

    public final void v1() {
        this.f13775d = this.f13774c.schedule(new s30(5, this), ((Integer) va.s.f36163e.f36166c.a(sk.Wb)).intValue(), TimeUnit.MILLISECONDS);
    }
}
