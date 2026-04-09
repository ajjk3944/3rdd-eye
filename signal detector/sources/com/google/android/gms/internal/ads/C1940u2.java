package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1940u2 implements InterfaceC1992v0 {

    /* renamed from: a, reason: collision with root package name */
    public final R2 f17018a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17019b;

    /* renamed from: c, reason: collision with root package name */
    public final C2036vr f17020c;

    /* renamed from: d, reason: collision with root package name */
    public final C2036vr f17021d;

    /* renamed from: e, reason: collision with root package name */
    public final C2036vr f17022e;

    /* renamed from: f, reason: collision with root package name */
    public final C2036vr f17023f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f17024g;

    /* renamed from: h, reason: collision with root package name */
    public final C2156y2 f17025h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public C1197gC f17026j;

    /* renamed from: k, reason: collision with root package name */
    public int f17027k;

    /* renamed from: l, reason: collision with root package name */
    public int f17028l;

    /* renamed from: m, reason: collision with root package name */
    public long f17029m;

    /* renamed from: n, reason: collision with root package name */
    public int f17030n;

    /* renamed from: o, reason: collision with root package name */
    public C2036vr f17031o;

    /* renamed from: p, reason: collision with root package name */
    public int f17032p;

    /* renamed from: q, reason: collision with root package name */
    public int f17033q;

    /* renamed from: r, reason: collision with root package name */
    public int f17034r;

    /* renamed from: s, reason: collision with root package name */
    public int f17035s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17036t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17037u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC2100x0 f17038v;

    /* renamed from: w, reason: collision with root package name */
    public C1886t2[] f17039w;

    /* renamed from: x, reason: collision with root package name */
    public long[][] f17040x;

    /* renamed from: y, reason: collision with root package name */
    public int f17041y;

    public C1940u2() {
        this(R2.f10828B, 16);
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
    public final void a(long r42) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1940u2.a(long):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) {
        C1197gC c1197gCI;
        Q0 q0P = AbstractC1114el.p(interfaceC2046w0, false, false);
        if (q0P != null) {
            c1197gCI = LB.i(q0P);
        } else {
            JB jb = LB.f9635b;
            c1197gCI = C1197gC.f14227e;
        }
        this.f17026j = c1197gCI;
        return q0P == null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final /* synthetic */ List c() {
        return this.f17026j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void e(InterfaceC2100x0 interfaceC2100x0) {
        if ((this.f17019b & 16) == 0) {
            interfaceC2100x0 = new A1.s(interfaceC2100x0, this.f17018a);
        }
        this.f17038v = interfaceC2100x0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        this.f17024g.clear();
        this.f17030n = 0;
        this.f17032p = -1;
        this.f17033q = 0;
        this.f17034r = 0;
        this.f17035s = 0;
        this.f17036t = false;
        if (j6 == 0) {
            if (this.f17027k != 3) {
                this.f17027k = 0;
                this.f17030n = 0;
                return;
            } else {
                C2156y2 c2156y2 = this.f17025h;
                c2156y2.f17668a.clear();
                c2156y2.f17669b = 0;
                this.i.clear();
                return;
            }
        }
        for (C1886t2 c1886t2 : this.f17039w) {
            C2 c22 = c1886t2.f16839b;
            int iA = c22.a(j7);
            if (iA == -1) {
                iA = c22.b(j7);
            }
            c1886t2.f16842e = iA;
            U0 u02 = c1886t2.f16841d;
            if (u02 != null) {
                u02.f11532b = false;
                u02.f11533c = 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x039b A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC2046w0 r40, com.google.android.gms.internal.ads.A0 r41) throws com.google.android.gms.internal.ads.P4, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1940u2.g(com.google.android.gms.internal.ads.w0, com.google.android.gms.internal.ads.A0):int");
    }

    public C1940u2(R2 r22, int i) {
        this.f17018a = r22;
        this.f17019b = i;
        JB jb = LB.f9635b;
        this.f17026j = C1197gC.f14227e;
        this.f17027k = 0;
        this.f17025h = new C2156y2();
        this.i = new ArrayList();
        this.f17023f = new C2036vr(16);
        this.f17024g = new ArrayDeque();
        this.f17020c = new C2036vr(AbstractC2022vd.f17310z);
        this.f17021d = new C2036vr(6);
        this.f17022e = new C2036vr();
        this.f17032p = -1;
        this.f17038v = InterfaceC2100x0.f17531A;
        this.f17039w = new C1886t2[0];
    }
}
