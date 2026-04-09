package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class by1 implements l91 {

    /* renamed from: a, reason: collision with root package name */
    public final l91 f9850a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9851b;

    /* renamed from: c, reason: collision with root package name */
    public final xy1 f9852c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9853d;

    /* renamed from: e, reason: collision with root package name */
    public int f9854e;

    public by1(l91 l91Var, int i4, xy1 xy1Var) {
        mq0.m(i4 > 0);
        this.f9850a = l91Var;
        this.f9851b = i4;
        this.f9852c = xy1Var;
        this.f9853d = new byte[1];
        this.f9854e = i4;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Map A1() {
        return this.f9850a.A1();
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final long a(gb1 gb1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void b(hm1 hm1Var) {
        hm1Var.getClass();
        this.f9850a.b(hm1Var);
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final int d(int i4, int i10, byte[] bArr) {
        int i11 = this.f9854e;
        l91 l91Var = this.f9850a;
        if (i11 == 0) {
            int i12 = 0;
            byte[] bArr2 = this.f9853d;
            if (l91Var.d(0, 1, bArr2) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int iD = l91Var.d(i12, i14, bArr3);
                        if (iD != -1) {
                            i12 += iD;
                            i14 -= iD;
                        }
                    }
                    while (i13 > 0) {
                        int i15 = i13 - 1;
                        if (bArr3[i15] != 0) {
                            break;
                        }
                        i13 = i15;
                    }
                    if (i13 > 0) {
                        sk0 sk0Var = new sk0(bArr3, i13);
                        xy1 xy1Var = this.f9852c;
                        long jMax = !xy1Var.f18582l ? xy1Var.f18580i : Math.max(xy1Var.f18583m.v(true), xy1Var.f18580i);
                        int iB = sk0Var.B();
                        u2 u2Var = xy1Var.f18581k;
                        u2Var.getClass();
                        u2Var.b(iB, sk0Var);
                        u2Var.d(jMax, 1, iB, 0, null);
                        xy1Var.f18582l = true;
                    }
                }
                i11 = this.f9851b;
                this.f9854e = i11;
            }
            return -1;
        }
        int iD2 = l91Var.d(i4, Math.min(i11, i10), bArr);
        if (iD2 != -1) {
            this.f9854e -= iD2;
        }
        return iD2;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void f() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Uri zzc() {
        return this.f9850a.zzc();
    }
}
