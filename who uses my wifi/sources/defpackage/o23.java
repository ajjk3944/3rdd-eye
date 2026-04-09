package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o23 extends h72 {
    public final Context f;
    public final th2 g;
    public final k83 h;
    public final uk1 i;
    public d32 j;

    public o23(th2 th2Var, Context context, String str) {
        k83 k83Var = new k83();
        this.h = k83Var;
        this.i = new uk1();
        this.g = th2Var;
        k83Var.c = str;
        this.f = context;
    }

    @Override // defpackage.x72
    public final void C0(vm0 vm0Var) {
        k83 k83Var = this.h;
        k83Var.k = vm0Var;
        if (vm0Var != null) {
            k83Var.e = vm0Var.f;
            k83Var.l = vm0Var.g;
        }
    }

    @Override // defpackage.x72
    public final void F0(z2 z2Var) {
        k83 k83Var = this.h;
        k83Var.j = z2Var;
        if (z2Var != null) {
            k83Var.e = z2Var.f;
        }
    }

    @Override // defpackage.x72
    public final void N2(pk2 pk2Var) {
        this.h.v = pk2Var;
    }

    @Override // defpackage.x72
    public final void Y1(x22 x22Var, xe4 xe4Var) {
        this.i.i = x22Var;
        this.h.b = xe4Var;
    }

    @Override // defpackage.x72
    public final a62 b() {
        uk1 uk1Var = this.i;
        uk1Var.getClass();
        yr2 yr2Var = new yr2(uk1Var);
        ArrayList arrayList = new ArrayList();
        if (yr2Var.c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (yr2Var.a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (yr2Var.b != null) {
            arrayList.add(Integer.toString(2));
        }
        bw0 bw0Var = yr2Var.f;
        if (!bw0Var.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (yr2Var.e != null) {
            arrayList.add(Integer.toString(7));
        }
        k83 k83Var = this.h;
        k83Var.f = arrayList;
        ArrayList arrayList2 = new ArrayList(bw0Var.h);
        for (int i = 0; i < bw0Var.h; i++) {
            arrayList2.add((String) bw0Var.f(i));
        }
        k83Var.g = arrayList2;
        if (k83Var.b == null) {
            k83Var.b = xe4.a();
        }
        return new p23(this.f, this.g, k83Var, yr2Var, this.j);
    }

    @Override // defpackage.x72
    public final void m1(String str, v22 v22Var, t22 t22Var) {
        uk1 uk1Var = this.i;
        ((bw0) uk1Var.k).put(str, v22Var);
        if (t22Var != null) {
            ((bw0) uk1Var.l).put(str, t22Var);
        }
    }

    @Override // defpackage.x72
    public final void m3(q22 q22Var) {
        this.i.g = q22Var;
    }

    @Override // defpackage.x72
    public final void q1(z22 z22Var) {
        this.i.h = z22Var;
    }

    @Override // defpackage.x72
    public final void u0(j52 j52Var) {
        this.i.j = j52Var;
    }

    @Override // defpackage.x72
    public final void v0(d32 d32Var) {
        this.j = d32Var;
    }

    @Override // defpackage.x72
    public final void v3(r22 r22Var) {
        this.i.f = r22Var;
    }

    @Override // defpackage.x72
    public final void w1(r12 r12Var) {
        this.h.h = r12Var;
    }

    @Override // defpackage.x72
    public final void x3(f52 f52Var) {
        k83 k83Var = this.h;
        k83Var.n = f52Var;
        k83Var.d = new ih3(false, true, false);
    }
}
