package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ez1 extends qx1 {

    /* renamed from: h, reason: collision with root package name */
    public final y81 f10932h;

    /* renamed from: i, reason: collision with root package name */
    public final dz1 f10933i;
    public final w5 j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10934k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10935l;

    /* renamed from: m, reason: collision with root package name */
    public long f10936m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10937n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10938o;

    /* renamed from: p, reason: collision with root package name */
    public hm1 f10939p;

    /* renamed from: q, reason: collision with root package name */
    public h5 f10940q;

    public /* synthetic */ ez1(h5 h5Var, y81 y81Var, dz1 dz1Var, w5 w5Var, int i4) {
        w5 w5Var2 = w5.f17897k;
        this.f10940q = h5Var;
        this.f10932h = y81Var;
        this.f10933i = dz1Var;
        this.j = w5Var2;
        this.f10934k = i4;
        this.f10935l = true;
        this.f10936m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final synchronized void a(h5 h5Var) {
        this.f10940q = h5Var;
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final void b(iy1 iy1Var) {
        bz1 bz1Var = (bz1) iy1Var;
        if (bz1Var.f9880v) {
            for (hz1 hz1Var : bz1Var.f9877s) {
                hz1Var.r();
                if (hz1Var.g != null) {
                    hz1Var.g = null;
                    hz1Var.f12046f = null;
                }
            }
        }
        pq0 pq0Var = bz1Var.j;
        q qVar = (q) pq0Var.f15074c;
        if (qVar != null) {
            qVar.a(true);
        }
        w wVar = (w) pq0Var.f15073b;
        wVar.execute(new s(0, bz1Var));
        ((ExecutorService) ((Executor) wVar.f17803b)).shutdown();
        bz1Var.f9873o.removeCallbacksAndMessages(null);
        bz1Var.f9874p = null;
        bz1Var.N = true;
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final iy1 c(jy1 jy1Var, i iVar, long j) {
        l91 l91VarMo168b = this.f10932h.mo168b();
        hm1 hm1Var = this.f10939p;
        if (hm1Var != null) {
            l91VarMo168b.b(hm1Var);
        }
        o2 o2Var = f().f11706b;
        o2Var.getClass();
        Uri uri = o2Var.f14513a;
        this.g.getClass();
        return new bz1(uri, l91VarMo168b, new av0((b2) this.f10933i.f10622a), this.j, new ce1(28, (CopyOnWriteArrayList) this.f15472d.f10095c, jy1Var), new l90((CopyOnWriteArrayList) this.f15471c.f13427c, jy1Var), this, iVar, this.f10934k, bq0.s(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final synchronized h5 f() {
        return this.f10940q;
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final void h(hm1 hm1Var) {
        this.f10939p = hm1Var;
        Looper.myLooper().getClass();
        this.g.getClass();
        t();
    }

    public final void s(long j, m2 m2Var, boolean z3) {
        if (j == -9223372036854775807L) {
            j = this.f10936m;
        }
        boolean zA = m2Var.a();
        if (!this.f10935l && this.f10936m == j && this.f10937n == zA && this.f10938o == z3) {
            return;
        }
        this.f10936m = j;
        this.f10937n = zA;
        this.f10938o = z3;
        this.f10935l = false;
        t();
    }

    public final void t() {
        long j = this.f10936m;
        boolean z3 = this.f10937n;
        boolean z10 = this.f10938o;
        h5 h5VarF = f();
        uh lz1Var = new lz1(j, j, z3, h5VarF, z10 ? h5VarF.f11707c : null);
        if (this.f10935l) {
            lz1Var = new cz1(lz1Var);
        }
        k(lz1Var);
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final void r() {
    }
}
