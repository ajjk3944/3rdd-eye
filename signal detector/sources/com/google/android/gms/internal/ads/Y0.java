package com.google.android.gms.internal.ads;

import R.C0187n;
import java.util.List;

/* loaded from: classes.dex */
public final class Y0 implements InterfaceC1992v0 {

    /* renamed from: d, reason: collision with root package name */
    public final C1994v2 f12561d;

    /* renamed from: e, reason: collision with root package name */
    public int f12562e;

    /* renamed from: g, reason: collision with root package name */
    public Z0 f12564g;

    /* renamed from: j, reason: collision with root package name */
    public long f12566j;

    /* renamed from: k, reason: collision with root package name */
    public C0913b1 f12567k;

    /* renamed from: o, reason: collision with root package name */
    public int f12571o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12572p;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12560c = true;

    /* renamed from: a, reason: collision with root package name */
    public final C2036vr f12558a = new C2036vr(12);

    /* renamed from: b, reason: collision with root package name */
    public final C0187n f12559b = new C0187n();

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2100x0 f12563f = new C1994v2(16);
    public C0913b1[] i = new C0913b1[0];

    /* renamed from: m, reason: collision with root package name */
    public long f12569m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f12570n = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f12568l = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f12565h = -9223372036854775807L;

    public Y0(C1994v2 c1994v2) {
        this.f12561d = c1994v2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) {
        C2036vr c2036vr = this.f12558a;
        interfaceC2046w0.v(0, 12, c2036vr.f17354a);
        c2036vr.E(0);
        if (c2036vr.c() != 1179011410) {
            return false;
        }
        c2036vr.G(4);
        return c2036vr.c() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final List c() {
        JB jb = LB.f9635b;
        return C1197gC.f14227e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void e(InterfaceC2100x0 interfaceC2100x0) {
        this.f12562e = 0;
        if (this.f12560c) {
            interfaceC2100x0 = new A1.s(interfaceC2100x0, this.f12561d);
        }
        this.f12563f = interfaceC2100x0;
        this.f12566j = -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        this.f12566j = -1L;
        this.f12567k = null;
        for (C0913b1 c0913b1 : this.i) {
            if (c0913b1.f13292k == 0) {
                c0913b1.i = 0;
            } else {
                c0913b1.i = c0913b1.f13295n[Vt.q(c0913b1.f13294m, j6, true)];
            }
        }
        if (j6 == 0) {
            this.f12562e = this.i.length != 0 ? 3 : 0;
        } else {
            this.f12562e = 6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x03bf  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC2046w0 r31, com.google.android.gms.internal.ads.A0 r32) throws com.google.android.gms.internal.ads.P4, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Y0.g(com.google.android.gms.internal.ads.w0, com.google.android.gms.internal.ads.A0):int");
    }
}
