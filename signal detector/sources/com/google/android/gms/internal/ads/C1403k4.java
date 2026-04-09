package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.k4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1403k4 implements InterfaceC1349j4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2100x0 f15058a;

    /* renamed from: b, reason: collision with root package name */
    public final T0 f15059b;

    /* renamed from: c, reason: collision with root package name */
    public final C1401k2 f15060c;

    /* renamed from: d, reason: collision with root package name */
    public final TP f15061d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15062e;

    /* renamed from: f, reason: collision with root package name */
    public long f15063f;

    /* renamed from: g, reason: collision with root package name */
    public int f15064g;

    /* renamed from: h, reason: collision with root package name */
    public long f15065h;

    public C1403k4(InterfaceC2100x0 interfaceC2100x0, T0 t02, C1401k2 c1401k2, String str, int i) throws P4 {
        this.f15058a = interfaceC2100x0;
        this.f15059b = t02;
        this.f15060c = c1401k2;
        int i3 = c1401k2.f15053a;
        int i6 = c1401k2.f15054b;
        int i7 = c1401k2.f15056d * i3;
        int i8 = c1401k2.f15055c;
        int i9 = i7 / 8;
        if (i8 != i9) {
            throw P4.a(null, A.f.o(new StringBuilder(String.valueOf(i9).length() + 28 + String.valueOf(i8).length()), "Expected block size: ", i9, "; got: ", i8));
        }
        int i10 = i6 * i9;
        int i11 = i10 * 8;
        int iMax = Math.max(i9, i10 / 10);
        this.f15062e = iMax;
        C1855sP c1855sP = new C1855sP();
        c1855sP.d("audio/wav");
        c1855sP.e(str);
        c1855sP.f16728g = i11;
        c1855sP.f16729h = i11;
        c1855sP.f16733m = iMax;
        c1855sP.f16714D = i3;
        c1855sP.f16715E = i6;
        c1855sP.f16716F = i;
        this.f15061d = new TP(c1855sP);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1349j4
    public final void a(int i, long j6) {
        this.f15058a.A(new C1511m4(this.f15060c, 1, i, j6));
        this.f15059b.e(this.f15061d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1349j4
    public final boolean b(InterfaceC2046w0 interfaceC2046w0, long j6) {
        int i;
        int i3;
        long j7 = j6;
        while (j7 > 0 && (i = this.f15064g) < (i3 = this.f15062e)) {
            int iF = this.f15059b.f(interfaceC2046w0, (int) Math.min(i3 - i, j7), true);
            if (iF == -1) {
                j7 = 0;
            } else {
                this.f15064g += iF;
                j7 -= iF;
            }
        }
        int i6 = this.f15064g;
        int i7 = this.f15060c.f15055c;
        int i8 = i6 / i7;
        if (i8 > 0) {
            long jU = this.f15063f + Vt.u(this.f15065h, 1000000L, r2.f15054b, RoundingMode.DOWN);
            int i9 = i8 * i7;
            int i10 = this.f15064g - i9;
            this.f15059b.c(jU, 1, i9, i10, null);
            this.f15065h += i8;
            this.f15064g = i10;
        }
        return j7 <= 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1349j4
    public final void g(long j6) {
        this.f15063f = j6;
        this.f15064g = 0;
        this.f15065h = 0L;
    }
}
