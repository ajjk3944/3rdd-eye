package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v5 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final r6 f17497a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17498b;

    /* renamed from: c, reason: collision with root package name */
    public final sk0 f17499c;

    /* renamed from: d, reason: collision with root package name */
    public final sk0 f17500d;

    /* renamed from: e, reason: collision with root package name */
    public final sk0 f17501e;

    /* renamed from: f, reason: collision with root package name */
    public final sk0 f17502f;
    public final ArrayDeque g;

    /* renamed from: h, reason: collision with root package name */
    public final z5 f17503h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f17504i;
    public u51 j;

    /* renamed from: k, reason: collision with root package name */
    public int f17505k;

    /* renamed from: l, reason: collision with root package name */
    public int f17506l;

    /* renamed from: m, reason: collision with root package name */
    public long f17507m;

    /* renamed from: n, reason: collision with root package name */
    public int f17508n;

    /* renamed from: o, reason: collision with root package name */
    public sk0 f17509o;

    /* renamed from: p, reason: collision with root package name */
    public int f17510p;

    /* renamed from: q, reason: collision with root package name */
    public int f17511q;

    /* renamed from: r, reason: collision with root package name */
    public int f17512r;

    /* renamed from: s, reason: collision with root package name */
    public int f17513s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17514t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17515u;

    /* renamed from: v, reason: collision with root package name */
    public z1 f17516v;

    /* renamed from: w, reason: collision with root package name */
    public u5[] f17517w;

    /* renamed from: x, reason: collision with root package name */
    public long[][] f17518x;

    /* renamed from: y, reason: collision with root package name */
    public int f17519y;

    public v5() {
        this(r6.I8, 16);
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final /* synthetic */ List a() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r42) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v5.b(long):void");
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) {
        u51 u51VarL;
        r2 r2VarR = a80.r(y1Var, false, false);
        if (r2VarR != null) {
            u51VarL = x41.l(r2VarR);
        } else {
            v41 v41Var = x41.f18307b;
            u51VarL = u51.f17096e;
        }
        this.j = u51VarL;
        return r2VarR == null;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        if ((this.f17498b & 16) == 0) {
            z1Var = new b5.i0(z1Var, this.f17497a);
        }
        this.f17516v = z1Var;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        this.g.clear();
        this.f17508n = 0;
        this.f17510p = -1;
        this.f17511q = 0;
        this.f17512r = 0;
        this.f17513s = 0;
        this.f17514t = false;
        if (j == 0) {
            if (this.f17505k != 3) {
                this.f17505k = 0;
                this.f17508n = 0;
                return;
            } else {
                z5 z5Var = this.f17503h;
                z5Var.f19017a.clear();
                z5Var.f19018b = 0;
                this.f17504i.clear();
                return;
            }
        }
        for (u5 u5Var : this.f17517w) {
            d6 d6Var = u5Var.f17087b;
            int iA = d6Var.a(j8);
            if (iA == -1) {
                iA = d6Var.b(j8);
            }
            u5Var.f17090e = iA;
            v2 v2Var = u5Var.f17089d;
            if (v2Var != null) {
                v2Var.f17431b = false;
                v2Var.f17432c = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x05aa, code lost:
    
        throw com.google.android.gms.internal.ads.ua.b("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x02af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x038c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.y1 r38, com.google.android.gms.internal.ads.c2 r39) throws java.lang.NumberFormatException, com.google.android.gms.internal.ads.ua {
        /*
            Method dump skipped, instructions count: 1770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v5.g(com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.c2):int");
    }

    public v5(r6 r6Var, int i4) {
        this.f17497a = r6Var;
        this.f17498b = i4;
        v41 v41Var = x41.f18307b;
        this.j = u51.f17096e;
        this.f17505k = 0;
        this.f17503h = new z5();
        this.f17504i = new ArrayList();
        this.f17502f = new sk0(16);
        this.g = new ArrayDeque();
        this.f17499c = new sk0(ls.f13608z);
        this.f17500d = new sk0(6);
        this.f17501e = new sk0();
        this.f17510p = -1;
        this.f17516v = z1.H8;
        this.f17517w = new u5[0];
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
    }
}
