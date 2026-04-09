package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Comparator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c02 extends b02 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9895e;

    /* renamed from: f, reason: collision with root package name */
    public final wz1 f9896f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9897h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f9898i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9899k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9900l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9901m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9902n;

    /* renamed from: o, reason: collision with root package name */
    public final int f9903o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9904p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f9905q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9906r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9907s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f9908t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f9909u;

    /* renamed from: v, reason: collision with root package name */
    public final int f9910v;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c02(int r8, com.google.android.gms.internal.ads.ii r9, int r10, com.google.android.gms.internal.ads.wz1 r11, int r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c02.<init>(int, com.google.android.gms.internal.ads.ii, int, com.google.android.gms.internal.ads.wz1, int, java.lang.String, boolean):void");
    }

    public static int c(c02 c02Var, c02 c02Var2) {
        q41 q41VarD = q41.f15203a.d(c02Var.f9897h, c02Var2.f9897h);
        Integer numValueOf = Integer.valueOf(c02Var.f9901m);
        Integer numValueOf2 = Integer.valueOf(c02Var2.f9901m);
        r51 r51Var = r51.f15552c;
        q41 q41VarA = q41VarD.a(numValueOf, numValueOf2, r51Var).b(c02Var.f9902n, c02Var2.f9902n).b(c02Var.f9903o, c02Var2.f9903o).a(Integer.valueOf(c02Var.f9904p), Integer.valueOf(c02Var2.f9904p), r51Var).d(c02Var.f9905q, c02Var2.f9905q).b(c02Var.f9906r, c02Var2.f9906r).d(c02Var.f9898i, c02Var2.f9898i).d(c02Var.f9895e, c02Var2.f9895e).d(c02Var.g, c02Var2.g).a(Integer.valueOf(c02Var.f9900l), Integer.valueOf(c02Var2.f9900l), r51Var);
        boolean z3 = c02Var.f9908t;
        q41 q41VarD2 = q41VarA.d(z3, c02Var2.f9908t);
        boolean z10 = c02Var.f9909u;
        q41 q41VarD3 = q41VarD2.d(z10, c02Var2.f9909u);
        if (z3 && z10) {
            q41VarD3 = q41VarD3.b(c02Var.f9910v, c02Var2.f9910v);
        }
        return q41VarD3.e();
    }

    public static int d(c02 c02Var, c02 c02Var2) {
        Comparator b61Var = (c02Var.f9895e && c02Var.f9897h) ? b.f9505k : new b61();
        c02Var.f9896f.getClass();
        return o41.f(b61Var.compare(Integer.valueOf(c02Var.f9899k), Integer.valueOf(c02Var2.f9899k))).a(Integer.valueOf(c02Var.j), Integer.valueOf(c02Var2.j), b61Var).e();
    }

    @Override // com.google.android.gms.internal.ads.b02
    public final int a() {
        return this.f9907s;
    }

    @Override // com.google.android.gms.internal.ads.b02
    public final /* bridge */ /* synthetic */ boolean b(b02 b02Var) {
        c02 c02Var = (c02) b02Var;
        if (!Objects.equals(this.f9532d.f14052m, c02Var.f9532d.f14052m)) {
            return false;
        }
        this.f9896f.getClass();
        return this.f9908t == c02Var.f9908t && this.f9909u == c02Var.f9909u;
    }
}
