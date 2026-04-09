package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* loaded from: classes.dex */
public final class D3 implements InterfaceC1992v0 {

    /* renamed from: c, reason: collision with root package name */
    public final C2036vr f7720c;

    /* renamed from: d, reason: collision with root package name */
    public final C1443kr f7721d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2100x0 f7722e;

    /* renamed from: f, reason: collision with root package name */
    public long f7723f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7725h;
    public boolean i;

    /* renamed from: a, reason: collision with root package name */
    public final E3 f7718a = new E3(null, 0, "audio/mp4a-latm", true);

    /* renamed from: b, reason: collision with root package name */
    public final C2036vr f7719b = new C2036vr(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f7724g = -1;

    public D3() {
        C2036vr c2036vr = new C2036vr(10);
        this.f7720c = c2036vr;
        byte[] bArr = c2036vr.f17354a;
        this.f7721d = new C1443kr(bArr, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) throws EOFException, InterruptedIOException {
        C2036vr c2036vr;
        C1776r0 c1776r0;
        int i = 0;
        while (true) {
            c2036vr = this.f7720c;
            c1776r0 = (C1776r0) interfaceC2046w0;
            c1776r0.y(c2036vr.f17354a, 0, 10, false);
            c2036vr.E(0);
            if (c2036vr.O() != 4801587) {
                break;
            }
            c2036vr.G(3);
            int iG = c2036vr.g();
            i += iG + 10;
            c1776r0.e(iG, false);
        }
        C1776r0 c1776r02 = (C1776r0) interfaceC2046w0;
        c1776r02.f16447f = 0;
        c1776r0.e(i, false);
        if (this.f7724g == -1) {
            this.f7724g = i;
        }
        int i3 = 0;
        int i6 = 0;
        int i7 = i;
        do {
            c1776r0.y(c2036vr.f17354a, 0, 2, false);
            c2036vr.E(0);
            if ((c2036vr.L() & 65526) == 65520) {
                i3++;
                if (i3 >= 4 && i6 > 188) {
                    return true;
                }
                c1776r0.y(c2036vr.f17354a, 0, 4, false);
                C1443kr c1443kr = this.f7721d;
                c1443kr.d(14);
                int iH = c1443kr.h(13);
                if (iH <= 6) {
                    i7++;
                    c1776r02.f16447f = 0;
                    c1776r0.e(i7, false);
                } else {
                    c1776r0.e(iH - 6, false);
                    i6 += iH;
                }
            } else {
                i7++;
                c1776r02.f16447f = 0;
                c1776r0.e(i7, false);
            }
            i3 = 0;
            i6 = 0;
        } while (i7 - i < 8192);
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
        this.f7722e = interfaceC2100x0;
        this.f7718a.e(interfaceC2100x0, new C1189g4(LinearLayoutManager.INVALID_OFFSET, 0, 1));
        interfaceC2100x0.u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        this.f7725h = false;
        this.f7718a.a();
        this.f7723f = j7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final int g(InterfaceC2046w0 interfaceC2046w0, A0 a02) throws P4, EOFException, InterruptedIOException {
        this.f7722e.getClass();
        C2036vr c2036vr = this.f7719b;
        int iD = ((C1776r0) interfaceC2046w0).d(0, 2048, c2036vr.f17354a);
        if (!this.i) {
            this.f7722e.A(new B0(-9223372036854775807L, 0L));
            this.i = true;
        }
        if (iD == -1) {
            return -1;
        }
        c2036vr.E(0);
        c2036vr.C(iD);
        boolean z6 = this.f7725h;
        E3 e32 = this.f7718a;
        if (!z6) {
            e32.f7902u = this.f7723f;
            this.f7725h = true;
        }
        e32.d(c2036vr);
        return 0;
    }
}
