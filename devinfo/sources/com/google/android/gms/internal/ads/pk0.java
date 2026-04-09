package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pk0 extends va.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15029a;

    /* renamed from: b, reason: collision with root package name */
    public final k10 f15030b;

    /* renamed from: c, reason: collision with root package name */
    public final gq0 f15031c;

    /* renamed from: d, reason: collision with root package name */
    public final b7 f15032d;

    /* renamed from: e, reason: collision with root package name */
    public va.y f15033e;

    public pk0(k10 k10Var, Context context, String str) {
        gq0 gq0Var = new gq0();
        this.f15031c = gq0Var;
        this.f15032d = new b7();
        this.f15030b = k10Var;
        gq0Var.f11578c = str;
        this.f15029a = context;
    }

    @Override // va.h0
    public final void G2(qm qmVar) {
        this.f15031c.f11582h = qmVar;
    }

    @Override // va.h0
    public final void K3(ln lnVar) {
        this.f15032d.f9605a = lnVar;
    }

    @Override // va.h0
    public final void M3(op opVar) {
        gq0 gq0Var = this.f15031c;
        gq0Var.f11587n = opVar;
        gq0Var.f11579d = new va.x2(false, true, false);
    }

    @Override // va.h0
    public final void Q3(sn snVar, va.c3 c3Var) {
        this.f15032d.f9608d = snVar;
        this.f15031c.f11577b = c3Var;
    }

    @Override // va.h0
    public final void R2(String str, pn pnVar, nn nnVar) {
        b7 b7Var = this.f15032d;
        ((x.n0) b7Var.f9610f).put(str, pnVar);
        if (nnVar != null) {
            ((x.n0) b7Var.g).put(str, nnVar);
        }
    }

    @Override // va.h0
    public final va.e0 c() {
        b7 b7Var = this.f15032d;
        b7Var.getClass();
        ka0 ka0Var = new ka0(b7Var);
        ArrayList arrayList = new ArrayList();
        if (ka0Var.f13093c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (ka0Var.f13091a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (ka0Var.f13092b != null) {
            arrayList.add(Integer.toString(2));
        }
        x.n0 n0Var = ka0Var.f13096f;
        if (!n0Var.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (ka0Var.f13095e != null) {
            arrayList.add(Integer.toString(7));
        }
        gq0 gq0Var = this.f15031c;
        gq0Var.f11581f = arrayList;
        ArrayList arrayList2 = new ArrayList(n0Var.f36920c);
        for (int i4 = 0; i4 < n0Var.f36920c; i4++) {
            arrayList2.add((String) n0Var.f(i4));
        }
        gq0Var.g = arrayList2;
        if (gq0Var.f11577b == null) {
            gq0Var.f11577b = va.c3.a();
        }
        return new qk0(this.f15029a, this.f15030b, gq0Var, ka0Var, this.f15033e);
    }

    @Override // va.h0
    public final void o0(un unVar) {
        this.f15032d.f9607c = unVar;
    }

    @Override // va.h0
    public final void p0(sa.a aVar) {
        gq0 gq0Var = this.f15031c;
        gq0Var.j = aVar;
        if (aVar != null) {
            gq0Var.f11580e = aVar.f33510a;
        }
    }

    @Override // va.h0
    public final void q2(kn knVar) {
        this.f15032d.f9606b = knVar;
    }

    @Override // va.h0
    public final void s0(sp spVar) {
        this.f15032d.f9609e = spVar;
    }

    @Override // va.h0
    public final void s2(va.y yVar) {
        this.f15033e = yVar;
    }

    @Override // va.h0
    public final void w2(sa.e eVar) {
        gq0 gq0Var = this.f15031c;
        gq0Var.f11584k = eVar;
        if (eVar != null) {
            gq0Var.f11580e = eVar.f33517a;
            gq0Var.f11585l = eVar.f33518b;
        }
    }

    @Override // va.h0
    public final void z0(va.y0 y0Var) {
        this.f15031c.f11596w = y0Var;
    }
}
