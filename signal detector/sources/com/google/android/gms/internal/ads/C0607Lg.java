package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Lg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607Lg implements XD {

    /* renamed from: a, reason: collision with root package name */
    public final C1142fC f9728a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9729b;

    /* renamed from: c, reason: collision with root package name */
    public final XD f9730c;

    /* renamed from: d, reason: collision with root package name */
    public long f9731d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f9732e;

    public C0607Lg(C1142fC c1142fC, int i, XD xd) {
        this.f9728a = c1142fC;
        this.f9729b = i;
        this.f9730c = xd;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final long a(TE te) {
        TE te2;
        TE te3;
        TE te4;
        Uri uri = te.f11361a;
        long j6 = te.f11364d;
        this.f9732e = uri;
        long j7 = te.f11363c;
        long j8 = this.f9729b;
        if (j7 >= j8) {
            te2 = null;
        } else {
            long jMin = j8 - j7;
            if (j6 != -1) {
                jMin = Math.min(j6, jMin);
            }
            te2 = new TE(uri, j7, jMin);
        }
        if (j6 == -1 || j7 + j6 > j8) {
            te3 = te2;
            te4 = new TE(uri, Math.max(j8, j7), j6 != -1 ? Math.min(j6, (j7 + j6) - j8) : -1L);
        } else {
            te3 = te2;
            te4 = null;
        }
        long jA = te3 != null ? this.f9728a.a(te3) : 0L;
        long jA2 = te4 != null ? this.f9730c.a(te4) : 0L;
        this.f9731d = j7;
        if (jA == -1 || jA2 == -1) {
            return -1L;
        }
        return jA + jA2;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void c(InterfaceC1958uK interfaceC1958uK) {
    }

    @Override // com.google.android.gms.internal.ads.IN
    public final int d(int i, int i3, byte[] bArr) {
        int i6;
        long j6 = this.f9731d;
        long j7 = this.f9729b;
        if (j6 < j7) {
            int iD = this.f9728a.d(i, (int) Math.min(i3, j7 - j6), bArr);
            long j8 = this.f9731d + iD;
            this.f9731d = j8;
            i6 = iD;
            j6 = j8;
        } else {
            i6 = 0;
        }
        if (j6 < j7) {
            return i6;
        }
        int iD2 = this.f9730c.d(i + i6, i3 - i6, bArr);
        int i7 = i6 + iD2;
        this.f9731d += iD2;
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        return this.f9732e;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Map h() {
        return C1465lC.f15361g;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() {
        this.f9728a.m();
        this.f9730c.m();
    }
}
