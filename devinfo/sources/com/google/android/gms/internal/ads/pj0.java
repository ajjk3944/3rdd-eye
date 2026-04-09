package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pj0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15015a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f15016b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f15017c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f15018d;

    public /* synthetic */ pj0(js1 js1Var, js1 js1Var2, js1 js1Var3, int i4) {
        this.f15015a = i4;
        this.f15016b = js1Var;
        this.f15017c = js1Var2;
        this.f15018d = js1Var3;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f15015a) {
            case 0:
                return new pq0((oq0) this.f15016b.a(), (dd0) this.f15017c.a(), (qd0) this.f15018d.a(), false, 24);
            case 1:
                return b();
            case 2:
                Context contextB = ((a10) this.f15016b).b();
                zw zwVar = (zw) this.f15017c.a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15018d.a();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new zl0(contextB, zwVar, scheduledExecutorService, exVar);
            case 3:
                qn0 el0Var = new el0(0, ((a10) ((gl0) this.f15016b).f11546a).b());
                qn0 qn0Var = (mm0) this.f15017c.a();
                if (true == ((List) this.f15018d.a()).contains("2")) {
                    el0Var = qn0Var;
                }
                al0.z(el0Var);
                return el0Var;
            case 4:
                ex exVar2 = fx.f11274a;
                al0.z(exVar2);
                nm0 nm0Var = new nm0(exVar2, 2);
                mm0 mm0Var = (mm0) this.f15016b.a();
                List list = (List) this.f15017c.a();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f15018d.a();
                if (list.contains("24")) {
                    return new jl0(mm0Var, ((Integer) va.s.f36163e.f36166c.a(sk.f16374vd)).intValue(), scheduledExecutorService2);
                }
                return new jl0(nm0Var, ((Integer) va.s.f36163e.f36166c.a(sk.f16374vd)).intValue(), scheduledExecutorService2);
            case 5:
                qn0 qn0VarA = ((fn0) this.f15016b).a();
                qn0 qn0Var2 = (mm0) this.f15017c.a();
                if (true == ((List) this.f15018d.a()).contains("29")) {
                    qn0VarA = qn0Var2;
                }
                al0.z(qn0VarA);
                return qn0VarA;
            case 6:
                return new v01((Context) this.f15016b.a(), (sx0) this.f15017c.a(), (v11) this.f15018d.a());
            case 7:
                return new u01((Context) this.f15016b.a(), (ExecutorService) this.f15017c.a(), (oy0) this.f15018d.a());
            default:
                return new u11((g21) this.f15017c.a(), ((sx0) this.f15018d.a()).M().B());
        }
    }

    public hl0 b() {
        ex exVar = fx.f11274a;
        al0.z(exVar);
        return new hl0(exVar, (ed0) this.f15016b.a(), (re0) this.f15017c.a(), (ul0) this.f15018d.a(), 1);
    }
}
