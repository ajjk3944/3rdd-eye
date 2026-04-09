package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class O0 implements InterfaceC1992v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10117a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10118b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10119c;

    /* renamed from: d, reason: collision with root package name */
    public int f10120d;

    /* renamed from: e, reason: collision with root package name */
    public int f10121e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2100x0 f10122f;

    /* renamed from: g, reason: collision with root package name */
    public T0 f10123g;

    public O0(int i, int i3, String str) {
        this.f10117a = i;
        this.f10118b = i3;
        this.f10119c = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) {
        int i = this.f10118b;
        int i3 = this.f10117a;
        AbstractC0582Jp.h0((i3 == -1 || i == -1) ? false : true);
        C2036vr c2036vr = new C2036vr(i);
        ((C1776r0) interfaceC2046w0).y(c2036vr.f17354a, 0, i, false);
        return c2036vr.L() == i3;
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
        this.f10122f = interfaceC2100x0;
        T0 t0X = interfaceC2100x0.x(1024, 4);
        this.f10123g = t0X;
        C1855sP c1855sP = new C1855sP();
        String str = this.f10119c;
        c1855sP.d(str);
        c1855sP.e(str);
        t0X.e(new TP(c1855sP));
        this.f10122f.u();
        this.f10122f.A(new P0());
        this.f10121e = 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        if (j6 == 0 || this.f10121e == 1) {
            this.f10121e = 1;
            this.f10120d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final int g(InterfaceC2046w0 interfaceC2046w0, A0 a02) {
        int i = this.f10121e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        T0 t02 = this.f10123g;
        t02.getClass();
        int iF = t02.f(interfaceC2046w0, 1024, true);
        if (iF != -1) {
            this.f10120d += iF;
            return 0;
        }
        this.f10121e = 2;
        this.f10123g.c(0L, 1, this.f10120d, 0, null);
        this.f10120d = 0;
        return 0;
    }
}
