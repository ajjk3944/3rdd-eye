package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1724q1 implements InterfaceC1992v0 {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2100x0 f16266b;

    /* renamed from: c, reason: collision with root package name */
    public int f16267c;

    /* renamed from: d, reason: collision with root package name */
    public int f16268d;

    /* renamed from: e, reason: collision with root package name */
    public int f16269e;

    /* renamed from: g, reason: collision with root package name */
    public C1831s1 f16271g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2046w0 f16272h;
    public U1.b i;

    /* renamed from: j, reason: collision with root package name */
    public C1940u2 f16273j;

    /* renamed from: a, reason: collision with root package name */
    public final C2036vr f16265a = new C2036vr(2);

    /* renamed from: f, reason: collision with root package name */
    public long f16270f = -1;

    public final void a() {
        InterfaceC2100x0 interfaceC2100x0 = this.f16266b;
        interfaceC2100x0.getClass();
        interfaceC2100x0.u();
        this.f16266b.A(new B0(-9223372036854775807L, 0L));
        this.f16267c = 6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) throws EOFException, InterruptedIOException {
        String strM;
        C1776r0 c1776r0 = (C1776r0) interfaceC2046w0;
        C2036vr c2036vr = this.f16265a;
        c2036vr.y(2);
        c1776r0.y(c2036vr.f17354a, 0, 2, false);
        if (c2036vr.L() == 65496) {
            while (true) {
                c2036vr.y(2);
                c1776r0.y(c2036vr.f17354a, 0, 2, false);
                int iL = c2036vr.L();
                this.f16268d = iL;
                if (iL == 65498) {
                    break;
                }
                c2036vr.y(2);
                c1776r0.v(0, 2, c2036vr.f17354a);
                int iL2 = c2036vr.L() - 2;
                if (iL2 < 0) {
                    break;
                }
                if (this.f16268d != 65505) {
                    ((C1776r0) interfaceC2046w0).e(iL2, false);
                } else {
                    c2036vr.y(iL2);
                    ((C1776r0) interfaceC2046w0).y(c2036vr.f17354a, 0, iL2, false);
                    if (Objects.equals(c2036vr.m(), "http://ns.adobe.com/xap/1.0/") && (strM = c2036vr.m()) != null) {
                        String[] strArr = AbstractC0709Rg.f10925h;
                        for (int i = 0; i < 4; i++) {
                            if (strM.contains(String.valueOf(strArr[i]).concat("=\"1\""))) {
                                return true;
                            }
                        }
                    }
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
        this.f16266b = interfaceC2100x0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        if (j6 == 0) {
            this.f16267c = 0;
            this.f16273j = null;
        } else if (this.f16267c == 5) {
            C1940u2 c1940u2 = this.f16273j;
            c1940u2.getClass();
            c1940u2.f(j6, j7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0186, code lost:
    
        r16 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026f  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC2046w0 r34, com.google.android.gms.internal.ads.A0 r35) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1724q1.g(com.google.android.gms.internal.ads.w0, com.google.android.gms.internal.ads.A0):int");
    }
}
