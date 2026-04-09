package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lq0 {

    /* renamed from: a, reason: collision with root package name */
    public final wp0 f13580a;

    /* renamed from: b, reason: collision with root package name */
    public final yp0 f13581b;

    /* renamed from: c, reason: collision with root package name */
    public final ct0 f13582c;

    /* renamed from: d, reason: collision with root package name */
    public final at0 f13583d;

    /* renamed from: e, reason: collision with root package name */
    public final bs0 f13584e;

    /* renamed from: f, reason: collision with root package name */
    public final t20 f13585f;

    public lq0(ct0 ct0Var, at0 at0Var, wp0 wp0Var, yp0 yp0Var, t20 t20Var, bs0 bs0Var) {
        this.f13580a = wp0Var;
        this.f13581b = yp0Var;
        this.f13582c = ct0Var;
        this.f13583d = at0Var;
        this.f13585f = t20Var;
        this.f13584e = bs0Var;
    }

    public final void a(ArrayList arrayList, d70 d70Var) {
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            String str = (String) obj;
            wp0 wp0Var = this.f13580a;
            if (wp0Var.f18088i0) {
                String str2 = this.f13581b.f18820b;
                at0 at0Var = this.f13583d;
                at0Var.getClass();
                ua.j.C.f35267k.getClass();
                sa saVar = new sa(str2, str, 2, System.currentTimeMillis());
                lh0 lh0Var = at0Var.f9410a;
                lh0Var.getClass();
                lh0Var.c(new ce1(lh0Var, false, saVar, 15));
            } else {
                bs0 bs0Var = this.f13584e;
                this.f13582c.b(str, wp0Var.f18117x0, bs0Var, d70Var);
            }
        }
    }

    public final void b(int i4, ArrayList arrayList) {
        vd.b bVarE;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16261ob)).booleanValue() && t20.b(str)) {
                bVarE = this.f13585f.a(str, va.r.g.f36161e);
            } else {
                bVarE = yo0.e(str);
            }
            t7.m mVar = new t7.m(this, i4, 9);
            bVarE.a(new q81(0, bVarE, mVar), fx.f11274a);
        }
    }
}
