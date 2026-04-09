package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1265hQ implements XD {

    /* renamed from: a, reason: collision with root package name */
    public final XD f14494a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14495b;

    /* renamed from: c, reason: collision with root package name */
    public final DQ f14496c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14497d;

    /* renamed from: e, reason: collision with root package name */
    public int f14498e;

    public C1265hQ(XD xd, int i, DQ dq) {
        AbstractC0582Jp.m(i > 0);
        this.f14494a = xd;
        this.f14495b = i;
        this.f14496c = dq;
        this.f14497d = new byte[1];
        this.f14498e = i;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final long a(TE te) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void c(InterfaceC1958uK interfaceC1958uK) {
        interfaceC1958uK.getClass();
        this.f14494a.c(interfaceC1958uK);
    }

    @Override // com.google.android.gms.internal.ads.IN
    public final int d(int i, int i3, byte[] bArr) {
        int i6 = this.f14498e;
        XD xd = this.f14494a;
        if (i6 == 0) {
            int i7 = 0;
            byte[] bArr2 = this.f14497d;
            if (xd.d(0, 1, bArr2) != -1) {
                int i8 = (bArr2[0] & 255) << 4;
                if (i8 != 0) {
                    byte[] bArr3 = new byte[i8];
                    int i9 = i8;
                    while (i9 > 0) {
                        int iD = xd.d(i7, i9, bArr3);
                        if (iD != -1) {
                            i7 += iD;
                            i9 -= iD;
                        }
                    }
                    while (i8 > 0) {
                        int i10 = i8 - 1;
                        if (bArr3[i10] != 0) {
                            break;
                        }
                        i8 = i10;
                    }
                    if (i8 > 0) {
                        C2036vr c2036vr = new C2036vr(bArr3, i8);
                        DQ dq = this.f14496c;
                        long jMax = !dq.f7779l ? dq.i : Math.max(dq.f7780m.y(true), dq.i);
                        int iB = c2036vr.B();
                        T0 t02 = dq.f7778k;
                        t02.getClass();
                        t02.a(iB, c2036vr);
                        t02.c(jMax, 1, iB, 0, null);
                        dq.f7779l = true;
                    }
                }
                i6 = this.f14495b;
                this.f14498e = i6;
            }
            return -1;
        }
        int iD2 = xd.d(i, Math.min(i6, i3), bArr);
        if (iD2 != -1) {
            this.f14498e -= iD2;
        }
        return iD2;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        return this.f14494a.f();
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Map h() {
        return this.f14494a.h();
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() {
        throw new UnsupportedOperationException();
    }
}
