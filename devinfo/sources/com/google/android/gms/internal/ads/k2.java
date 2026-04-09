package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12983a;

    /* renamed from: b, reason: collision with root package name */
    public int f12984b;

    /* renamed from: c, reason: collision with root package name */
    public int f12985c;

    /* renamed from: d, reason: collision with root package name */
    public int f12986d;

    /* renamed from: e, reason: collision with root package name */
    public int f12987e;

    /* renamed from: f, reason: collision with root package name */
    public int f12988f;
    public Object g;

    public /* synthetic */ k2(pv1 pv1Var) {
        this.f12983a = pv1Var.f15119a;
        this.f12984b = pv1Var.f15120b;
        this.f12985c = pv1Var.f15121c;
        this.f12986d = pv1Var.f15122d;
        this.g = pv1Var.f15123e;
        this.f12987e = pv1Var.f15124f;
        this.f12988f = pv1Var.g;
    }

    public boolean a(int i4) {
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i4 & (-2097152)) != -2097152 || (i10 = (i4 >>> 19) & 3) == 1 || (i11 = (i4 >>> 17) & 3) == 0 || (i12 = (i4 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i4 >>> 10) & 3) == 3) {
            return false;
        }
        int i14 = i12 - 1;
        this.f12983a = i10;
        this.g = ls.f13588d[3 - i11];
        int i15 = ls.f13589e[i13];
        this.f12985c = i15;
        if (i10 == 2) {
            i15 /= 2;
            this.f12985c = i15;
        } else if (i10 == 0) {
            i15 /= 4;
            this.f12985c = i15;
        }
        int i16 = (i4 >>> 9) & 1;
        int i17 = 1152;
        if (i11 != 1) {
            if (i11 != 2) {
                i17 = 384;
            }
        } else if (i10 != 3) {
            i17 = 576;
        }
        this.f12988f = i17;
        if (i11 == 3) {
            int i18 = i10 == 3 ? ls.f13590f[i14] : ls.g[i14];
            this.f12987e = i18;
            this.f12984b = (((i18 * 12) / i15) + i16) * 4;
        } else {
            if (i10 == 3) {
                int i19 = i11 == 2 ? ls.f13591h[i14] : ls.f13592i[i14];
                this.f12987e = i19;
                this.f12984b = ((i19 * 144) / i15) + i16;
            } else {
                int i20 = ls.j[i14];
                this.f12987e = i20;
                this.f12984b = (((i11 == 1 ? 72 : 144) * i20) / i15) + i16;
            }
        }
        this.f12986d = ((i4 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
