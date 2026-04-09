package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public int f9208a;

    /* renamed from: b, reason: collision with root package name */
    public int f9209b;

    /* renamed from: c, reason: collision with root package name */
    public int f9210c;

    /* renamed from: d, reason: collision with root package name */
    public int f9211d;

    /* renamed from: e, reason: collision with root package name */
    public int f9212e;

    /* renamed from: f, reason: collision with root package name */
    public int f9213f;

    /* renamed from: g, reason: collision with root package name */
    public Object f9214g;

    public /* synthetic */ J0(ZO zo) {
        this.f9208a = zo.f12882a;
        this.f9209b = zo.f12883b;
        this.f9210c = zo.f12884c;
        this.f9211d = zo.f12885d;
        this.f9214g = zo.f12886e;
        this.f9212e = zo.f12887f;
        this.f9213f = zo.f12888g;
    }

    public boolean a(int i) {
        int i3;
        int i6;
        int i7;
        int i8;
        if ((i & (-2097152)) != -2097152 || (i3 = (i >>> 19) & 3) == 1 || (i6 = (i >>> 17) & 3) == 0 || (i7 = (i >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = i7 - 1;
        this.f9208a = i3;
        this.f9214g = AbstractC2022vd.f17289d[3 - i6];
        int i10 = AbstractC2022vd.f17290e[i8];
        this.f9210c = i10;
        if (i3 == 2) {
            i10 /= 2;
            this.f9210c = i10;
        } else if (i3 == 0) {
            i10 /= 4;
            this.f9210c = i10;
        }
        int i11 = (i >>> 9) & 1;
        int i12 = 1152;
        if (i6 != 1) {
            if (i6 != 2) {
                i12 = 384;
            }
        } else if (i3 != 3) {
            i12 = 576;
        }
        this.f9213f = i12;
        if (i6 == 3) {
            int i13 = i3 == 3 ? AbstractC2022vd.f17291f[i9] : AbstractC2022vd.f17292g[i9];
            this.f9212e = i13;
            this.f9209b = (((i13 * 12) / i10) + i11) * 4;
        } else {
            if (i3 == 3) {
                int i14 = i6 == 2 ? AbstractC2022vd.f17293h[i9] : AbstractC2022vd.i[i9];
                this.f9212e = i14;
                this.f9209b = ((i14 * 144) / i10) + i11;
            } else {
                int i15 = AbstractC2022vd.f17294j[i9];
                this.f9212e = i15;
                this.f9209b = (((i6 == 1 ? 72 : 144) * i15) / i10) + i11;
            }
        }
        this.f9211d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
