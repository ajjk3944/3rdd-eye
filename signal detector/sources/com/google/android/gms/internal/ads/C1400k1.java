package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1400k1 implements InterfaceC1992v0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2036vr f15038a = new C2036vr(4);

    /* renamed from: b, reason: collision with root package name */
    public final C2036vr f15039b = new C2036vr(9);

    /* renamed from: c, reason: collision with root package name */
    public final C2036vr f15040c = new C2036vr(11);

    /* renamed from: d, reason: collision with root package name */
    public final C2036vr f15041d = new C2036vr();

    /* renamed from: e, reason: collision with root package name */
    public final C1454l1 f15042e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2100x0 f15043f;

    /* renamed from: g, reason: collision with root package name */
    public int f15044g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15045h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public int f15046j;

    /* renamed from: k, reason: collision with root package name */
    public int f15047k;

    /* renamed from: l, reason: collision with root package name */
    public int f15048l;

    /* renamed from: m, reason: collision with root package name */
    public long f15049m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15050n;

    /* renamed from: o, reason: collision with root package name */
    public C1346j1 f15051o;

    /* renamed from: p, reason: collision with root package name */
    public C1562n1 f15052p;

    public C1400k1() {
        C1454l1 c1454l1 = new C1454l1(new C1938u0());
        c1454l1.f15330c = -9223372036854775807L;
        c1454l1.f15331d = new long[0];
        c1454l1.f15332e = new long[0];
        this.f15042e = c1454l1;
        this.f15044g = 1;
    }

    public final C2036vr a(InterfaceC2046w0 interfaceC2046w0) {
        int i = this.f15048l;
        C2036vr c2036vr = this.f15041d;
        byte[] bArr = c2036vr.f17354a;
        if (i > bArr.length) {
            int length = bArr.length;
            c2036vr.z(0, new byte[Math.max(length + length, i)]);
        } else {
            c2036vr.E(0);
        }
        c2036vr.C(this.f15048l);
        interfaceC2046w0.s(0, this.f15048l, c2036vr.f17354a);
        return c2036vr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) throws EOFException, InterruptedIOException {
        C2036vr c2036vr = this.f15038a;
        C1776r0 c1776r0 = (C1776r0) interfaceC2046w0;
        c1776r0.y(c2036vr.f17354a, 0, 3, false);
        c2036vr.E(0);
        if (c2036vr.O() == 4607062) {
            c1776r0.y(c2036vr.f17354a, 0, 2, false);
            c2036vr.E(0);
            if ((c2036vr.L() & 250) == 0) {
                c1776r0.y(c2036vr.f17354a, 0, 4, false);
                c2036vr.E(0);
                int iB = c2036vr.b();
                ((C1776r0) interfaceC2046w0).f16447f = 0;
                c1776r0.e(iB, false);
                c1776r0.y(c2036vr.f17354a, 0, 4, false);
                c2036vr.E(0);
                if (c2036vr.b() == 0) {
                    return true;
                }
            }
        }
        return false;
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
        this.f15043f = interfaceC2100x0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        if (j6 == 0) {
            this.f15044g = 1;
            this.f15045h = false;
        } else {
            this.f15044g = 3;
        }
        this.f15046j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x039f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0290  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC2046w0 r32, com.google.android.gms.internal.ads.A0 r33) throws com.google.android.gms.internal.ads.P4, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1400k1.g(com.google.android.gms.internal.ads.w0, com.google.android.gms.internal.ads.A0):int");
    }
}
