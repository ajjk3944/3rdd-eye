package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s50 implements xa.l {

    /* renamed from: b, reason: collision with root package name */
    public final dq0 f15873b;

    /* renamed from: c, reason: collision with root package name */
    public final wp0 f15874c;

    /* renamed from: d, reason: collision with root package name */
    public final tb.a f15875d;

    /* renamed from: e, reason: collision with root package name */
    public final qd0 f15876e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f15877f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f15872a = new Object();
    public final qs0 g = rs0.A();

    /* renamed from: h, reason: collision with root package name */
    public boolean f15878h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15879i = false;

    public s50(dq0 dq0Var, wp0 wp0Var, tb.a aVar, qd0 qd0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f15873b = dq0Var;
        this.f15874c = wp0Var;
        this.f15875d = aVar;
        this.f15876e = qd0Var;
        this.f15877f = scheduledExecutorService;
    }

    @Override // xa.l
    public final void T() {
        b(4);
    }

    @Override // xa.l
    public final void U0() {
        b(10);
    }

    public final void a() {
        synchronized (this.f15872a) {
            try {
                qd0 qd0Var = this.f15876e;
                String str = ((yp0) this.f15873b.f10544b.f9452c).f18820b;
                String strEncodeToString = Base64.encodeToString(((rs0) this.g.e()).b(), 1);
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16130fe)).booleanValue()) {
                    rt rtVarA = qd0Var.a();
                    rtVarA.u("action", "pclma");
                    rtVarA.u("pclmd", strEncodeToString);
                    rtVarA.u("gqi", str);
                    rtVarA.x();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xa.l
    public final void a2() {
        b(5);
    }

    public final void b(int i4) {
        synchronized (this.f15872a) {
            try {
                if (!this.f15879i && this.f15878h) {
                    qs0 qs0Var = this.g;
                    wr0 wr0VarA = xr0.A();
                    wr0VarA.b();
                    ((xr0) wr0VarA.f14755b).C(i4);
                    this.f15875d.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    wr0VarA.b();
                    ((xr0) wr0VarA.f14755b).B(jCurrentTimeMillis);
                    xr0 xr0Var = (xr0) wr0VarA.e();
                    qs0Var.b();
                    ((rs0) qs0Var.f14755b).B(xr0Var);
                    if (i4 == 10) {
                        a();
                        this.f15879i = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // xa.l
    public final void g1() {
        b(3);
    }

    @Override // xa.l
    public final void h3() {
        b(7);
    }

    @Override // xa.l
    public final void k2() {
        b(6);
    }

    @Override // xa.l
    public final void r0() {
        b(9);
    }

    @Override // xa.l
    public final void u1() {
        b(8);
    }

    @Override // xa.l
    public final void D2() {
    }

    @Override // xa.l
    public final void z1() {
    }

    @Override // xa.l
    public final void e0(int i4) {
    }
}
