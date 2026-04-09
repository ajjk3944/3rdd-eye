package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tt1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16948a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16949b;

    /* renamed from: c, reason: collision with root package name */
    public final iz1[] f16950c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16951d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16952e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16953f;
    public ut1 g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16954h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f16955i;
    public final pr1[] j;

    /* renamed from: k, reason: collision with root package name */
    public final b f16956k;

    /* renamed from: l, reason: collision with root package name */
    public final wj0 f16957l;

    /* renamed from: m, reason: collision with root package name */
    public tt1 f16958m;

    /* renamed from: n, reason: collision with root package name */
    public oz1 f16959n;

    /* renamed from: o, reason: collision with root package name */
    public g f16960o;

    /* renamed from: p, reason: collision with root package name */
    public long f16961p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.google.android.gms.internal.ads.sx1] */
    public tt1(pr1[] pr1VarArr, long j, b bVar, i iVar, wj0 wj0Var, ut1 ut1Var, g gVar) {
        this.j = pr1VarArr;
        this.f16961p = j;
        this.f16956k = bVar;
        this.f16957l = wj0Var;
        jy1 jy1Var = ut1Var.f17335a;
        this.f16949b = jy1Var.f12875a;
        this.g = ut1Var;
        this.f16959n = oz1.f14819d;
        this.f16960o = gVar;
        this.f16950c = new iz1[2];
        this.f16955i = new boolean[2];
        long j8 = ut1Var.f17336b;
        long j9 = ut1Var.f17338d;
        wj0Var.getClass();
        int i4 = ju1.f12837k;
        Pair pair = (Pair) jy1Var.f12875a;
        Object obj = pair.first;
        jy1 jy1VarA = jy1Var.a(pair.second);
        bu1 bu1Var = (bu1) ((HashMap) wj0Var.f18035e).get(obj);
        bu1Var.getClass();
        ((HashSet) wj0Var.f18037h).add(bu1Var);
        au1 au1Var = (au1) ((HashMap) wj0Var.g).get(bu1Var);
        if (au1Var != null) {
            au1Var.f9418a.o(au1Var.f9419b);
        }
        bu1Var.f9808c.add(jy1VarA);
        dy1 dy1VarC = bu1Var.f9806a.c(jy1VarA, iVar, j8);
        ((IdentityHashMap) wj0Var.f18034d).put(dy1VarC, bu1Var);
        wj0Var.n();
        this.f16948a = j9 != -9223372036854775807L ? new sx1(dy1VarC, j9) : dy1VarC;
    }

    public final long a() {
        return this.g.f17336b + this.f16961p;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.jz1, java.lang.Object] */
    public final boolean b() {
        if (this.f16952e) {
            return !this.f16953f || this.f16948a.C1() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean c() {
        if (this.f16952e) {
            return b() || d() - this.g.f17336b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.jz1, java.lang.Object] */
    public final long d() {
        if (!this.f16952e) {
            return this.g.f17336b;
        }
        long jC1 = this.f16953f ? this.f16948a.C1() : Long.MIN_VALUE;
        return jC1 == Long.MIN_VALUE ? this.g.f17339e : jC1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.iy1, java.lang.Object] */
    public final void e(uh uhVar) {
        this.f16952e = true;
        this.f16959n = this.f16948a.f();
        g gVarF = f(uhVar);
        ut1 ut1Var = this.g;
        long jMax = ut1Var.f17336b;
        long j = ut1Var.f17339e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jG = g(gVarF, jMax, false, new boolean[2]);
        long j8 = this.f16961p;
        ut1 ut1Var2 = this.g;
        this.f16961p = (ut1Var2.f17336b - jG) + j8;
        this.g = ut1Var2.a(jG);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.g f(com.google.android.gms.internal.ads.uh r34) {
        /*
            Method dump skipped, instructions count: 2115
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tt1.f(com.google.android.gms.internal.ads.uh):com.google.android.gms.internal.ads.g");
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.iy1, java.lang.Object] */
    public final long g(g gVar, long j, boolean z3, boolean[] zArr) {
        pr1[] pr1VarArr;
        int i4 = 0;
        while (true) {
            boolean z10 = true;
            if (i4 >= gVar.f11324a) {
                break;
            }
            if (z3 || !gVar.c(this.f16960o, i4)) {
                z10 = false;
            }
            this.f16955i[i4] = z10;
            i4++;
        }
        int i10 = 0;
        while (true) {
            pr1VarArr = this.j;
            if (i10 >= 2) {
                break;
            }
            pr1VarArr[i10].getClass();
            i10++;
        }
        l();
        this.f16960o = gVar;
        if (this.f16958m == null) {
            int i11 = 0;
            while (true) {
                g gVar2 = this.f16960o;
                if (i11 >= gVar2.f11324a) {
                    break;
                }
                gVar2.b(i11);
                d dVar = ((d[]) this.f16960o.f11326c)[i11];
                i11++;
            }
        }
        d[] dVarArr = (d[]) gVar.f11326c;
        ?? r52 = this.f16948a;
        boolean[] zArr2 = this.f16955i;
        iz1[] iz1VarArr = this.f16950c;
        long jB = r52.b(dVarArr, zArr2, iz1VarArr, zArr, j);
        for (int i12 = 0; i12 < 2; i12++) {
            pr1VarArr[i12].getClass();
        }
        this.f16953f = false;
        for (int i13 = 0; i13 < 2; i13++) {
            if (iz1VarArr[i13] != null) {
                mq0.c0(gVar.b(i13));
                pr1VarArr[i13].getClass();
                this.f16953f = true;
            } else {
                mq0.c0(dVarArr[i13] == null);
            }
        }
        return jB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.iy1, java.lang.Object] */
    public final void h() {
        l();
        ?? r02 = this.f16948a;
        try {
            boolean z3 = r02 instanceof sx1;
            wj0 wj0Var = this.f16957l;
            if (z3) {
                wj0Var.h(((sx1) r02).f16583a);
            } else {
                wj0Var.h(r02);
            }
        } catch (RuntimeException e2) {
            ls.H("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public final tt1 i() {
        return this.f16958m;
    }

    public final oz1 j() {
        return this.f16959n;
    }

    public final g k() {
        return this.f16960o;
    }

    public final void l() {
        if (this.f16958m != null) {
            return;
        }
        int i4 = 0;
        while (true) {
            g gVar = this.f16960o;
            if (i4 >= gVar.f11324a) {
                return;
            }
            gVar.b(i4);
            d dVar = ((d[]) this.f16960o.f11326c)[i4];
            i4++;
        }
    }
}
