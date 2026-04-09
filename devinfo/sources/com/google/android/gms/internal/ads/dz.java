package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dz implements l91 {

    /* renamed from: a, reason: collision with root package name */
    public final t51 f10612a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10613b;

    /* renamed from: c, reason: collision with root package name */
    public final l91 f10614c;

    /* renamed from: d, reason: collision with root package name */
    public long f10615d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f10616e;

    public dz(t51 t51Var, int i4, l91 l91Var) {
        this.f10612a = t51Var;
        this.f10613b = i4;
        this.f10614c = l91Var;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Map A1() {
        return z51.g;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final long a(gb1 gb1Var) {
        gb1 gb1Var2;
        gb1 gb1Var3;
        gb1 gb1Var4;
        Uri uri = gb1Var.f11479a;
        long j = gb1Var.f11482d;
        this.f10616e = uri;
        long j8 = gb1Var.f11481c;
        long j9 = this.f10613b;
        if (j8 >= j9) {
            gb1Var2 = null;
        } else {
            long jMin = j9 - j8;
            if (j != -1) {
                jMin = Math.min(j, jMin);
            }
            gb1Var2 = new gb1(uri, j8, jMin);
        }
        if (j == -1 || j8 + j > j9) {
            gb1Var3 = gb1Var2;
            gb1Var4 = new gb1(uri, Math.max(j9, j8), j != -1 ? Math.min(j, (j8 + j) - j9) : -1L);
        } else {
            gb1Var3 = gb1Var2;
            gb1Var4 = null;
        }
        long jA = gb1Var3 != null ? this.f10612a.a(gb1Var3) : 0L;
        long jA2 = gb1Var4 != null ? this.f10614c.a(gb1Var4) : 0L;
        this.f10615d = j8;
        if (jA == -1 || jA2 == -1) {
            return -1L;
        }
        return jA + jA2;
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final int d(int i4, int i10, byte[] bArr) {
        int i11;
        long j = this.f10615d;
        long j8 = this.f10613b;
        if (j < j8) {
            int iD = this.f10612a.d(i4, (int) Math.min(i10, j8 - j), bArr);
            long j9 = this.f10615d + iD;
            this.f10615d = j9;
            i11 = iD;
            j = j9;
        } else {
            i11 = 0;
        }
        if (j < j8) {
            return i11;
        }
        int iD2 = this.f10614c.d(i4 + i11, i10 - i11, bArr);
        int i12 = i11 + iD2;
        this.f10615d += iD2;
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void f() {
        this.f10612a.f();
        this.f10614c.f();
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Uri zzc() {
        return this.f10616e;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void b(hm1 hm1Var) {
    }
}
